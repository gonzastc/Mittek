/**
 * 
 */
package com.companyname.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="remitentes")

public class Remitente {

	@Id
    @Column(name = "idRemitente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRemitente;
	

    @Column(name = "Nombre")
	private String Nombre;
	
	
    @Column(name = "Apellido")	
	private String Apellido;
	
	
    @Column(name = "Nombre_empresa")	
	private String NombreEmpresa;
	
	
    @Column(name = "Telefono")	
	private String Telefono;
	
	
    @Column(name = "CUIT_CUIL")	
	private String CUIT;
	
	
    @Column(name = "Direccion")	
	private String Direccion;
	
	
    @Column(name = "Mail")	
	private String Mail;
	
	
	
	public Integer getIdRemitente() {
		return idRemitente;
	}



	public void setIdRemitente(Integer idRemitente) {
		this.idRemitente = idRemitente;
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



	public String getNombreEmpresa() {
		return NombreEmpresa;
	}



	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}



	public String getTelefono() {
		return Telefono;
	}



	public void setTelefono(String telefono) {
		Telefono = telefono;
	}



	public String getCUIT() {
		return CUIT;
	}



	public void setCUIT(String cUIT) {
		CUIT = cUIT;
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



	public Remitente(Integer idRemitente, String nombre, String apellido, String nombreEmpresa, String telefono,
			String cUIT, String direccion, String mail) {
		super();
		this.idRemitente = idRemitente;
		Nombre = nombre;
		Apellido = apellido;
		NombreEmpresa = nombreEmpresa;
		Telefono = telefono;
		CUIT = cUIT;
		Direccion = direccion;
		Mail = mail;
	}



	public void setMail(String mail) {
		Mail = mail;
	}

	

	@Override
	public String toString() {
		return "Remitente [idRemitente=" + idRemitente + ", Nombre=" + Nombre + ", Apellido=" + Apellido
				+ ", NombreEmpresa=" + NombreEmpresa + ", Telefono=" + Telefono + ", CUIT=" + CUIT + ", Direccion="
				+ Direccion + ", Mail=" + Mail + "]";
	}



	public Remitente() {
		// TODO Auto-generated constructor stub
	}

}
