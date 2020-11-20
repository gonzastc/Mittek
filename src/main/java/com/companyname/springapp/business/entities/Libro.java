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
@Table(name="libros")
public class Libro {
	
	@Id
    @Column(name = "idLibro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLibro;
	
	
	@Column(name = "Titulo")
	private String titulo;
	
	@Column(name = "Autor")
	private String autor;
	
	@Column(name = "Cantidad")
	private int cantidad;
	
	@ManyToOne
	@JoinColumn(name="idEditorial")
	private Editorial editorial;
	
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	public Integer getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Libro(Integer idLibro, String titulo, String autor, Editorial editorial, int cantidad) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.autor = autor;
		this.cantidad = cantidad;
	}
	
	public Libro() {
		super();
	}
	
	
	
	
	

}
