package com.ceiba.transporte.domain.model;

import java.time.LocalDateTime;

public class Vehiculo {

	private Long idVehiculo;
	private String placa;
	private int modelo;
	private LocalDateTime soat;
	private LocalDateTime tecnomecanico;
	private double capacidad;
	private boolean disponible;
	private Tonelaje tonelaje;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(Long idVehiculo,String placa, int modelo, LocalDateTime soat, LocalDateTime tecnomecanico, double capacidad,
			boolean disponible,Tonelaje tonelaje) {
		this.idVehiculo = idVehiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.soat = soat;
		this.tecnomecanico = tecnomecanico;
		this.capacidad = capacidad;
		this.disponible = disponible;
		this.tonelaje = tonelaje;
	}
	
	public Vehiculo(String placa, int modelo, LocalDateTime soat, LocalDateTime tecnomecanico, double capacidad,
			boolean disponible,Tonelaje tonelaje) {
		this.placa = placa;
		this.modelo = modelo;
		this.soat = soat;
		this.tecnomecanico = tecnomecanico;
		this.capacidad = capacidad;
		this.disponible = disponible;
		this.tonelaje = tonelaje;
	}
	
	public Long getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(Long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public LocalDateTime getSoat() {
		return soat;
	}
	public void setSoat(LocalDateTime soat) {
		this.soat = soat;
	}
	public LocalDateTime getTecnomecanico() {
		return tecnomecanico;
	}
	public void setTecnomecanico(LocalDateTime tecnomecanico) {
		this.tecnomecanico = tecnomecanico;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Tonelaje getTonelaje() {
		return tonelaje;
	}

	public void setTonelaje(Tonelaje tonelaje) {
		this.tonelaje = tonelaje;
	}
	
	
	
}
