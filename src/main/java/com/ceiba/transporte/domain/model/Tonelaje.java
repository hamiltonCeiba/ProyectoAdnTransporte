package com.ceiba.transporte.domain.model;

public class Tonelaje {

	private int idTonelaje;
	private float capacidadTon;
	private  String descripcionTon;
	private float precioKmTon;
	
	public Tonelaje(int idTonelaje, float capacidadTon, String descripcionTon, float precioKmTon) {
		super();
		this.idTonelaje = idTonelaje;
		this.capacidadTon = capacidadTon;
		this.descripcionTon = descripcionTon;
		this.precioKmTon = precioKmTon;
	}
	public int getIdTonelaje() {
		return idTonelaje;
	}
	public void setIdTonelaje(int idTonelaje) {
		this.idTonelaje = idTonelaje;
	}
	public float getCapacidadTon() {
		return capacidadTon;
	}
	public void setCapacidadTon(float capacidadTon) {
		this.capacidadTon = capacidadTon;
	}
	public String getDescripcionTon() {
		return descripcionTon;
	}
	public void setDescripcionTon(String descripcionTon) {
		this.descripcionTon = descripcionTon;
	}
	public float getPrecioKmTon() {
		return precioKmTon;
	}
	public void setPrecioKmTon(float precioKmTon) {
		this.precioKmTon = precioKmTon;
	}
	
	

}
