package com.ceiba.transporte.domain.service;

import java.util.Calendar;

import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.infraestructure.controller.utilidad.OperacionFechas;

public class TotalServicioService {


	private static final String MEDELLIN = "MEDELLIN";
	
	public double calcularServicio(Servicio servicio) {
		Calendar calendar = Calendar.getInstance();
		double subTotal = calcularPrecioSegunDistancia(servicio.getDistanciaKmServ(),
				servicio.getTonelajeServ().getPrecio());
		return calcularSegunDia(subTotal, calendar.get(Calendar.DAY_OF_WEEK))
				+ calcularSegunMunicipio(subTotal, servicio.getMunicipioFinalServ());
	}

	public double calcularPrecioSegunDistancia(double distancia, double precioKm) {
		return distancia * precioKm;
	}

	public double calcularSegunDia(double subTotalServicio, int diaDeSemana) {
		if (OperacionFechas.esDomingo(diaDeSemana)) {
			subTotalServicio = subTotalServicio * 1.15;
		}
		return Math.round(subTotalServicio);
	}

	public double calcularSegunMunicipio(double subTotalServicio, String municipio) {
		if (!municipio.equalsIgnoreCase(MEDELLIN)) {
			subTotalServicio = subTotalServicio * 1.10;
		}
		return Math.round(subTotalServicio);

	}
}
