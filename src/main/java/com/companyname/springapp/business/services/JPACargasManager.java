package com.companyname.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.repositories.CargasRepository;

@Service
public class JPACargasManager implements CargasManager {

	@Autowired
	private CargasRepository cargasRepository;
	
	public JPACargasManager() {
		// TODO Auto-generated constructor stub
	}

}
