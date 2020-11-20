package com.companyname.springapp.business.services;

import java.util.List;
import com.companyname.springapp.business.entities.Libro;

public interface LibrosManager {
	
	public List<Libro> getLibros();

	public Libro getLibroById(int idLibro);

	void insertar(Libro libro);
	
	public boolean deleteLibroById(Integer idLibro);
}
