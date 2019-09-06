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
import com.ceiba.transporte.domain.service.TonelajeService;
import com.ceiba.transporte.infraestructure.controller.peticion.TonelajeRequest;
import com.ceiba.transporte.infraestructure.controller.utilidad.ConvertirRequestAEntidades;

@RestController
@RequestMapping(value = "/transporte/tonelaje", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class TonelajeController {

	@Autowired
	TonelajeService tonelajeService;

	@PostMapping(value = "/listar-tonelaje")
	public @ResponseBody List<Tonelaje> listarTonelaje() {
		return tonelajeService.listarTonelaje();
	}

	@PostMapping(value = "/crear-tonelaje")
	public void guardarTonelaje(@RequestBody TonelajeRequest tonelaje) {
		tonelajeService.guardarTonelaje(ConvertirRequestAEntidades.convertToTonelaje(tonelaje));
	}

	@PostMapping(value = "/eliminar-tonelaje")
	public void eliminarTonelaje(@RequestBody TonelajeRequest tonelaje) {
		tonelajeService.eliminarTonelaje(ConvertirRequestAEntidades.convertToTonelaje(tonelaje));
	}

	/*
	 * private Tonelaje convertToTonelaje(TonelajeRequest request) { return new
	 * Tonelaje(request.getRango(), request.getPrecioKm()); }
	 */

}
