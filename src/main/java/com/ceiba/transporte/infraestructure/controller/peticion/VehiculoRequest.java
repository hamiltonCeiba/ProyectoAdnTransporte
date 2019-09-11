package com.ceiba.transporte.infraestructure.controller.peticion;

import java.io.Serializable;
import java.time.LocalDateTime;


public class VehiculoRequest implements Serializable {
	private static final long serialVersionUID = -5075426439124835228L;
	
	private Long idVehiculo;
	private String placa;
	private int modelo;
	private LocalDateTime soat;
	private LocalDateTime tecnomecanico;
	private double capacidad;
	private boolean disponible;
	private TonelajeRequest tonelaje;
	
	
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public TonelajeRequest getTonelaje() {
		return tonelaje;
	}
	public void setTonelaje(TonelajeRequest tonelaje) {
		this.tonelaje = tonelaje;
	}
		
	
}
