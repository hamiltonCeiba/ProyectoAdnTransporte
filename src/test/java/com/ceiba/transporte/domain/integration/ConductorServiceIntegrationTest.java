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
import com.ceiba.transporte.domain.service.ConductorService;
import com.ceiba.transporte.infraestructure.db.ConductorRepositoryImpl;
import com.ceiba.transporte.infraestructure.db.jpa.ConductorRepositoryJPA;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConductorServiceIntegrationTest {

	@Autowired
	private ConductorRepositoryJPA repositoryJpa;

	@Autowired
	private ModelMapper mapper;
	
	@LocalServerPort
	private int port;

	@Test
	public void guardarConductorTest() {
		// arrange
		Conductor conductor = PeticionesIntegrationTest.construirConductor();

		ConductorRepositoryImpl conductorRepository = new ConductorRepositoryImpl(repositoryJpa, mapper);
		ConductorService conductorServicio = new ConductorService(conductorRepository);
		List<Conductor> listaConductores = new ArrayList<Conductor>();
		listaConductores.add(conductor);
		// act
		//conductorRepository.guardarConductor(conductor);
		List<Conductor> conductoresRecuperados = conductorServicio.listarConductores();

		// assert
		assertTrue((conductorRepository.listarConductore().size()) ==  conductoresRecuperados.size());		
	}
	
	@Test
	public void guardarConductorServiceTest() {
		// arrange
		Conductor conductor = PeticionesIntegrationTest.construirConductor();
		//act		
		ResponseEntity<Conductor> response = PeticionesIntegrationTest.guardarConductor(conductor, port);
		int status = response.getStatusCodeValue();
		//assert
		assertTrue(status ==200);
	}
	

	
	
}
