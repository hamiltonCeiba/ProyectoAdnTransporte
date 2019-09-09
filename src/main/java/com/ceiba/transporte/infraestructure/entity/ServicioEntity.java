package com.ceiba.transporte.infraestructure.entity;

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
@Table(name = "ServicioEntity")
public class ServicioEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idServicio;

	@Column(name = "distancia")
	private String distancia;

	@Column(name = "direccion_inicial")
	private String direccionInicial;
	@Column(name = "direccion_final")
	private String direccionFinal;
	@Column(name = "municipio_final")
	private String municipioFinal;
	@Column(name = "total_servicio")
	private double totalServcio;

	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "vehiculo", referencedColumnName = "id")
	private VehiculoEntity vehiculo;

	@ManyToOne(cascade = {CascadeType.ALL})
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

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
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

	public double getTotalServcio() {
		return totalServcio;
	}

	public void setTotalServcio(double totalServcio) {
		this.totalServcio = totalServcio;
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
