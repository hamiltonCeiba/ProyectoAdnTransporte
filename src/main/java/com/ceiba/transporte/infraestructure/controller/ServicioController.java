package com.ceiba.transporte.infraestructure.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping(value = "/transporte/servicio", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class ServicioController {
	
//	@Autowired
//	ServicioService servicioService;
//	
//	@PostMapping(value = "crear-servicio")
//	public void crearServicio(@RequestBody Servicio servicio) {
//		servicioService.guardarServicio(servicio);
//	}
//	
//	@PostMapping(value = "listar-servicio")
//	public @ResponseBody List<Servicio> listarServicio() {
//		return servicioService.listarTodoServicios();
//	}

}
