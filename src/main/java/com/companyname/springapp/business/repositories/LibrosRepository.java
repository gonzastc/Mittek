package com.companyname.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;

import com.companyname.springapp.business.entities.Libro;

public interface LibrosRepository extends CrudRepository<Libro, Integer> {

}
