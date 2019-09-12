package com.ceiba.transporte.domain.model;

public class Servicio {

	private int idServicio;
	private double distanciaKm;
	private String direccionInicial;
	private String direccionFinal;
	private String municipioFinal;
	private double totalServicio;
	private Vehiculo vehiculo;
	private Conductor conductor;
		
	
	public Servicio(double distanciaKm, String direccionInicial, String direccionFinal, String municipioFinal,
			double totalServ, Vehiculo vehiculo, Conductor conductor) {
		//validacion municipio
		this.distanciaKm = distanciaKm;
		this.direccionInicial = direccionInicial;
		this.direccionFinal = direccionFinal;
		this.municipioFinal = municipioFinal;
		this.totalServicio = totalServ;
		this.vehiculo = vehiculo;
		this.conductor = conductor;
	}

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

	public double getTotalServicio() {
		return totalServicio;
	}

	public void setTotalServicio(double totalServicio) {
		this.totalServicio = totalServicio;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	
}
