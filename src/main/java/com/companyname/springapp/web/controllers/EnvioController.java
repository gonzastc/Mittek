package com.companyname.springapp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.companyname.springapp.business.repositories.EnvioRepository;
import com.companyname.springapp.business.services.EnvioManager;

@Controller
public class EnvioController {

	@Autowired
	private EnvioRepository envioRepository;
	
	@Autowired
	private EnvioManager envioManager;

}
