package com.companyname.springapp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.companyname.springapp.business.repositories.TransportistaRepository;
import com.companyname.springapp.business.services.TransportistaManager;

@Controller
public class TransportistaController {
	
	@Autowired
	private TransportistaRepository transportistaRepository;

	@Autowired
	private TransportistaManager transportistaManager;
}
