package com.ceiba.transporte.infraestructure.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "VehiculoEntity")
public class VehiculoEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVehiculo;
	
	@Column(name = "placa")
	private String placa;
	@Column(name = "modelo")
	private int modelo;
	@Column(name = "soat")
	private LocalDateTime soat;
	@Column(name = "tecnomecanico")
	private LocalDateTime tecnomecanico;
	@Column(name = "capacidad")
	private double capacidad;
	@Column(name = "disponible")
	private boolean disponible;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "tonelaje", referencedColumnName = "id")
	private TonelajeEntity tonelaje;
	
	public VehiculoEntity() {
		
	}

	public long getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(long idVehiculo) {
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

	public TonelajeEntity getTonelaje() {
		return tonelaje;
	}

	public void setTonelaje(TonelajeEntity tonelaje) {
		this.tonelaje = tonelaje;
	}
	
	
}
