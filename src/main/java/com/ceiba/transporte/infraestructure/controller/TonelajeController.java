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
import com.ceiba.transporte.domain.service.TonelajeService;
import com.ceiba.transporte.infraestructure.controller.peticion.TonelajeRequest;
import com.ceiba.transporte.infraestructure.controller.utilidad.ConvertirRequestAEntidades;

@RestController
@RequestMapping(value = "/transporte/tonelaje", produces = MediaType.APPLICATION_JSON_VALUE)
public class TonelajeController {

	@Autowired
	TonelajeService tonelajeService;

	//@PostMapping(value = "/listar-tonelaje")
	@RequestMapping(value = "/listar-tonelaje",
			method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Tonelaje> listarTonelaje() {
		return tonelajeService.listarTonelaje();
	}

	@PostMapping(value = "/crear-tonelaje")
	public void guardarTonelaje(@RequestBody TonelajeRequest tonelaje) {
		tonelajeService.guardarTonelaje(ConvertirRequestAEntidades.convertToTonelaje(tonelaje));
	}

	@RequestMapping(value = "/eliminar-tonelaje", consumes =MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void eliminarTonelaje(@RequestBody TonelajeRequest tonelaje) {
		tonelajeService.eliminarTonelaje(ConvertirRequestAEntidades.convertToTonelaje(tonelaje));
	}
	
	@RequestMapping(value = "/buscar-tonelaje-id",
			method=RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
	public Tonelaje buscarTonelajePorId(@RequestBody TonelajeRequest tonelaje){
		return tonelajeService.buscartTonelajePorId(tonelaje.getId()); 
	}
	
	@RequestMapping(value = "/editar-tonelaje",
			method=RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
/*
	public Tonelaje editarTonelaje(@RequestBody TonelajeRequest tonelaje){
		return tonelajeService.buscartTonelajePorId(tonelaje.getId()); 
	}
	
*/
	public Tonelaje editarTonelaje(@RequestBody TonelajeRequest tonelaje) {
		return tonelajeService.actualizarTonelaje(ConvertirRequestAEntidades.convertToTonelaje(tonelaje));
	}


}
