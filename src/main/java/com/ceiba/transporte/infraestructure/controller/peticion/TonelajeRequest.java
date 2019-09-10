package com.ceiba.transporte.infraestructure.controller.peticion;

import java.io.Serializable;

public class TonelajeRequest implements Serializable {

	private static final long serialVersionUID = -5075426439124835227L;
	
	private Long id;
	private String rango;
	private double precio;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
