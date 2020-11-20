package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.springapp.business.entities.Asociado;
import com.companyname.springapp.business.repositories.AsociadoRepository;

@Service
public class JPAAsociadoManager implements AsociadoManager{

	@Autowired
	private AsociadoRepository asociadoRepository;
	
	/*
	 * public JPAAsociadoManager () {
	 * 
	 * }
	 * 
	 * @Autowired public JPAAsociadoManager(AsociadoRepository repository) {
	 * super(); this.asociadoRepository =repository;
	 * 
	 * }
	 */
	
	public List<Asociado> getAsociados() {
        return (List<Asociado>) asociadoRepository.findAll();
	}

	@Override
	public void insertar(Asociado asociado) {
		asociadoRepository.save(asociado);
		
	}

	@Override
	public Asociado getAsociadoById(Integer dni) {
		Asociado asociado = asociadoRepository.findById(dni).get();
		return asociado;
	}

	@Override
	public boolean deleteAsociadoById(Integer dni) {
		try {
			asociadoRepository.deleteById(dni);
			return true;
		}catch(Exception ex) {
			return false;
		}
		
	}
}

	

	

