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

@Entity
@Table(name="vehiculos")

public class Vehiculo {

	@Id
    @Column(name = "idVehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVehiculo;
	
	@ManyToOne
	@JoinColumn(name = "idTipo_Vehiculo")
	private TipoVehiculos tipoVehiculo;
	
	@ManyToOne
	@JoinColumn(name = "id_Transportista")
	private Transportista transportista;
	
	@Column(name = "Marca")
	private String Marca;
	
	@Column(name = "Modelo")
	private String Modelo;
	
	@Column(name = "Color")
	private String Color;
	
	@Column(name = "Patente")
	private String Patente;
	
	@Column(name = "Anio")
	private Date Anio;
	
	
	
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



	public Transportista getTransportista() {
		return transportista;
	}



	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
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



	public Date getAnio() {
		return Anio;
	}



	public void setAnio(Date anio) {
		Anio = anio;
	}



	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", tipoVehiculo=" + tipoVehiculo + ", transportista="
				+ transportista + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Patente="
				+ Patente + ", Anio=" + Anio + "]";
	}



	public Vehiculo(Integer idVehiculo, TipoVehiculos tipoVehiculo, Transportista transportista, String marca,
			String modelo, String color, String patente, Date anio) {
		super();
		this.idVehiculo = idVehiculo;
		this.tipoVehiculo = tipoVehiculo;
		this.transportista = transportista;
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Patente = patente;
		Anio = anio;
	}



	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

}
