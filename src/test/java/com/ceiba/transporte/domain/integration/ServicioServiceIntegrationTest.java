package com.ceiba.transporte.domain.integration;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.infraestructure.db.ServicioRepositoryImpl;
import com.ceiba.transporte.infraestructure.db.jpa.ServicioRepositoryJPA;

@RunWith(SpringRunner.class)
//@WebMvcTest(ServicioController.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServicioServiceIntegrationTest {

	//@Autowired
	//private MockMvc mvc;

	@Autowired
	private ServicioRepositoryJPA repositorioJpa;

	@Autowired
	private ModelMapper mapper;

	@LocalServerPort
	private int port;

	@Test
	public void guardarServicioTest() {
		// arrange
		Servicio servicio = PeticionesIntegrationTest.construirServicio();
		ServicioRepositoryImpl servicioRepositorio = new ServicioRepositoryImpl(repositorioJpa, mapper);
		List<Servicio> listServicio = new ArrayList<>();
		listServicio.add(servicio);
		// act
		//servicioRepositorio.guardarServicio(servicio);
		List<Servicio> listServicioRecuperados = servicioRepositorio.listarTodoServicios();
		// assert
		// assertTrue(true);
		assertTrue(listServicio.size() == listServicioRecuperados.size());
	}

	@Test
	public void guardarServicioServiceTest() {
		// arrange
		Tonelaje tonelaje = PeticionesIntegrationTest.construirTonelaje();
		PeticionesIntegrationTest.guardarTonelaje(tonelaje, port);
		Vehiculo vehiculo = PeticionesIntegrationTest.construirVehiculo();
		PeticionesIntegrationTest.guardarVehiculo(vehiculo, port);
		Conductor conductor = PeticionesIntegrationTest.construirConductor();
		PeticionesIntegrationTest.guardarConductor(conductor, port);
		Servicio servicio = PeticionesIntegrationTest.construirServicio();
		// act
		ResponseEntity<Servicio> response = PeticionesIntegrationTest.guardarServicio(servicio, port);
		int status = response.getStatusCodeValue();
		// assertTrue(true);
		if (status == 200) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

}
