package com.companyname.springapp.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.entities.Libro;
import com.companyname.springapp.business.services.JPAEditorialManager;
import com.companyname.springapp.business.services.JPALibrosManager;

@Controller
public class LibrosController {
	
	
	protected final Log logger = LogFactory.getLog(getClass());
	@Autowired
    private JPALibrosManager librosmanager;
	@Autowired
    private JPAEditorialManager editorialmanager;
	
    
    @RequestMapping(value="/detLibros")
    public ModelAndView handleRequest() {
    	Map<String, Object> myModel = new HashMap<String, Object>();
    	myModel.put("libros", librosmanager.getLibros());
    	return new ModelAndView("detLibros", "model", myModel);
    }
    
    @RequestMapping(value="/addLibro",  method = RequestMethod.GET)
    public ModelAndView addLibro() {
    	Map<String, Object> myModel = new HashMap<String, Object>();
    	myModel.put("editoriales", editorialmanager.getEditoriales());
		return new ModelAndView("addLibro","model",myModel);    	
    }
    
    @RequestMapping(value="/addLibro", method = RequestMethod.POST)
    public ModelAndView addLibroSave(@RequestParam Map<String,String> allParams) {
    	Libro libro = new Libro();
    	libro.setTitulo(allParams.get("titulo"));
    	libro.setCantidad(Integer.parseInt(allParams.get("cantidad")));
    	libro.setAutor(allParams.get("autor"));
    	libro.setEditorial(editorialmanager.getEditorialById(Integer.parseInt(allParams.get("editorial"))));
    	librosmanager.insertar(libro);
    	
    	return new ModelAndView("redirect:/detLibros");
    }
    
    @RequestMapping(value = "/deleteLibro/{idLibro}", method = RequestMethod.GET)
	public ModelAndView deleteLibroById(@PathVariable Integer idLibro) {
		boolean isDeleted = librosmanager.deleteLibroById(idLibro);
		System.out.println("Eliminación de Libro: " + isDeleted);
		ModelAndView mv = new ModelAndView("redirect:/detLibros");
		return mv;
	}
    
    @RequestMapping(value = "/editLibro/{idLibro}", method = RequestMethod.GET)
	public ModelAndView displayEditLibro(@PathVariable Integer idLibro) {
		ModelAndView mv = new ModelAndView("/editLibro");
		Libro libro = librosmanager.getLibroById(idLibro);
		mv.addObject("libro", libro);
		mv.addObject("editoriales", editorialmanager.getEditoriales());
		return mv;
	}
    
    @RequestMapping(value = "/editLibro/{idLibro}", method = RequestMethod.POST)
   	public ModelAndView editLibro(@PathVariable Integer idLibro,@RequestParam Map<String,String> allParams) {
    	Libro libro = librosmanager.getLibroById(idLibro);
    	libro.setTitulo(allParams.get("titulo"));
    	libro.setCantidad(Integer.parseInt(allParams.get("cantidad")));
    	libro.setAutor(allParams.get("autor"));
    	libro.setEditorial(editorialmanager.getEditorialById(Integer.parseInt(allParams.get("editorial"))));
    	librosmanager.insertar(libro);
    	
    	return new ModelAndView("redirect:/detLibros");
   	}

}
