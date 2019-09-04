package com.ceiba.transporte.infraestructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ConductorEntity")
public class ConductorEntity {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idConductor;
	
	@Column(name = "cedula")	
	private String cedula;
	@Column(name = "primer_nombre")
	private String primerNombre;
	@Column(name = "segundo_nombre")
	private String segundoNombre;
	@Column(name = "primer_apellido")
	private String primerApellido;
	@Column(name = "segundo_apellido")
	private String segundoApellido;
	@Column(name = "celular")
	private String celular;
	@Column(name = "disponible")
	private boolean disponible;
	
	public ConductorEntity() {
		
	}
	
	
	public long getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(long idConductor) {
		this.idConductor = idConductor;
	}
	public String getCedulaCond() {
		return cedula;
	}
	public void setCedulaCond(String cedulaCond) {
		this.cedula= cedulaCond;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getCelularCond() {
		return celular;
	}
	public void setCelularCond(String celularCond) {
		this.celular = celularCond;
	}
	public boolean isDisponibleCond() {
		return disponible;
	}
	public void setDisponibleCond(boolean disponibleCond) {
		this.disponible = disponibleCond;
	}
	
	

}
