package com.ceiba.transporte.infraestructure.controller.utilidad;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.infraestructure.controller.peticion.ConductorRequest;
import com.ceiba.transporte.infraestructure.controller.peticion.ServicioRequest;
import com.ceiba.transporte.infraestructure.controller.peticion.TonelajeRequest;
import com.ceiba.transporte.infraestructure.controller.peticion.VehiculoRequest;

public final class ConvertirRequestAEntidades {

	public static Vehiculo convertVehiculoRequestToVehiculo(VehiculoRequest vehiculoRequest,Tonelaje tonelaje) {
		return new Vehiculo(vehiculoRequest.getPlaca(), 
				vehiculoRequest.getModelo(), vehiculoRequest.getSoat(),
				vehiculoRequest.getTecnomecanico(),
				vehiculoRequest.getCapacidad(), vehiculoRequest.isDisponible(),
				tonelaje);
	}
	
	public static Tonelaje convertToTonelaje(TonelajeRequest request) {
		return new Tonelaje(request.getRango(),  request.getPrecioKm());
	}
	
	public static Conductor convertConductorRequestToConductor(ConductorRequest conductorRequest) {
		return new Conductor(conductorRequest.getCedula(), conductorRequest.getPrimerNombre(),
				conductorRequest.getSegundoNombre(), conductorRequest.getPrimerApellido(),
				conductorRequest.getSegundoApellido(), conductorRequest.getCelular());		
	}
	
	public static Servicio convertRequestToService(ServicioRequest request) {
		return new Servicio(request.getDistanciaKm()
				,request.getDireccionInicial()
				,request.getDireccionFinal()
				,request.getMunicipioFinal()
				,request.getTotalServ()
				,ConvertirRequestAEntidades.convertVehiculoRequestToVehiculo(request.getVehiculo(),ConvertirRequestAEntidades.convertToTonelaje(request.getVehiculo().getTonelaje()))
				,ConvertirRequestAEntidades.convertConductorRequestToConductor(request.getConductor()));
	}
}
