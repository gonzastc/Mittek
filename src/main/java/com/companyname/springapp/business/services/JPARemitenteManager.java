package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Remitente;
import com.companyname.springapp.business.repositories.RemitenteRepository;

@Service
public class JPARemitenteManager implements RemitenteManager {

	@Autowired
	private RemitenteRepository remitenteRepository;
	public JPARemitenteManager() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Remitente> getRemitentes() {
		// TODO Auto-generated method stub
		return (List<Remitente>) remitenteRepository.findAll();
	}
	@Override
	public Remitente getRemitenteById(Integer idRemitente) {
		// TODO Auto-generated method stub
		return (Remitente) remitenteRepository.findById(idRemitente).get();
	}

}
