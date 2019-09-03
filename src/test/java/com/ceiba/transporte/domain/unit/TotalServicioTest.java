package com.ceiba.transporte.domain.unit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ceiba.transporte.domain.service.TotalServicioService;

public class TotalServicioTest {

	private static final double SUB_TOTAL = 100000;
	private static final double SUB_TOTAL_ESPERADO = 115000;
	private static final int DOMINGO = 1;
	private static final int NO_DOMINGO = 2;
	
	@Test
	public void calcularSubtotalDomingo() {
		//arange
		TotalServicioService service = new TotalServicioService();
		//act
		double subTotal = service.calcularSegunDia(SUB_TOTAL, DOMINGO);
		
		//assert
		assertTrue("OK", SUB_TOTAL_ESPERADO == subTotal);
	}
	
	@Test
	public void calcularSubtotalNoDomingo() {
		//arange
		TotalServicioService service = new TotalServicioService();
		//act
		double subTotal = service.calcularSegunDia(SUB_TOTAL, NO_DOMINGO);
		
		//assert
		assertTrue("OK", SUB_TOTAL == subTotal);
	}
}
