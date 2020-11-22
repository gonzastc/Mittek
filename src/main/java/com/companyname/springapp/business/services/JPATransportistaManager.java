package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Transportista;
import com.companyname.springapp.business.repositories.TransportistaRepository;

@Service
public class JPATransportistaManager implements TransportistaManager {

	@Autowired
	private TransportistaRepository transportistaRepository;
	public JPATransportistaManager() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Transportista> getTransportista() {
		// TODO Auto-generated method stub
		return (List<Transportista>) transportistaRepository.findAll();
	}
	@Override
	public void insertar(Transportista transportista) {
		// TODO Auto-generated method stub
		transportistaRepository.save(transportista);
	}
	@Override
	public Transportista getTransportistaById(Integer idTransportista) {
		// TODO Auto-generated method stub
		return (Transportista) transportistaRepository.findById(idTransportista).get();
	}

}
