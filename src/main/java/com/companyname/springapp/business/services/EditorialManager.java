package com.companyname.springapp.business.services;

import java.util.List;

import com.companyname.springapp.business.entities.Editorial;


public interface EditorialManager {

	public List<Editorial> getEditoriales();
	
	void insertar(Editorial editorial);

	Editorial getEditorialById(Integer idEditorial);

	public boolean deleteEditorialById(Integer idEditorial);
		

	
	
}
