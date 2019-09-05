package com.ceiba.transporte.domain.model;

public class Tonelaje {

	private String rango;
	private double precio;	
	
	public Tonelaje() {
		
	}
	
	public Tonelaje( String rango,  double precio) {
		this.rango = rango;
		this.precio = precio;
	}
	
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

}
