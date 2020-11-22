package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.*;

public interface PostulacionesManager {
	public List<Postulaciones> getPostulaciones();
	
	void insertar (Postulaciones postulacion);

}
