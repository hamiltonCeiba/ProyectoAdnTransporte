package com.ceiba.transporte.domain.unit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ceiba.transporte.domain.service.TotalServicioService;

public class TotalServicioTest {

	private static final double SUB_TOTAL = 100000;
	private static final double SUB_TOTAL_ESPERADO_DOMINGO = 115000;
	private static final double SUB_TOTAL_ESPERADO_NO_MEDELLIN = 110000;
	private static final int DOMINGO = 1;
	private static final int NO_DOMINGO = 2;
	private static final String MEDELLIN ="MEDELLIN";
	private static final String NO_MEDELLIN ="BELLO";

	@Test
	public void calcularSubtotalDomingo() {
		// arange
		TotalServicioService service = new TotalServicioService();
		// act
		double subTotal = service.calcularSegunDia(SUB_TOTAL, DOMINGO);

		// assert
		assertTrue("OK", SUB_TOTAL_ESPERADO_DOMINGO == subTotal);
	}

	@Test
	public void calcularSubtotalNoDomingo() {
		// arange
		TotalServicioService service = new TotalServicioService();
		// act
		double subTotal = service.calcularSegunDia(SUB_TOTAL, NO_DOMINGO);
		// assert
		assertTrue("OK", SUB_TOTAL == subTotal);
	}

	@Test
	public void calcularSubTotalMunicipioMedellin() {
		// arange
		TotalServicioService service = new TotalServicioService();
		//act
		double subTotal = service.calcularSegunMunicipio(SUB_TOTAL, MEDELLIN);
		//assert
		assertTrue(SUB_TOTAL==subTotal);		
		
	}
	@Test
	public void calcularSubTotalNoMunicipioMedellin() {
		// arange
		TotalServicioService service = new TotalServicioService();
		//act
		double subTotal = service.calcularSegunMunicipio(SUB_TOTAL, NO_MEDELLIN);
		//assert
		assertTrue(SUB_TOTAL_ESPERADO_NO_MEDELLIN==subTotal);	
	}
}
