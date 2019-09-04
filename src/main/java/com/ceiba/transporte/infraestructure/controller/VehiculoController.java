package com.ceiba.transporte.infraestructure.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/transporte/vehiculo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

public class VehiculoController {

//	@Autowired
//	VehiculoService vehiculoService;
//	
//	@PostMapping(value = "/crear-vehiculo")
//	public void guardarVehiculo(@RequestBody Vehiculo vehiculo) {
//		vehiculoService.guardarVehiculo(vehiculo);
//	}
//	
//	@PostMapping(value = "/eliminar-vehiculo")
//	public void eliminarVehiculo(@RequestBody Vehiculo vehiculo) {
//		vehiculoService.eliminarVehiculo(vehiculo);
//	}
//	
//	@PostMapping(value = "/listar-vehiculo")
//	public @ResponseBody List<Vehiculo> listarVehiculo(){
//		return vehiculoService.listarVehiculo();
//	}
}
