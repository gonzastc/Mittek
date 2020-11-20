package com.companyname.springapp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.companyname.springapp.business.repositories.RemitenteRepository;
import com.companyname.springapp.business.services.RemitenteManager;

@Controller
public class RemitenteController {

	@Autowired
	private RemitenteRepository remitenteRepository;
	
	@Autowired
	private RemitenteManager remitenteManager;
}
