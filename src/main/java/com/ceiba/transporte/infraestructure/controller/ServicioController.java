package com.ceiba.transporte.infraestructure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.service.ServicioService;
import com.ceiba.transporte.infraestructure.controller.peticion.ServicioRequest;
import com.ceiba.transporte.infraestructure.controller.utilidad.ConvertirRequestAEntidades;

@CrossOrigin
@RestController
@RequestMapping(value = "/transporte/servicio", produces = MediaType.APPLICATION_JSON_VALUE)
public class ServicioController {

	@Autowired
	ServicioService servicioService;

	@PostMapping(value = "crear-servicio")
	public void crearServicio(@RequestBody ServicioRequest servicio) {
		servicioService.guardarServicio(ConvertirRequestAEntidades.convertRequestToService(servicio));
	}

	@RequestMapping(value = "listar-servicio",
			method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Servicio> listarServicio() {
		return servicioService.listarTodoServicios();
	}

	/*
	 * private Servicio convertRequestToService(ServicioRequest request) { return
	 * new Servicio(request.getDistanciaKm() ,request.getDireccionInicial()
	 * ,request.getDireccionFinal() ,request.getMunicipioFinal()
	 * ,request.getTotalServ()
	 * ,ConvertirRequestAEntidades.convertVehiculoRequestToVehiculo(request.
	 * getVehiculo(),ConvertirRequestAEntidades.convertToTonelaje(request.
	 * getVehiculo().getTonelaje()))
	 * ,ConvertirRequestAEntidades.convertConductorRequestToConductor(request.
	 * getConductor())); }
	 */

}
