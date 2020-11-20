package com.companyname.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JPATipoVehiculoManager implements TipoVehiculoManager {

	@Autowired
	private TipoVehiculoManager tipoVehiculoManager;
	public JPATipoVehiculoManager() {
		// TODO Auto-generated constructor stub
	}

}
