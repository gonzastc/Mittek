package com.companyname.springapp.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.services.PrestamoManager;

@Controller
public class IndexController {
    
	/*
	 * @Autowired private PrestamoManager prestamoManager;
	 * 
	 * @RequestMapping(value="/home") public ModelAndView handleRequest() {
	 * 
	 * Map<String, Object> myModel = new HashMap<String, Object>();
	 * myModel.put("prestamosvencidos", prestamoManager.getPrestamosVencidos());
	 * myModel.put("prestamosvigentes", prestamoManager.getPrestamosVigentes());
	 * 
	 * return new ModelAndView("home", "model", myModel); }
	 */
    
    
	@RequestMapping(value="/home")
	public ModelAndView handleRequest() {
		
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
}

