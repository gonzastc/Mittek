package com.companyname.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPATransportistaManager implements TransportistaManager {

	@Autowired
	private TransportistaManager transportistaManager;
	public JPATransportistaManager() {
		// TODO Auto-generated constructor stub
	}

}
