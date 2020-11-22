package com.companyname.springapp.business.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vehiculos")

public class Vehiculo {

	@Id
    @Column(name = "idVehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "native",strategy = "native")
	private Integer idVehiculo;
	
	@ManyToOne
	@JoinColumn(name = "idTipo_Vehiculo")
	private TipoVehiculos tipoVehiculo;
	
	
	@Column(name = "Marca")
	private String Marca;
	
	@Column(name = "Modelo")
	private String Modelo;
	
	@Column(name = "Color")
	private String Color;
	
	@Column(name = "Patente")
	private String Patente;
	
	@Column(name = "Anio")
	private String Anio;
	
	@ManyToOne
	@JoinColumn(name = "idTransportista")
	private Transportista transportista;
	
	
	
	public Integer getIdVehiculo() {
		return idVehiculo;
	}



	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}



	public TipoVehiculos getTipoVehiculo() {
		return tipoVehiculo;
	}



	public void setTipoVehiculo(TipoVehiculos tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}


	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}



	public String getModelo() {
		return Modelo;
	}



	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	public String getColor() {
		return Color;
	}



	public void setColor(String color) {
		Color = color;
	}



	public String getPatente() {
		return Patente;
	}



	public void setPatente(String patente) {
		Patente = patente;
	}



	public String getAnio() {
		return Anio;
	}



	public void setAnio(String anio) {
		Anio = anio;
	}







	public Transportista getTransportista() {
		return transportista;
	}



	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}



	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", tipoVehiculo=" + tipoVehiculo + ", Marca=" + Marca
				+ ", Modelo=" + Modelo + ", Color=" + Color + ", Patente=" + Patente + ", Anio=" + Anio
				+ ", transportista=" + transportista + "]";
	}



	public Vehiculo(Integer idVehiculo, TipoVehiculos tipoVehiculo, String marca, String modelo, String color,
			String patente, String anio, Transportista transportista) {
		super();
		this.idVehiculo = idVehiculo;
		this.tipoVehiculo = tipoVehiculo;
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Patente = patente;
		Anio = anio;
		this.transportista = transportista;
	}



	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

}
