package com.companyname.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cargas")

public class Cargas {

	@Id
    @Column(name = "idCarga")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCarga;
	
	
    @Column(name = "Alto")	
	private Integer Alto;
	
	
    @Column(name = "Ancho")		
	private Integer Ancho;
	
	
    @Column(name = "Largo")		
	private Integer Largo;
	
	
    @Column(name = "Peso")		
	private Integer Peso;
	
	
    @Column(name = "Descripcion")		
	private String Descripcion;
	
	
	
	public Integer getIdCarga() {
		return idCarga;
	}



	public void setIdCarga(Integer idCarga) {
		this.idCarga = idCarga;
	}



	public Integer getAlto() {
		return Alto;
	}



	public void setAlto(Integer alto) {
		Alto = alto;
	}



	public Integer getAncho() {
		return Ancho;
	}



	public void setAncho(Integer ancho) {
		Ancho = ancho;
	}



	public Integer getLargo() {
		return Largo;
	}



	public void setLargo(Integer largo) {
		Largo = largo;
	}



	public Integer getPeso() {
		return Peso;
	}



	public void setPeso(Integer peso) {
		Peso = peso;
	}



	public String getDescripcion() {
		return Descripcion;
	}



	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}



	public Cargas(Integer idCarga, Integer alto, Integer ancho, Integer largo, Integer peso, String descripcion) {
		super();
		this.idCarga = idCarga;
		Alto = alto;
		Ancho = ancho;
		Largo = largo;
		Peso = peso;
		Descripcion = descripcion;
	}



	@Override
	public String toString() {
		return "Cargas [idCarga=" + idCarga + ", Alto=" + Alto + ", Ancho=" + Ancho + ", Largo=" + Largo + ", Peso="
				+ Peso + ", Descripcion=" + Descripcion + "]";
	}



	public Cargas() {
		// TODO Auto-generated constructor stub
	}

}
