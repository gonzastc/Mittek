package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.Prestamo;



public interface PrestamoManager {

	public List<Prestamo> getPrestamos();
	
	void insertar(Prestamo prestamo);

	public List<Prestamo> getPrestamosVencidos();
	
	public List<Prestamo> getPrestamosVigentes();

	public Prestamo getPrestamoById(Integer idPrestamo);

	public List<Prestamo> getPrestamosDevueltos();

	public boolean deletePrestamoById(Integer idPrestamo);
}
