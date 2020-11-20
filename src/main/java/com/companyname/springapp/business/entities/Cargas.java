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
	private float Alto;
	
	
    @Column(name = "Ancho")		
	private float Ancho;
	
	
    @Column(name = "Largo")		
	private float Largo;
	
	
    @Column(name = "Peso")		
	private float Peso;
	
	
    @Column(name = "Descripcion")		
	private String Descripcion;
	
	
	
	public Integer getIdCarga() {
		return idCarga;
	}



	public void setIdCarga(Integer idCarga) {
		this.idCarga = idCarga;
	}



	public float getAlto() {
		return Alto;
	}



	public void setAlto(float alto) {
		Alto = alto;
	}



	public float getAncho() {
		return Ancho;
	}



	public void setAncho(float ancho) {
		Ancho = ancho;
	}



	public float getLargo() {
		return Largo;
	}



	public void setLargo(float largo) {
		Largo = largo;
	}



	public float getPeso() {
		return Peso;
	}



	public void setPeso(float peso) {
		Peso = peso;
	}



	public String getDescripcion() {
		return Descripcion;
	}



	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}



	public Cargas(Integer idCarga, float alto, float ancho, float largo, float peso, String descripcion) {
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
