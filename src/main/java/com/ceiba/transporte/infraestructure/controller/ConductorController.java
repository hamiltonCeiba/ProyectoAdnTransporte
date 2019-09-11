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

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.service.ConductorService;
import com.ceiba.transporte.infraestructure.controller.peticion.ConductorRequest;
import com.ceiba.transporte.infraestructure.controller.utilidad.ConvertirRequestAEntidades;

@RestController
@RequestMapping(value = "/transporte/conductor", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConductorController {

	@Autowired
	ConductorService conductorService;

	@PostMapping(value = "/crear-conductor")
	public void guardarConductor(@RequestBody ConductorRequest conductorRequest) {
		Conductor conductor = ConvertirRequestAEntidades.convertConductorRequestToConductor(conductorRequest);
		conductorService.guardarConductor(conductor);
	}

	@PostMapping(value = "/eliminar-conductor")
	public void eliminarConductor(@RequestBody ConductorRequest conductorRequest) {
		Conductor conductor = ConvertirRequestAEntidades.convertConductorRequestToConductor(conductorRequest);
		conductorService.eliminarConductor(conductor);
	}

	@RequestMapping(value = "/listar-conductor",
			method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Conductor> listarConductores() {
		return conductorService.listarConductores();

	}

	@PostMapping(value = "/eliminar-conductor-cedula")
	public void eliminarConductorPorCedula(@RequestBody String cedulaConductor) {
		conductorService.eliminarConductorPorCedula(cedulaConductor);
	}
	/*
	 * private Conductor convertConductorRequestToConductor(ConductorRequest
	 * conductorRequest) { return new Conductor(conductorRequest.getCedula(),
	 * conductorRequest.getPrimerNombre(), conductorRequest.getSegundoNombre(),
	 * conductorRequest.getPrimerApellido(), conductorRequest.getSegundoApellido(),
	 * conductorRequest.getCelular()); }
	 */

}
