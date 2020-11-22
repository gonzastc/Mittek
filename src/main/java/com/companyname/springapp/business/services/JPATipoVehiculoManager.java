package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.TipoVehiculos;
import com.companyname.springapp.business.repositories.TipoVehiculosRepository;


@Service
public class JPATipoVehiculoManager implements TipoVehiculoManager {

	@Autowired
	private TipoVehiculosRepository tipoVehiculoRepository;
	public JPATipoVehiculoManager() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<TipoVehiculos> getTipoVehiculos() {
		// TODO Auto-generated method stub
		return (List<TipoVehiculos>) tipoVehiculoRepository.findAll();
	}
	@Override
	public TipoVehiculos getTipoVehiculosById(Integer idTipoVehiculo) {
		// TODO Auto-generated method stub
		return (TipoVehiculos) tipoVehiculoRepository.findById(idTipoVehiculo).get();
	}

}
