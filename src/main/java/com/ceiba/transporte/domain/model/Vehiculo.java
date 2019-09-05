package com.ceiba.transporte.domain.model;

import java.time.LocalDateTime;

public class Vehiculo {

	private int idVehiculo;
	private int idTonelaje;
	private String placa;
	private int modelo;
	private LocalDateTime soat;
	private LocalDateTime tecnomecanico;
	private double capacidad;
	private boolean disponible;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String placa, int modelo, LocalDateTime soat, LocalDateTime tecnomecanico, double capacidad,
			boolean disponible) {
		this.placa = placa;
		this.modelo = modelo;
		this.soat = soat;
		this.tecnomecanico = tecnomecanico;
		this.capacidad = capacidad;
		this.disponible = disponible;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public int getIdTonelaje() {
		return idTonelaje;
	}
	public void setIdTonelaje(int idTonelaje) {
		this.idTonelaje = idTonelaje;
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
	
	
}
