package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.TipoVehiculos;

public interface TipoVehiculoManager {
	public List<TipoVehiculos> getTipoVehiculos();
	
	public TipoVehiculos getTipoVehiculosById(Integer idTipoVehiculo);
	
	
}
