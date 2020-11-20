package com.companyname.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPAVehiculoManager implements VehiculoManager {

	@Autowired
	private VehiculoManager vehiculoManager;
	public JPAVehiculoManager() {
		// TODO Auto-generated constructor stub
	}

}
