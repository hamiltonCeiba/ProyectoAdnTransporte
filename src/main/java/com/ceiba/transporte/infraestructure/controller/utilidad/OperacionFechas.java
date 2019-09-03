package com.ceiba.transporte.infraestructure.controller.utilidad;

import java.util.Calendar;

public final class OperacionFechas {

	public OperacionFechas() {
		
	}
	public static boolean esDomingo(int diaActual) {	
		return diaActual ==  Calendar.SUNDAY;
	}
}
