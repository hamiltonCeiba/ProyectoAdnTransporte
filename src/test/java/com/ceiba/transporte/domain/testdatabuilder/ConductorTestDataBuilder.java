package com.ceiba.transporte.domain.testdatabuilder;

import com.ceiba.transporte.domain.model.Conductor;

public class ConductorTestDataBuilder {
	private Long id;
	private String cedula;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String celular;
	
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
	public ConductorTestDataBuilder withId(Long id) {
		this.id = id;
		return this;
	}
	
	public Conductor build() {
		return new Conductor(id,cedula, primerNombre, segundoNombre, primerApellido, segundoApellido, celular);
	}
}
