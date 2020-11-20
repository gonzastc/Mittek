package com.companyname.springapp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.companyname.springapp.business.repositories.VehiculoRepository;
import com.companyname.springapp.business.services.VehiculoManager;

@Controller
public class VehiculoController {
	
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Autowired
	private VehiculoManager vehiculoManager;
}
