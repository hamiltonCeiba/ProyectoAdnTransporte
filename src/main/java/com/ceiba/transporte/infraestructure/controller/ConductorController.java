package com.ceiba.transporte.infraestructure.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.service.ConductorService;

@CrossOrigin
@RestController
@RequestMapping(value = "/transporte/conductor", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class ConductorController {

	@Autowired
	ConductorService conductorService; 
	
	@PostMapping(value = "/crear-conductor")
	public void guardarConductor(@RequestBody Conductor conductor) {
		conductorService.guardarConductor(conductor);
	}
	
	@PostMapping(value = "/eliminar-conductor")
	public void eliminarConductor(@RequestBody Conductor conductor) {
		conductorService.eliminarConductor(conductor);
	}
	
	@PostMapping(value = "/listar-conductor")
	public @ResponseBody List<Conductor>  listarConductores() {
		List<Conductor> listCond = new ArrayList<Conductor>();
		Conductor cond = new Conductor(1, "123", "hamilton", "Daniel", "Jojoa", "Cordoba", 123, true);
		listCond.add(cond);
		//return conductorService.listarConductores();
		return listCond;
	}
	
}
