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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="envios")

public class Envio {

	@Id
    @Column(name = "idEnvio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GenericGenerator(name = "native",strategy = "native")
	private Integer idEnvio;
	
	@ManyToOne
	@JoinColumn(name = "id_Remitente")
	private Remitente remitente;
	
	@OneToOne
	@JoinColumn(name = "id_Carga")
	private Cargas carga;
	
	@Column(name = "Origen")
	private String origen;
	
	@Column(name = "Destino")
	private String destino;
	
	@Column(name = "Estado")
	private String estado;
	
	@Column(name = "Tarifa_minima")
	private Integer tarifaMinima;
	
	@Column(name = "Tarifa_maxima")
	private Integer tarifaMaxima;
	
	@Column(name = "Fecha_entrega")
	private Date fechaEntrega;
	
	@Column(name = "Fecha_minima_origen")
	private Date minimaOrigen;
	
	@Column(name = "Fecha_maxima_origen")
	private Date maximaOrigen;
	
	@Column(name = "Fecha_limite_transportista")
	private Date fechaLimiteTransportista;
	
	
	
	
	public Integer getIdEnvio() {
		return idEnvio;
	}




	public void setIdEnvio(Integer idEnvio) {
		this.idEnvio = idEnvio;
	}




	public Remitente getRemitente() {
		return remitente;
	}




	public void setRemitente(Remitente remitente) {
		this.remitente = remitente;
	}




	public Cargas getCarga() {
		return carga;
	}




	public void setCarga(Cargas carga) {
		this.carga = carga;
	}




	public String getOrigen() {
		return origen;
	}




	public void setOrigen(String origen) {
		this.origen = origen;
	}




	public String getDestino() {
		return destino;
	}




	public void setDestino(String destino) {
		this.destino = destino;
	}




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
		this.estado = estado;
	}




	public Integer getTarifaMinima() {
		return tarifaMinima;
	}




	public void setTarifaMinima(Integer tarifaMinima) {
		this.tarifaMinima = tarifaMinima;
	}




	public Integer getTarifaMaxima() {
		return tarifaMaxima;
	}




	public void setTarifaMaxima(Integer tarifaMaxima) {
		this.tarifaMaxima = tarifaMaxima;
	}




	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	
	public String getFechaEntregaSH() {
		Format f = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate = f.format(fechaEntrega);
	    return strDate;
	}




	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}




	public Date getMinimaOrigen() {
		return minimaOrigen;
	}
	
	public String getMinimaOrigenSH() {
		Format f = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate = f.format(minimaOrigen);
	    return strDate;
	}




	public void setMinimaOrigen(Date minimaOrigen) {
		this.minimaOrigen = minimaOrigen;
	}




	public Date getMaximaOrigen() {
		return maximaOrigen;
	}

	public String getMaximaOrigenSH() {
		Format f = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate = f.format(maximaOrigen);
	    return strDate;
	}


	public void setMaximaOrigen(Date maximaOrigen) {
		this.maximaOrigen = maximaOrigen;
	}




	public Date getFechaLimiteTransportista() {
		return fechaLimiteTransportista;
	}


	public String getFechaLimiteTransportistaSH() {
		Format f = new SimpleDateFormat("dd/MM/yyyy");
	    String strDate = f.format(fechaLimiteTransportista);
	    return strDate;
	}

	public void setFechaLimiteTransportista(Date fechaLimiteTransportista) {
		this.fechaLimiteTransportista = fechaLimiteTransportista;
	}




	@Override
	public String toString() {
		return "Envio [idEnvio=" + idEnvio + ", remitente=" + remitente + ", carga=" + carga + ", origen=" + origen
				+ ", destino=" + destino + ", estado=" + estado + ", tarifaMinima=" + tarifaMinima + ", tarifaMaxima="
				+ tarifaMaxima + ", fechaEntrega=" + fechaEntrega + ", minimaOrigen=" + minimaOrigen + ", maximaOrigen="
				+ maximaOrigen + ", fechaLimiteTransportista=" + fechaLimiteTransportista + "]";
	}




	public Envio(Integer idEnvio, Remitente remitente, Cargas carga, String origen, String destino, String estado,
			Integer tarifaMinima, Integer tarifaMaxima, Date fechaEntrega, Date minimaOrigen, Date maximaOrigen,
			Date fechaLimiteTransportista) {
		super();
		this.idEnvio = idEnvio;
		this.remitente = remitente;
		this.carga = carga;
		this.origen = origen;
		this.destino = destino;
		this.estado = estado;
		this.tarifaMinima = tarifaMinima;
		this.tarifaMaxima = tarifaMaxima;
		this.fechaEntrega = fechaEntrega;
		this.minimaOrigen = minimaOrigen;
		this.maximaOrigen = maximaOrigen;
		this.fechaLimiteTransportista = fechaLimiteTransportista;
	}




	public Envio() {
		// TODO Auto-generated constructor stub
	}

}
