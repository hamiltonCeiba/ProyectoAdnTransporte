package com.ceiba.transporte.infraestructure.controller.peticion;

import java.io.Serializable;

public class TonelajeRequest implements Serializable {

	private static final long serialVersionUID = -5075426439124835227L;
	
	private String rango;
	private String descripcion;
	private double precioKm;
	
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioKm() {
		return precioKm;
	}
	public void setPrecioKm(double  precioKm) {
		this.precioKm = precioKm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
