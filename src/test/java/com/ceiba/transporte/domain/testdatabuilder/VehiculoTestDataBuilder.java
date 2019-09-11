package com.ceiba.transporte.domain.testdatabuilder;

import java.time.LocalDateTime;

import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;

public class VehiculoTestDataBuilder {

	private Long idVehiculo;
	private double capacidad;
	private boolean disponible;
	private int modelo;
	private String placa;
	private LocalDateTime soat;
	private LocalDateTime tecnomecanica;
	private Tonelaje tonelaje;

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
	public VehiculoTestDataBuilder withTonelaje(Tonelaje tonelaje) {
		this.tonelaje = tonelaje;
		return this;
	}
	public VehiculoTestDataBuilder withIdVehiculo(Long idVehiculo) {
		this.idVehiculo = idVehiculo;
		return this;
	}
	
	public Vehiculo build() {
		return new Vehiculo(idVehiculo,placa,modelo,soat,tecnomecanica,capacidad,disponible,tonelaje);
	}
}
