package com.ceiba.transporte.infraestructure.controller.peticion;

import java.io.Serializable;

public class ConductorRequest implements Serializable {
	private static final long serialVersionUID = -5075426439124835229L;
	
	
    private String cedula;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String celular;
    private boolean disponible;
    
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public boolean getDisponibleConductor() {
		return disponible;
	}
	public void setDisponibleConductor(boolean disponible) {
		this.disponible = disponible;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
