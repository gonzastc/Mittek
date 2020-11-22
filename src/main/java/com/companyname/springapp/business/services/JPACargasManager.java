package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Cargas;
import com.companyname.springapp.business.repositories.CargasRepository;

@Service
public class JPACargasManager implements CargasManager {

	@Autowired
	private CargasRepository cargasRepository;
	
	
	
	public JPACargasManager() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public List<Cargas> getCargas() {
		// TODO Auto-generated method stub
		return (List<Cargas>) cargasRepository.findAll();
	}



	@Override
	public Cargas getCargaById(Integer idCarga) {
		// TODO Auto-generated method stub
		return (Cargas) cargasRepository.findById(idCarga).get();
	}



	@Override
	public void insertar(Cargas carga) {
		// TODO Auto-generated method stub
		cargasRepository.save(carga);
	}

}
