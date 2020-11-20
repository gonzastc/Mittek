package com.companyname.springapp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.companyname.springapp.business.repositories.PostulacionesRepository;
import com.companyname.springapp.business.services.PostulacionesManager;

@Controller
public class PostulacionesController {

	@Autowired
	private PostulacionesRepository postulacionesRepository;
	
	@Autowired
	private PostulacionesManager postulacionesManager;
}
