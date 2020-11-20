package com.companyname.springapp.web.controllers;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.entities.Asociado;
import com.companyname.springapp.business.repositories.AsociadoRepository;
import com.companyname.springapp.business.services.AsociadoManager;

@Controller
public class AsociadoController {

	@Autowired
	private AsociadoRepository asociadoRepository;
	
	@Autowired
	private AsociadoManager asociadoManager; 
	
	
//---------------------Agregar un asociado--------------------------------//
	
	@RequestMapping(value = "/addAsociado", method = RequestMethod.GET)
	public ModelAndView displayNewAsociadoForm() {
		ModelAndView mv = new ModelAndView("addAsociado");
		mv.addObject("headerMessage", "Add Asociado Details");
		mv.addObject("asociado", new Asociado());
		return mv;
	}
	
	@RequestMapping(value = "/addAsociado", method = RequestMethod.POST)
	public ModelAndView guardar (@ModelAttribute Asociado asociado, BindingResult result) {
		ModelAndView mv = new ModelAndView ("redirect:/detAsociado");
		
		if (result.hasErrors()) {
			return new ModelAndView("error");
		}
		boolean isAdded = asociadoRepository.save(asociado) != null;
		if (isAdded) {
			mv.addObject("message", "New user successfully added");
		} else {
			return new ModelAndView("error");
		}

		return mv;
		
	}
	
	//---------------------Editar un asociado--------------------------//
	
	@RequestMapping(value = "/editAsociado/{dni}", method = RequestMethod.GET)
	public ModelAndView displayEditAsociado(@PathVariable Integer dni) {
		ModelAndView mv = new ModelAndView("/editAsociado");
		Asociado asociado = asociadoManager.getAsociadoById(dni);
		mv.addObject("headerMessage", "Edit User Details");
		mv.addObject("asociado", asociado);
		return mv;
	}
	
	@RequestMapping(value = "/editAsociado/{dni}", method = RequestMethod.POST)
	public ModelAndView saveEditedAsociado(@ModelAttribute Asociado asociado, BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/detAsociado");

		if (result.hasErrors()) {
			return new ModelAndView("error");
		}
		boolean isAdded = asociadoRepository.save(asociado) != null;
		if (isAdded) {
			mv.addObject("message", "New user successfully added");
		} else {
			return new ModelAndView("error");
		}

		return mv;
	}
	
	//-------------------------Eliminar un asociado----------------------------//

	@RequestMapping(value = "/deleteAsociado/{dni}", method = RequestMethod.GET)
	public ModelAndView deleteAsociadoById(@PathVariable Integer dni) {
		boolean isDeleted = asociadoManager.deleteAsociadoById(dni);
		System.out.println("User deletion respone: " + isDeleted);
		ModelAndView mv = new ModelAndView("redirect:/detAsociado");
		return mv;

	}
	
	//-------------------------Detalle Asociado----------------------------//
	@RequestMapping(value="/detAsociado")
    public ModelAndView handleRequest() {
    	  
  	  Map<String, Object> myModel = new HashMap<String, Object>(); 
  	  myModel.put("asociados", this.asociadoManager.getAsociados());
  	  
  	  return new ModelAndView("detAsociado", "model", myModel); 
  	  
    
    }   	



}
	
