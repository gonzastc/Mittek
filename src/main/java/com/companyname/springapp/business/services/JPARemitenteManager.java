package com.companyname.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPARemitenteManager implements RemitenteManager {

	@Autowired
	private RemitenteManager remitenteManager;
	public JPARemitenteManager() {
		// TODO Auto-generated constructor stub
	}

}
