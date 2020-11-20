package com.companyname.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asociados")
public class Asociado {
	
	@Id
    @Column(name = "Dni")
	private Integer dni;
	
	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Apellido")
	private String apellido;
	
	@Column(name = "Telefono")
	private String telefono;
	
	@Column(name = "Email")
	private String mail;
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	 public String toString() {
	        StringBuffer buffer = new StringBuffer();
	        buffer.append("Dni: " + dni + ";");
	        buffer.append("Nombre: " + nombre + ";");
	        buffer.append("Apellido: " + apellido + ";");
	        buffer.append("Telefono: " + telefono + ";");
	        buffer.append("Mail: " + mail + ";");
	        return buffer.toString();
	    }

}
 