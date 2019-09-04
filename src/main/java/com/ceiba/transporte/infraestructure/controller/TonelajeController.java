package com.ceiba.transporte.infraestructure.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/transporte/tonelaje", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class TonelajeController {
//
//	@Autowired
//	//Cambiar 
//	TonelajeRepository tonelajeRepository;
//	
//	@PostMapping(value = "listar-servicio")
//	public @ResponseBody List<Tonelaje> listarTonelaje() {
//		return tonelajeRepository.listarTonelaje();
//	}
//	@PostMapping(value = "listar-servicio")
//	public void guardarTonelaje(@RequestBody Tonelaje tonelaje) {
//		tonelajeRepository.guardarTonelaje(tonelaje);
//	}
	
}
