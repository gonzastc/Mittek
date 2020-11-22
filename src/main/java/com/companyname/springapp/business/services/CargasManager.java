package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.Cargas;

public interface CargasManager {
	public List<Cargas> getCargas();
	
	public Cargas getCargaById (Integer idCarga);
	
	public void insertar (Cargas carga);
}
