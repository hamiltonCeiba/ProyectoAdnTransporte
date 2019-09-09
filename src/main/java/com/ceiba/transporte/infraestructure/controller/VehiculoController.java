package com.ceiba.transporte.infraestructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.domain.service.VehiculoService;
import com.ceiba.transporte.infraestructure.controller.peticion.VehiculoRequest;
import com.ceiba.transporte.infraestructure.controller.utilidad.ConvertirRequestAEntidades;

@RestController
@RequestMapping(value = "/transporte/vehiculo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

public class VehiculoController {

	@Autowired
	VehiculoService vehiculoService;

	@PostMapping(value = "/crear-vehiculo")
	public void guardarVehiculo(@RequestBody VehiculoRequest vehiculoRequest) {
		Tonelaje tonelaje = new Tonelaje(vehiculoRequest.getTonelaje().getRango(),
				vehiculoRequest.getTonelaje().getPrecio());
		vehiculoService.guardarVehiculo(
				ConvertirRequestAEntidades.convertVehiculoRequestToVehiculo(vehiculoRequest, tonelaje));
	}

	@PostMapping(value = "/eliminar-vehiculo")
	public void eliminarVehiculo(@RequestBody String placa) {
		vehiculoService.eliminarVehiculo(placa);
	}

	@PostMapping(value = "/listar-vehiculo")
	public @ResponseBody List<Vehiculo> listarVehiculo() {
		return vehiculoService.listarVehiculo();
	}

	/*
	 * private Vehiculo convertVehiculoRequestToVehiculo(VehiculoRequest
	 * vehiculoRequest,Tonelaje tonelaje) { return new
	 * Vehiculo(vehiculoRequest.getPlaca(), vehiculoRequest.getModelo(),
	 * vehiculoRequest.getSoat(), vehiculoRequest.getTecnomecanico(),
	 * vehiculoRequest.getCapacidad(), vehiculoRequest.isDisponible(), tonelaje); }
	 */
}
