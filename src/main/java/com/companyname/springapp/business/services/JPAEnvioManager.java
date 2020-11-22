package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Envio;
import com.companyname.springapp.business.repositories.EnvioRepository;

@Service
public class JPAEnvioManager implements EnvioManager {

	@Autowired
	private EnvioRepository envioRepository;
	
	public JPAEnvioManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Envio> getEnvios() {
		return (List<Envio>) envioRepository.findAll();
	}

	@Override
	public void insertar(Envio envio) {
		envioRepository.save(envio);
		
	}

	@Override
	public Envio getEnvioById(Integer idEnvio) {
		// TODO Auto-generated method stub
		return (Envio) envioRepository.findById(idEnvio).get();
	}

}
