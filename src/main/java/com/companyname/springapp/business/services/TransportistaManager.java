package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.*;

public interface TransportistaManager {

	public List<Transportista> getTransportista();
	
	void insertar (Transportista transportista);
	
	public Transportista getTransportistaById(Integer idTransportista);
	
}
