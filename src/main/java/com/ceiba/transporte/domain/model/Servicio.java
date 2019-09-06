package com.ceiba.transporte.domain.model;

public class Servicio {

	private int idServicio;
	private double distanciaKm;
	private String direccionInicial;
	private String direccionFinal;
	private String municipioFinal;
	private double totalServ;
	private Vehiculo vehiculo;
	private Conductor conductor;
	
	public Servicio() {
		
	}
	
	
	
	public Servicio(double distanciaKm, String direccionInicial, String direccionFinal, String municipioFinal,
			double totalServ, Vehiculo vehiculo, Conductor conductor) {
		super();
		this.distanciaKm = distanciaKm;
		this.direccionInicial = direccionInicial;
		this.direccionFinal = direccionFinal;
		this.municipioFinal = municipioFinal;
		this.totalServ = totalServ;
		this.vehiculo = vehiculo;
		this.conductor = conductor;
	}



	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}	
	public double getTotalServ() {
		return totalServ;
	}
	public void setTotalServ(float totalServ) {
		this.totalServ = totalServ;
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

	public void setTotalServ(double totalServ) {
		this.totalServ = totalServ;
	}

	
	
	
}
