package com.ceiba.transporte.infraestructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ConductorEntity")
public class ConductorEntity {
	
	@Id
	private int idConductor;
	
	@Column(name = "cedula_cond")	
	private String cedulaCond;
	@Column(name = "primer_nombre_cond")
	private String primerNombre;
	@Column(name = "segundo_nombre_cod")
	private String segundoNombre;
	@Column(name = "primer_apellido_cod")
	private String primerApellido;
	@Column(name = "segundo_apellido_cod")
	private String segundoApellido;
	@Column(name = "celular_cod")
	private int celularCond;
	@Column(name = "disponible_cod")
	private boolean disponibleCond;
	public int getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}
	public String getCedulaCond() {
		return cedulaCond;
	}
	public void setCedulaCond(String cedulaCond) {
		this.cedulaCond = cedulaCond;
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
	public int getCelularCond() {
		return celularCond;
	}
	public void setCelularCond(int celularCond) {
		this.celularCond = celularCond;
	}
	public boolean isDisponibleCond() {
		return disponibleCond;
	}
	public void setDisponibleCond(boolean disponibleCond) {
		this.disponibleCond = disponibleCond;
	}
	
	

}
