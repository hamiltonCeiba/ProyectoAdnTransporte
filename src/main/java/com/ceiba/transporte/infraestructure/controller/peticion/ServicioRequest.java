package com.ceiba.transporte.infraestructure.controller.peticion;

import java.io.Serializable;


public class ServicioRequest implements Serializable{
	private static final long serialVersionUID = -5075426439124835226L;
	
	private int idServicio;
	private double distanciaKm;
	private String direccionInicial;
	private String direccionFinal;
	private String municipioFinal;
	private double totalServ;
	private VehiculoRequest vehiculo;
	private ConductorRequest conductor;
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public double getDistanciaKm() {
		return distanciaKm;
	}
	public void setDistanciaKm(double distanciaKm) {
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
	public double getTotalServ() {
		return totalServ;
	}
	public void setTotalServ(double totalServ) {
		this.totalServ = totalServ;
	}
	
	public VehiculoRequest getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(VehiculoRequest vehiculo) {
		this.vehiculo = vehiculo;
	}
	public ConductorRequest getConductor() {
		return conductor;
	}
	public void setConductor(ConductorRequest conductor) {
		this.conductor = conductor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
