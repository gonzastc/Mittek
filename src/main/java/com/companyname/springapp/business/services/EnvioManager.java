package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.Envio;

public interface EnvioManager {
	public List<Envio> getEnvios();
	
	void insertar (Envio envio);
	
	public Envio getEnvioById(Integer idEnvio);
}
