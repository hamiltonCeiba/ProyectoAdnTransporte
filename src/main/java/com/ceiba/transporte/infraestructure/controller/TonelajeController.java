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


@RestController
@RequestMapping(value = "/transporte/tonelaje", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class TonelajeController {

	@Autowired
	TonelajeService tonelajeService;
	
	@PostMapping(value = "/listar-servicio")
	public @ResponseBody List<Tonelaje> listarTonelaje() {
		return tonelajeService.listarTonelaje();
	}
	@PostMapping(value = "/crear-servicio")
	public void guardarTonelaje(@RequestBody TonelajeRequest tonelaje) {
		tonelajeService.guardarTonelaje(convertToTonelaje(tonelaje));
	}
	
	@PostMapping(value = "/eliminar-servicio")
	public void eliminarTonelaje(@RequestBody TonelajeRequest tonelaje) {
		tonelajeService.eliminarTonelaje(convertToTonelaje(tonelaje));
	}
	
	private Tonelaje convertToTonelaje(TonelajeRequest request) {
		return new Tonelaje(request.getRango(),  request.getDescripcion(), request.getPrecioKm());
	}
	
}
