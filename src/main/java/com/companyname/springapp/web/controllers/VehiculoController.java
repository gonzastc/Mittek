package com.companyname.springapp.web.controllers;

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

import com.companyname.springapp.business.entities.Vehiculo;
import com.companyname.springapp.business.repositories.VehiculoRepository;
import com.companyname.springapp.business.services.TipoVehiculoManager;
import com.companyname.springapp.business.services.TransportistaManager;
import com.companyname.springapp.business.services.VehiculoManager;

@Controller
public class VehiculoController {
	
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Autowired
	private VehiculoManager vehiculoManager;
	
	@Autowired
	private TipoVehiculoManager tipoVehiculoManager;
	
	@Autowired
	private TransportistaManager transportistaManager;
	
	@RequestMapping(value = "/registrarVehiculo", method = RequestMethod.GET)
	public ModelAndView displayRegistrarVehiculoForm() {
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("tipoVehiculo", tipoVehiculoManager.getTipoVehiculos());
		myModel.put("transportistas", transportistaManager.getTransportista());
		return new ModelAndView("registrarVehiculo", "model", myModel);
	}
	
	@RequestMapping(value = "/registrarVehiculo", method = RequestMethod.POST)
	public ModelAndView registrarVehiculo(@RequestParam Map<String,String> allParams) {
		try {
			Vehiculo nuevoVehiculo = new Vehiculo();
			nuevoVehiculo.setMarca(allParams.get("marca"));
			nuevoVehiculo.setModelo(allParams.get("modelo"));
			
			nuevoVehiculo.setAnio(allParams.get("anio"));
			nuevoVehiculo.setColor(allParams.get("color"));
			
			
			nuevoVehiculo.setPatente(allParams.get("patente").toUpperCase());
			
			nuevoVehiculo.setTipoVehiculo(tipoVehiculoManager.getTipoVehiculosById(Integer.parseInt(allParams.get("tipoVehiculo"))));
			nuevoVehiculo.setTransportista(transportistaManager.getTransportistaById(Integer.parseInt(allParams.get("transportistas"))));

			if (!nuevoVehiculo.getMarca().equals("") ||
					!nuevoVehiculo.getModelo().equals("") ||
					!nuevoVehiculo.getAnio().equals("") ||
					!nuevoVehiculo.getColor().equals("") ||
					!nuevoVehiculo.getPatente().equals("")) {
			vehiculoManager.insertar(nuevoVehiculo);
			
			return new ModelAndView("vehiculoCorrecto");
			} else {
				return new ModelAndView("vehiculoIncorrecto");
			}
			
		}catch (Exception e) {
			return new ModelAndView("vehiculoIncorrecto");
		}
	}
	
	
}
