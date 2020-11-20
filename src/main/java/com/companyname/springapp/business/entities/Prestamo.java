package com.companyname.springapp.business.entities;

import java.text.Format;
import java.text.SimpleDateFormat;
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
@Table(name="prestamos")
public class Prestamo {
	@Id
    @Column(name = "idPrestamo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPrestamo;
	
	
	@ManyToOne
	@JoinColumn(name="idLibro")
	private Libro libro;
	
	
	@ManyToOne
	@JoinColumn(name="DniAsociado")
	private Asociado asociado; 
	
	@Column(name="fechaPrestamo")
	private Date fechaPrestamo; 
	
	@Column(name="fechaVencimiento")
	private Date fechaVencimiento;
	
	@Column(name="fechaDevolucion")
	private Date fechaDevolucion;
	
	
	
	public Integer getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Asociado getAsociado() {
		return asociado;
	}
	public void setAsociado(Asociado asociado) {
		this.asociado = asociado;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	
	public String getFechaPrestamoSH() {
		Format f = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate = f.format(fechaPrestamo);
	    return strDate;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	
	public String getFechaVencimientoSH() {
		Format f = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate = f.format(fechaVencimiento);
	    return strDate;
	}
	
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	
	public String getFechaDevolucionSH() {
		Format f = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate = f.format(fechaDevolucion);
	    return strDate;
	}
	
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public Prestamo(Integer idPrestamo, Libro libro, Asociado asociado, Date fechaPrestamo, Date fechaVencimiento,
			Date fechaDevolucion) {
		super();
		this.idPrestamo = idPrestamo;
		this.libro = libro;
		this.asociado = asociado;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaDevolucion = fechaDevolucion;
	}
	public Prestamo() {
		super();
	} 
	
		
	
}
