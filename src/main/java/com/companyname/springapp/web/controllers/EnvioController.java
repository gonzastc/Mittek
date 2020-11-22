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
			Envio nuevoEnvio = new Envio();
			
			Cargas nuevaCarga = new Cargas();
			
			nuevaCarga.setAlto((Integer.parseInt(allParams.get("alto"))));
			nuevaCarga.setAncho((Integer.parseInt(allParams.get("ancho"))));
			nuevaCarga.setLargo((Integer.parseInt(allParams.get("largo"))));
			nuevaCarga.setPeso((Integer.parseInt(allParams.get("peso"))));
			
			nuevoEnvio.setRemitente(remitenteManager.getRemitenteById(Integer.parseInt(allParams.get("remitentes"))));
			nuevoEnvio.setCarga(nuevaCarga);
			nuevoEnvio.setOrigen(allParams.get("origen"));
			
			nuevoEnvio.setDestino(allParams.get("destino"));
			nuevoEnvio.setEstado("Nuevo");
			
		
		  Integer tarifaMinima = Integer.parseInt(allParams.get("Tarifa_minima")); 
		  nuevoEnvio.setTarifaMinima(tarifaMinima); 
			  
		  Integer tarifaMaxima = Integer.parseInt(allParams.get("Tarifa_maxima")); 		 
		  nuevoEnvio.setTarifaMaxima(tarifaMaxima);
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			

			
			Date fechaEntrega;
			fechaEntrega = df.parse(allParams.get("fechaDeEntrega"));
			nuevoEnvio.setFechaEntrega(fechaEntrega);

			Date fechaMinima;
			fechaMinima = df.parse(allParams.get("fechaMinimaOrigen"));
			nuevoEnvio.setMinimaOrigen(fechaMinima);
			
			//Fecha Máxima Origen
			Date fechaMaxima;
			fechaMaxima = df.parse(allParams.get("fechaMaximaOrigen"));
			nuevoEnvio.setMaximaOrigen(fechaMaxima);
			
			//Fecha Límite Transportista
			Date fechaTransportista;
			fechaTransportista = df.parse(allParams.get("fechaLimiteTransportista"));
			nuevoEnvio.setFechaLimiteTransportista(fechaTransportista);
			
			
			
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
