package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Editorial;
import com.companyname.springapp.business.repositories.EditorialRepository;

@Service
public class JPAEditorialManager implements EditorialManager{

	@Autowired
	private EditorialRepository editorialRepository;
	
	/*
	 * public JPAAsociadoManager () {
	 * 
	 * }
	 * 
	 * @Autowired public JPAAsociadoManager(editorialRepository repository) {
	 * super(); this.editorialRepository =repository;
	 * 
	 * }
	 */
	
	public List<Editorial> getEditoriales() {
        return (List<Editorial>) editorialRepository.findAll();
	}

	@Override
	public void insertar(Editorial editorial) {
		editorialRepository.save(editorial);
		
	}

	@Override
	public Editorial getEditorialById(Integer idEditorial) {
		Editorial editorial = editorialRepository.findById(idEditorial).get();
		return editorial;
	}

	@Override
	public boolean deleteEditorialById(Integer idEditorial) {
		try {
			editorialRepository.deleteById(idEditorial);
			return true;
		}catch(Exception ex) {
			return false;
		}
		
	}

}

	

	

