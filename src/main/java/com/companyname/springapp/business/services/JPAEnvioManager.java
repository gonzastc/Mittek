package com.companyname.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPAEnvioManager implements EnvioManager {

	@Autowired
	private EnvioManager envioManager;
	
	public JPAEnvioManager() {
		// TODO Auto-generated constructor stub
	}

}
