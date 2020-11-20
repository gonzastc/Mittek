package com.companyname.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPAPostulacionesManager implements PostulacionesManager {
	
	@Autowired
	private PostulacionesManager postulacionesManager;

	public JPAPostulacionesManager() {
		// TODO Auto-generated constructor stub
	}

}
