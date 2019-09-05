package com.ceiba.transporte.domain.testdatabuilder;

import java.time.LocalDateTime;

import com.ceiba.transporte.domain.model.Vehiculo;

public class VehiculoTestDataBuilder {

	private double capacidad;
	private boolean disponible;
	private int modelo;
	private String placa;
	private LocalDateTime soat;
	private LocalDateTime tecnomecanica;

	public VehiculoTestDataBuilder withCapacidad(double capacidad) {
		this.capacidad = capacidad;
		return this;
	}
	
	public VehiculoTestDataBuilder withDisponible(boolean disponible) {
		this.disponible = disponible;
		return this;
	}
	
	public VehiculoTestDataBuilder withModelo(int modelo) {
		this.modelo = modelo;
		return this;
	}
	
	public VehiculoTestDataBuilder withPlaca(String placa) {
		this.placa = placa;
		return this;
	}
	public VehiculoTestDataBuilder withSoat(LocalDateTime soat) {
		this.soat = soat;
		return this;
	}
	public VehiculoTestDataBuilder withTecnomecanica(LocalDateTime tecnomecanica) {
		this.tecnomecanica = tecnomecanica;
		return this;
	}
	
	public Vehiculo build() {
		return new Vehiculo(placa,modelo,soat,tecnomecanica,capacidad,disponible);
	}
}
