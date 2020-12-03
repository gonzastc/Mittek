package com.companyname.springapp.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.entities.Envio;
import com.companyname.springapp.business.entities.Postulaciones;
import com.companyname.springapp.business.repositories.PostulacionesRepository;
import com.companyname.springapp.business.services.*;

@Controller
public class PostulacionesController {

	@Autowired
	private PostulacionesRepository postulacionesRepository;
	
	@Autowired
	private PostulacionesManager postulacionesManager;
	
	@Autowired
	private TransportistaManager transportistaManager;
	
	@Autowired
	private EnvioManager envioManager;
	
	@RequestMapping(value = "/postularEnvio", method = RequestMethod.GET)
	public ModelAndView displayPostularEnvioForm() {
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("transportistas", transportistaManager.getTransportista());
		myModel.put("envios", envioManager.getEnvios());
		return new ModelAndView("postularEnvio", "model", myModel);
	}
	
	@RequestMapping(value = "/postularEnvio", method = RequestMethod.POST)
	public ModelAndView guardarPostulacion(@RequestParam Map<String,String> allParams) {
		try {
			Envio env = envioManager.getEnvioById(Integer.parseInt(allParams.get("envios")));
			Integer tarifa = Integer.parseInt(allParams.get("tarifa")); 
			if (tarifa < env.getTarifaMinima() ||
				tarifa > env.getTarifaMaxima()) {
				return new ModelAndView("modalTarifa");
			}
			Postulaciones nuevaPostulacion = new Postulaciones();
			nuevaPostulacion.setTransportista(transportistaManager.getTransportistaById(Integer.parseInt(allParams.get("transportistas"))));
			nuevaPostulacion.setEnvio(env);
			
			
			nuevaPostulacion.setTarifa(tarifa);
			
			postulacionesManager.insertar(nuevaPostulacion);
			
		   return new ModelAndView("postulacionCorrecta");
		}catch (Exception e) {
			return new ModelAndView("postulacionIncorrecta");
		}
	}

}
