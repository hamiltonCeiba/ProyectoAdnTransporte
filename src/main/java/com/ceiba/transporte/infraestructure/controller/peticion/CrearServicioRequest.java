package com.ceiba.transporte.infraestructure.controller.peticion;

import java.io.Serializable;

public class CrearServicioRequest implements Serializable {

	private static final long serialVersionUID = -5075426439124835229L;
	
	private String cedula;
	private float distanciaKm;
	private String direccionInicial;
	private String direccionFinal;
	private String municipioFinal;
	private float total;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public float getDistanciaKm() {
		return distanciaKm;
	}
	public void setDistanciaKm(float distanciaKm) {
		this.distanciaKm = distanciaKm;
	}
	public String getDireccionInicial() {
		return direccionInicial;
	}
	public void setDireccionInicial(String direccionInicial) {
		this.direccionInicial = direccionInicial;
	}
	public String getDireccionFinal() {
		return direccionFinal;
	}
	public void setDireccionFinal(String direccionFinal) {
		this.direccionFinal = direccionFinal;
	}
	public String getMunicipioFinal() {
		return municipioFinal;
	}
	public void setMunicipioFinal(String municipioFinal) {
		this.municipioFinal = municipioFinal;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
