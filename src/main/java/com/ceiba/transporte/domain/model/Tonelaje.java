package com.ceiba.transporte.domain.model;

public class Tonelaje {

	private String rango;
	private String descripcion;
	private double precio;	
	
	public Tonelaje() {
		
	}
	
	public Tonelaje( String rango, String descripcion, double precio) {
		this.rango = rango;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

}
