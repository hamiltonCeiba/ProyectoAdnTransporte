package com.ceiba.transporte.domain.testdatabuilder;

import com.ceiba.transporte.domain.model.Conductor;

public class ConductorTestDataBuilder {

	private String cedula;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String celular;
	private boolean disponible;
	
	public ConductorTestDataBuilder withCedula(String cedula) {
		this.cedula = cedula;
		return this;
	}
	
	public ConductorTestDataBuilder withPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
		return this;
	}
	
	public ConductorTestDataBuilder withSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
		return this;
	}
	
	public ConductorTestDataBuilder withPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
		return this;
	}
	
	public ConductorTestDataBuilder withSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
		return this;
	}
	
	public ConductorTestDataBuilder withCelular(String celular) {
		this.celular = celular;
		return this;
	}
	
	public ConductorTestDataBuilder withDisponible(boolean disponible) {
		this.disponible = disponible;
		return this;
	}
	
	public Conductor build() {
		return new Conductor(cedula, primerNombre, segundoNombre, primerApellido, segundoApellido, celular, disponible);
	}
}
