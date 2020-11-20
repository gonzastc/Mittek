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

import com.companyname.springapp.business.entities.Editorial;
import com.companyname.springapp.business.repositories.EditorialRepository;
import com.companyname.springapp.business.services.EditorialManager;

@Controller
public class EditorialController {

	@Autowired
	private EditorialRepository editorialRepository;
	
	@Autowired
	private EditorialManager editorialManager; 
	
	
	@RequestMapping(value = "/addEditorial", method = RequestMethod.GET)
	public ModelAndView displayNewEditorialForm() {
		ModelAndView mv = new ModelAndView("addEditorial");
		mv.addObject("headerMessage", "Add Editorial Details");
		mv.addObject("editorial", new Editorial());
		return mv;
	}
	
	@RequestMapping(value = "/addEditorial", method = RequestMethod.POST)
	public ModelAndView guardar (@ModelAttribute Editorial editorial, BindingResult result) {
		ModelAndView mv = new ModelAndView ("redirect:/detEditorial");
		
		if (result.hasErrors()) {
			return new ModelAndView("error");
		}
		boolean isAdded = editorialRepository.save(editorial) != null;
		if (isAdded) {
			mv.addObject("message", "New user successfully added");
		} else {
			return new ModelAndView("error");
		}

		return mv;
		
	}
	
	//---------------------Editar un Editorial--------------------//
	
	@RequestMapping(value = "/editEditorial/{idEditorial}", method = RequestMethod.GET)
	public ModelAndView displayEditEditorial(@PathVariable Integer idEditorial) {
		ModelAndView mv = new ModelAndView("/editEditorial");
		Editorial editorial = editorialManager.getEditorialById(idEditorial);
		mv.addObject("headerMessage", "Edit User Details");
		mv.addObject("Editorial", editorial);
		return mv;
	}
	
	@RequestMapping(value = "/editEditorial/{idEditorial}", method = RequestMethod.POST)
	public ModelAndView saveEditedEditorial(@ModelAttribute Editorial editorial, BindingResult result) {
		ModelAndView mv = new ModelAndView("redirect:/detEditorial");

		if (result.hasErrors()) {
			return new ModelAndView("error");
		}
		boolean isAdded = editorialRepository.save(editorial) != null;
		if (isAdded) {
			mv.addObject("message", "New user successfully added");
		} else {
			return new ModelAndView("error");
		}

		return mv;
	}
	
	//-------------------------Eliminar Editorial----------------------------//

	@RequestMapping(value = "/deleteEditorial/{idEditorial}", method = RequestMethod.GET)
	public ModelAndView deleteEditorialById(@PathVariable Integer idEditorial) {
		boolean isDeleted = editorialManager.deleteEditorialById(idEditorial);
		System.out.println("User deletion respone: " + isDeleted);
		ModelAndView mv = new ModelAndView("redirect:/detEditorial");
		return mv;

	}
	
	//-------------------------Detalle Editorial----------------------------//
	@RequestMapping(value="/detEditorial")
    public ModelAndView handleRequest() {
    	  
  	  Map<String, Object> myModel = new HashMap<String, Object>(); 
  	  myModel.put("editoriales", this.editorialManager.getEditoriales());
  	  
  	  return new ModelAndView("detEditorial", "model", myModel); 
  	  
    
    }   	



}
	
