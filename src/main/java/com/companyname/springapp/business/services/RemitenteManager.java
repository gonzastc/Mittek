package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.Remitente;

public interface RemitenteManager {

	public List<Remitente> getRemitentes();
	
	public Remitente getRemitenteById (Integer idRemitente);
}
