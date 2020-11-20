package com.companyname.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="postulaciones")

public class Postulaciones {

	@Id
    @Column(name = "idPostulacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPostulacion;
	
	@ManyToOne
	@JoinColumn(name = "id_Transportista")
	private Transportista transportista;
	
	@ManyToOne
	@JoinColumn(name = "id_Envio")	
	private Envio envio;
	
	
    @Column(name = "Tarifa")
	private float tarifa;
	
	public Integer getIdPostulacion() {
		return idPostulacion;
	}

	public void setIdPostulacion(Integer idPostulacion) {
		this.idPostulacion = idPostulacion;
	}

	public Transportista getTransportista() {
		return transportista;
	}

	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}

	public Envio getEnvio() {
		return envio;
	}

	public void setEnvio(Envio envio) {
		this.envio = envio;
	}

	public float getTarifa() {
		return tarifa;
	}

	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return "Postulaciones [idPostulacion=" + idPostulacion + ", transportista=" + transportista + ", envio=" + envio
				+ ", tarifa=" + tarifa + "]";
	}

	public Postulaciones(Integer idPostulacion, Transportista transportista, Envio envio, float tarifa) {
		super();
		this.idPostulacion = idPostulacion;
		this.transportista = transportista;
		this.envio = envio;
		this.tarifa = tarifa;
	}

	public Postulaciones() {
		// TODO Auto-generated constructor stub
	}

}
