package com.companyname.springapp.business.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Asociado;
import com.companyname.springapp.business.entities.Prestamo;

import com.companyname.springapp.business.repositories.PrestamoRepository;

@Service
public class JPAPrestamoManager implements PrestamoManager {
	
	@Autowired
	private PrestamoRepository prestamoRepository;
	
	@Override
	public List<Prestamo> getPrestamos() {
		return (List<Prestamo>) prestamoRepository.findAll();
	}

	@Override
	public void insertar(Prestamo prestamo) {
		prestamoRepository.save(prestamo);	
	}

	@Override
	public List<Prestamo> getPrestamosVencidos() {
		
		List<Prestamo> results = new ArrayList<Prestamo>();
		Date now = new Date();
		
		//try {}catch(Exception e) {System.out.println("error"); e.printStackTrace();}
		
		getPrestamos().forEach(prestamo -> {
			if (prestamo.getFechaDevolucion()==null && ( 0 > prestamo.getFechaVencimiento().compareTo(now)))
				
				results.add(prestamo);
			
		});
		return results;
	}
	
	@Override
	public List<Prestamo> getPrestamosVigentes() {
		
		List<Prestamo> results = new ArrayList<Prestamo>();
		Date now = new Date();
		
		//try {}catch(Exception e) {System.out.println("error"); e.printStackTrace();}
		
		getPrestamos().forEach(prestamo -> {
			if (prestamo.getFechaDevolucion()==null && ( 0 < prestamo.getFechaVencimiento().compareTo(now)))
				
				results.add(prestamo);
			
		});
		return results;
	}

	@Override
	public Prestamo getPrestamoById(Integer idPrestamo) {
		return prestamoRepository.findById(idPrestamo).get();
	}

	@Override
	public List<Prestamo> getPrestamosDevueltos() {
		List<Prestamo> prestamos = getPrestamos();
		List<Prestamo> results = new ArrayList<Prestamo>();
		prestamos.forEach(prestamo -> {
			if (prestamo.getFechaDevolucion()!=null) {
				results.add(prestamo);
			}
		});
		return results;
	}

	@Override
	public boolean deletePrestamoById(Integer idPrestamo) {
		try {
			prestamoRepository.deleteById(idPrestamo);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
}
