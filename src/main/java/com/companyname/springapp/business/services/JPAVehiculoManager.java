package com.companyname.springapp.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Vehiculo;
import com.companyname.springapp.business.repositories.VehiculoRepository;

@Service
public class JPAVehiculoManager implements VehiculoManager {

	@Autowired
	private VehiculoRepository vehiculoRepository;
	public JPAVehiculoManager() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		vehiculoRepository.save(vehiculo);
	}

}
