package com.ceiba.transporte.infraestructure.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.repository.TonelajeRepository;

@CrossOrigin
@RestController
@RequestMapping(value = "/transporte/tonelaje", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class TonelajeController {

	@Autowired
	TonelajeRepository tonelajeRepository;
	
	@PostMapping(value = "listar-servicio")
	public @ResponseBody List<Tonelaje> listarTonelaje() {
		return tonelajeRepository.listarTonelaje();
	}
	@PostMapping(value = "listar-servicio")
	public void guardarTonelaje(@RequestBody Tonelaje tonelaje) {
		tonelajeRepository.guardarTonelaje(tonelaje);
	}
	
}
