package com.companyname.springapp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.companyname.springapp.business.repositories.TipoVehiculosRepository;
import com.companyname.springapp.business.services.TipoVehiculoManager;

@Controller
public class TipoVehiculoController {

	@Autowired
	private TipoVehiculosRepository tipoVehiculosRepository;

	@Autowired
	private TipoVehiculoManager tipoVehiculoManager;
	
	
}
