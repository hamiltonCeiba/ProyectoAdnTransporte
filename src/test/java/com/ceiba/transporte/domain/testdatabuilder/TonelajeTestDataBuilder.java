package com.ceiba.transporte.domain.testdatabuilder;

import com.ceiba.transporte.domain.model.Tonelaje;

public class TonelajeTestDataBuilder {
	private Long id;
	private String rango;
	private double precio;
	
	public TonelajeTestDataBuilder withRango(String rango) {
		this.rango = rango;
		return this;
	}
		
	public TonelajeTestDataBuilder withPrecio(double precio) {
		this.precio = precio;
		return this;
	}
	public TonelajeTestDataBuilder withId(Long id) {
		this.id = id;
		return this;
	}
	
	public Tonelaje build() {
		return new Tonelaje(id,rango, precio);
	}
	

}
