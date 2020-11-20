package com.companyname.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="editoriales")
public class Editorial {
	@Id
    @Column(name = "idEditorial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEditorial;
	
	@Column(name = "Nombre")
	private String Nombre;
	
	
	public Integer getIdEditorial() {
		return idEditorial;
	}
	public void setIdEditorial(Integer idEditorial) {
		this.idEditorial = idEditorial;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Editorial(Integer idEditorial, String nombre) {
		super();
		this.idEditorial = idEditorial;
		Nombre = nombre;
	}
	public Editorial() {
		super();
	}
	
	
	
}
 