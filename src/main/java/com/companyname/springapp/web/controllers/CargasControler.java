package com.companyname.springapp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.companyname.springapp.business.repositories.CargasRepository;
import com.companyname.springapp.business.services.CargasManager;

@Controller
public class CargasControler {

	@Autowired
	private CargasRepository cargasRepository;
	
	@Autowired
	private CargasManager cargasManager;
	
	public CargasControler() {
		// TODO Auto-generated constructor stub
	}

}
