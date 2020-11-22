package com.companyname.springapp.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    
	@RequestMapping(value="/home")
	public ModelAndView handleRequest() {
		
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
}

