package com.companyname.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipos_vehiculos")

public class TipoVehiculos {

	@Id
    @Column(name = "idTipo_vehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipo_vehiculo;
	
	
    @Column(name = "categoria")
	private String categoria;
	
	
    @Column(name = "peso_maximo")
	private float peso_maximo;
	
	
    @Column(name = "volumen_maximo")
	private float volumen_maximo;
	
	
	public Integer getIdTipo_vehiculo() {
		return idTipo_vehiculo;
	}


	public void setIdTipo_vehiculo(Integer idTipo_vehiculo) {
		this.idTipo_vehiculo = idTipo_vehiculo;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public float getPeso_maximo() {
		return peso_maximo;
	}


	public void setPeso_maximo(float peso_maximo) {
		this.peso_maximo = peso_maximo;
	}


	public float getVolumen_maximo() {
		return volumen_maximo;
	}


	public void setVolumen_maximo(float volumen_maximo) {
		this.volumen_maximo = volumen_maximo;
	}


	@Override
	public String toString() {
		return "TipoVehiculos [idTipo_vehiculo=" + idTipo_vehiculo + ", categoria=" + categoria + ", peso_maximo="
				+ peso_maximo + ", volumen_maximo=" + volumen_maximo + "]";
	}


	public TipoVehiculos(Integer idTipo_vehiculo, String categoria, float peso_maximo, float volumen_maximo) {
		super();
		this.idTipo_vehiculo = idTipo_vehiculo;
		this.categoria = categoria;
		this.peso_maximo = peso_maximo;
		this.volumen_maximo = volumen_maximo;
	}


	public TipoVehiculos() {
		// TODO Auto-generated constructor stub
	}

}
