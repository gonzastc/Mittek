package com.companyname.springapp.web.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.entities.Cargas;
import com.companyname.springapp.business.entities.Envio;
import com.companyname.springapp.business.repositories.EnvioRepository;
import com.companyname.springapp.business.services.*;
import com.companyname.springapp.business.services.RemitenteManager;

@Controller
public class EnvioController {

	@Autowired
	private EnvioRepository envioRepository;
	
	@Autowired
	private EnvioManager envioManager;
	
	@Autowired
	private RemitenteManager remitenteManager;
	
	@Autowired
	private CargasManager cargasManager;
	
	// Esto devuelve un formulario para registrar un envío
	@RequestMapping(value = "/registrarEnvio", method = RequestMethod.GET)
	public ModelAndView displayRegistrarEnvioForm() {
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("remitentes", remitenteManager.getRemitentes());
		myModel.put("cargas", cargasManager.getCargas());
		return new ModelAndView("registrarEnvio", "model", myModel);
	}
	
	@RequestMapping(value = "/registrarEnvio", method = RequestMethod.POST)
	public ModelAndView guardarEnvio (@RequestParam Map<String,String> allParams) {
		try {
			Integer vAncho = (Integer.parseInt(allParams.get("ancho")));
			Integer vAlto = (Integer.parseInt(allParams.get("alto")));
			Integer vLargo = (Integer.parseInt(allParams.get("largo")));
			Integer vPeso = (Integer.parseInt(allParams.get("peso")));
			
			if (vAncho > 260 || vAncho <= 0 ||
				vAlto > 430 || vAlto <= 0 ||
				vLargo > 3025 || vLargo <= 0 ||
				vPeso > 26800 || vPeso <= 0) {
				return new ModelAndView("modalCarga");
			}
			
			Integer tarifaMinima = Integer.parseInt(allParams.get("Tarifa_minima"));
			Integer tarifaMaxima = Integer.parseInt(allParams.get("Tarifa_maxima"));
			
			if (tarifaMinima <= 0 || tarifaMinima > tarifaMaxima
				|| tarifaMaxima < tarifaMinima) {
				return new ModelAndView("modalTarifa");
			}
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaSistema = new Date();
			String strDate = df.format(fechaSistema);
			Date fechaEntrega = df.parse(allParams.get("fechaDeEntrega"));
			Date fechaMinima = df.parse(allParams.get("fechaMinimaOrigen"));
			Date fechaMaxima= df.parse(allParams.get("fechaMaximaOrigen"));
			Date fechaTransportista= df.parse(allParams.get("fechaLimiteTransportista"));
			
			if (fechaEntrega.equals(strDate) ||
			    fechaMinima.after(fechaEntrega) ||
			    fechaMaxima.after(fechaEntrega) ||
			    fechaMaxima.before(fechaMinima) ||
			    fechaTransportista.after(fechaEntrega)||
			    fechaTransportista.after(fechaMaxima))  {
				return new ModelAndView("modalFechas");
			}
			Envio nuevoEnvio = new Envio();

			Cargas nuevaCarga = new Cargas();
			
			
			nuevaCarga.setAlto(vAlto);
			nuevaCarga.setAncho(vAncho);
			nuevaCarga.setLargo(vLargo);
			nuevaCarga.setPeso(vPeso);
			
			nuevoEnvio.setRemitente(remitenteManager.getRemitenteById(Integer.parseInt(allParams.get("remitentes"))));
			nuevoEnvio.setCarga(nuevaCarga);
			nuevoEnvio.setOrigen(allParams.get("origen"));
			
			nuevoEnvio.setDestino(allParams.get("destino"));
			nuevoEnvio.setEstado("Nuevo");
			
		
			 
			nuevoEnvio.setTarifaMinima(tarifaMinima); 
			  
		  	 		 
		  	nuevoEnvio.setTarifaMaxima(tarifaMaxima);
			
			
			

			
			
			nuevoEnvio.setFechaEntrega(fechaEntrega);

			
			nuevoEnvio.setMinimaOrigen(fechaMinima);
			
			//Fecha Máxima Origen
			
			nuevoEnvio.setMaximaOrigen(fechaMaxima);
			
			//Fecha Límite Transportista
			
			nuevoEnvio.setFechaLimiteTransportista(fechaTransportista);
			
			if (nuevoEnvio.getOrigen().equals("")|| nuevoEnvio.getDestino().equals("")) {
				return new ModelAndView("modalOrigenDestino");
			}
			
			
			//Finalmente usamos el servicio insertar
			cargasManager.insertar(nuevaCarga);
			envioManager.insertar(nuevoEnvio);
			//y volvemos a home
			return new ModelAndView("solicitudCorrecta");
		} catch (Exception e) {
			return new ModelAndView("solicitudIncorrecta");
		}
			
		
		 
		
	}

}
