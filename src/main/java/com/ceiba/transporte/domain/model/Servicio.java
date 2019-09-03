package com.ceiba.transporte.domain.model;

public class Servicio {

	private int idServicio;
	private int idConductor;
	private int idVehiculo;
	private String cedulaServ;
	private double distanciaKmServ;
	private String direccionInicialSev;
	private String direccionFinalServ;
	private String municipioFinalServ;
	private double totalServ;
	private Tonelaje tonelajeServ;
	
	public Servicio() {
		
	}
	
	public int getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}
	public int getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getCedulaServ() {
		return cedulaServ;
	}
	public void setCedulaServ(String cedulaServ) {
		this.cedulaServ = cedulaServ;
	}
	public double getDistanciaKmServ() {
		return distanciaKmServ;
	}
	public void setDistanciaKmServ(float distanciaKmServ) {
		this.distanciaKmServ = distanciaKmServ;
	}
	public String getDireccionInicialSev() {
		return direccionInicialSev;
	}
	public void setDireccionInicialSev(String direccionInicialSev) {
		this.direccionInicialSev = direccionInicialSev;
	}
	public String getDireccionFinalServ() {
		return direccionFinalServ;
	}
	public void setDireccionFinalServ(String direccionFinalServ) {
		this.direccionFinalServ = direccionFinalServ;
	}
	public String getMunicipioFinalServ() {
		return municipioFinalServ;
	}
	public void setMunicipioFinalServ(String municipioFinalServ) {
		this.municipioFinalServ = municipioFinalServ;
	}
	public double getTotalServ() {
		return totalServ;
	}
	public void setTotalServ(float totalServ) {
		this.totalServ = totalServ;
	}

	public Tonelaje getTonelajeServ() {
		return tonelajeServ;
	}

	public void setTonelajeServ(Tonelaje tonelajeServ) {
		this.tonelajeServ = tonelajeServ;
	}
	
	
}
