package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Envio;
import com.companyname.springapp.business.entities.Postulaciones;
import com.companyname.springapp.business.repositories.PostulacionesRepository;

@Service
public class JPAPostulacionesManager implements PostulacionesManager {
	
	@Autowired
	private PostulacionesRepository postulacionesRepository;

	public JPAPostulacionesManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Postulaciones> getPostulaciones() {
		// TODO Auto-generated method stub
		return (List<Postulaciones>)postulacionesRepository.findAll();
	}

	@Override
	public void insertar(Postulaciones postulacion) {
		// TODO Auto-generated method stub
		postulacionesRepository.save(postulacion);
	}

}
