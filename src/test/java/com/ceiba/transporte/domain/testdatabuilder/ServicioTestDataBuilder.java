package com.ceiba.transporte.domain.testdatabuilder;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.model.Vehiculo;

public class ServicioTestDataBuilder {

	private double distanciaKm;
	private String direccionInicial;
	private String direccionFinal;
	private String municipioFinal;
	private double totalServicio;
	private Vehiculo vehiculo;
	private Conductor conductor;
	
	public ServicioTestDataBuilder withDistanciaKm(double distanciaKm) {
		this.distanciaKm = distanciaKm;
		return this;
	}
	public ServicioTestDataBuilder withDireccionInicial(String direccionInicial) {
		this.direccionInicial = direccionInicial;
		return this;
	}
	public ServicioTestDataBuilder withDireccionFinal(String direccionFinal) {
		this.direccionFinal = direccionFinal;
		return this;
	}
	public ServicioTestDataBuilder withMunicipioFinal(String municipioFinal) {
		this.municipioFinal = municipioFinal;
		return this;
	}
	public ServicioTestDataBuilder withTotalServicio(double totalServicio) {
		this.totalServicio = totalServicio;
		return this;
	}
	public ServicioTestDataBuilder withVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		return this;
	}
	public ServicioTestDataBuilder withConductor(Conductor conductor) {
		this.conductor = conductor;
		return this;
	}
	
	public Servicio build() {
		return new Servicio(distanciaKm, direccionInicial, direccionFinal, municipioFinal, totalServicio, vehiculo, conductor);
	}
}
