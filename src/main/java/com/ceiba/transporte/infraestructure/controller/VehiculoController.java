package com.ceiba.transporte.infraestructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.domain.service.VehiculoService;
import com.ceiba.transporte.infraestructure.controller.peticion.VehiculoRequest;
import com.ceiba.transporte.infraestructure.controller.utilidad.ConvertirRequestAEntidades;

@RestController
@RequestMapping(value = "/transporte/vehiculo",  produces = MediaType.APPLICATION_JSON_VALUE)

public class VehiculoController {

	@Autowired
	VehiculoService vehiculoService;

	@PostMapping(value = "/crear-vehiculo")
	public void guardarVehiculo(@RequestBody VehiculoRequest vehiculoRequest) {
		Tonelaje tonelaje = new Tonelaje(vehiculoRequest.getTonelaje().getId(),
				vehiculoRequest.getTonelaje().getRango(),
				vehiculoRequest.getTonelaje().getPrecio());
		vehiculoService.guardarVehiculo(
				ConvertirRequestAEntidades.convertVehiculoRequestToVehiculo(vehiculoRequest, tonelaje));
	}

	
	@RequestMapping(value = "/listar-vehiculo",
	method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Vehiculo> listarVehiculo() {
		return vehiculoService.listarVehiculo();
	}
	
	@RequestMapping(value = "/eliminar-vehiculo", consumes =MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarVehiculo(@RequestBody VehiculoRequest vehiculo) {
		Tonelaje tonelaje = ConvertirRequestAEntidades.convertToTonelaje(vehiculo.getTonelaje());
		vehiculoService.eliminarVehiculo(ConvertirRequestAEntidades.convertVehiculoRequestToVehiculo(vehiculo,tonelaje));
	}
	
	@RequestMapping(value = "/editar-vehiculo",
			method=RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
	public Vehiculo editarVehiculo(@RequestBody VehiculoRequest vehiculo) {
		Tonelaje tonelaje = ConvertirRequestAEntidades.convertToTonelaje(vehiculo.getTonelaje());
		return vehiculoService.actualizarVehiculo(ConvertirRequestAEntidades.convertVehiculoRequestToVehiculo(vehiculo, tonelaje));
	}

	
	@RequestMapping(value = "/buscar-vehiculo-id",
			method=RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
	public Vehiculo buscarTonelajePorId(@RequestBody VehiculoRequest vehiculo){
		return vehiculoService.buscarVehiculoPorId(vehiculo.getIdVehiculo()); 
	}
	
	/*
	 * private Vehiculo convertVehiculoRequestToVehiculo(VehiculoRequest
	 * vehiculoRequest,Tonelaje tonelaje) { return new
	 * Vehiculo(vehiculoRequest.getPlaca(), vehiculoRequest.getModelo(),
	 * vehiculoRequest.getSoat(), vehiculoRequest.getTecnomecanico(),
	 * vehiculoRequest.getCapacidad(), vehiculoRequest.isDisponible(), tonelaje); }
	 */
}
