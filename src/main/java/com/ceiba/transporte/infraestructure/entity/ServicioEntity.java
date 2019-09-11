package com.ceiba.transporte.infraestructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ServicioEntity")
public class ServicioEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idServicio;

	@Column(name = "distancia")
	private String distanciaKm;

	@Column(name = "direccion_inicial")
	private String direccionInicial;
	@Column(name = "direccion_final")
	private String direccionFinal;
	@Column(name = "municipio_final")
	private String municipioFinal;
	@Column(name = "total_servicio")
	private double totalServicio;

	@ManyToOne()
	@JoinColumn(name = "vehiculo", referencedColumnName = "id")
	private VehiculoEntity vehiculo;

	@ManyToOne()
	@JoinColumn(name = "conductor", referencedColumnName = "id")
	private ConductorEntity conductor;

//	public ServicioEntity() {
//	}

	public long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}

	
	public String getDistanciaKm() {
		return distanciaKm;
	}

	public void setDistanciaKm(String distanciaKm) {
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

	public VehiculoEntity getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoEntity vehiculo) {
		this.vehiculo = vehiculo;
	}

	public ConductorEntity getConductor() {
		return conductor;
	}

	public void setConductor(ConductorEntity conductor) {
		this.conductor = conductor;
	}
	
	
}
