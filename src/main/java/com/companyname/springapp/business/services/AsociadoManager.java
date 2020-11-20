package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.Asociado;


public interface AsociadoManager {

	public List<Asociado> getAsociados();
	
	void insertar(Asociado asociado);

	Asociado getAsociadoById(Integer dni);

	public boolean deleteAsociadoById(Integer dni);
		

	
	
}
