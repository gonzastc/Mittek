package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.companyname.springapp.business.entities.Libro;
import com.companyname.springapp.business.repositories.LibrosRepository;

@Service
public class JPALibrosManager implements LibrosManager {
	
	@Autowired
	private LibrosRepository librosRepository;
	
	public List<Libro> getLibros() {
		return (List<Libro>) librosRepository.findAll();
	}

	@Override
	public Libro getLibroById(int idLibro) {
		return (Libro) librosRepository.findById(idLibro).get(); 
	}

	@Override
	public void insertar(Libro libro) {
		librosRepository.save(libro);
	}

	public boolean deleteLibroById(Integer idLibro) {
		try {
			librosRepository.deleteById(idLibro);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
}
