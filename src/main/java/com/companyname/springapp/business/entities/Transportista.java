package com.companyname.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transportistas")


public class Transportista {

	@Id
    @Column(name = "idTransportista")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransportista;
	
	
    @Column(name = "Nombre")	
	private String Nombre;
	
	
    @Column(name = "Apellido")	
	private String Apellido;
	
	
    @Column(name = "CUIL")	
	private String CUIL;

	
    @Column(name = "Telefono")	
	private String Telefono;
	
	
    @Column(name = "Direccion")	
	private String Direccion;
	
	
    @Column(name = "Mail")	
	private String Mail;
	
	
	public Integer getIdTransportista() {
		return idTransportista;
	}


	public void setIdTransportista(Integer idTransportista) {
		this.idTransportista = idTransportista;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public String getCUIL() {
		return CUIL;
	}


	public void setCUIL(String cUIL) {
		CUIL = cUIL;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getMail() {
		return Mail;
	}


	public void setMail(String mail) {
		Mail = mail;
	}


	@Override
	public String toString() {
		return "Transportista [idTransportista=" + idTransportista + ", Nombre=" + Nombre + ", Apellido=" + Apellido
				+ ", CUIL=" + CUIL + ", Telefono=" + Telefono + ", Direccion=" + Direccion + ", Mail=" + Mail + "]";
	}

	

	public Transportista(Integer idTransportista, String nombre, String apellido, String cUIL, String telefono,
			String direccion, String mail) {
		super();
		this.idTransportista = idTransportista;
		Nombre = nombre;
		Apellido = apellido;
		CUIL = cUIL;
		Telefono = telefono;
		Direccion = direccion;
		Mail = mail;
	}


	public Transportista() {
		// TODO Auto-generated constructor stub
	}

}
