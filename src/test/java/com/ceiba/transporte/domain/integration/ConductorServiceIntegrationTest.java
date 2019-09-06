package com.ceiba.transporte.domain.integration;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.service.ConductorService;
import com.ceiba.transporte.domain.testdatabuilder.ConductorTestDataBuilder;
import com.ceiba.transporte.infraestructure.db.ConductorRepositoryImpl;
import com.ceiba.transporte.infraestructure.db.jpa.ConductorRepositoryJPA;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConductorServiceIntegrationTest {

	private static final String CEDULA = "1061774664";
	private static final String PRIMER_NOMBRE = "Hamilton";
	private static final String SEGUNDO_NOMBRE = "Daniel";
	private static final String PRIMER_APELLIDO = "Jojoa";
	private static final String SEGUNDO_APELLIDO = "Cordoba";
	private static final String URL_BASE = "http://localhost:";
	//private static final boolean DISPONIBLE = true;

	@Autowired
	private ConductorRepositoryJPA repositoryJpa;

	@Autowired
	private ModelMapper mapper;
	
	@LocalServerPort
	private int port;

	@Test
	public void guardarConductorTest() {
		// arrange
		Conductor conductor = construirConductor();

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
		Conductor conductor = construirConductor();
		TestRestTemplate restTemplate = new TestRestTemplate();
		HttpEntity<Conductor> entity = new HttpEntity<Conductor>(conductor,new HttpHeaders());
		//act
		
		ResponseEntity<Conductor> response = restTemplate.exchange(obtenerUrl("/crear-conductor"), HttpMethod.POST,entity,Conductor.class);
		int status = response.getStatusCodeValue();
		//assert
		assertTrue(status ==200);
	}
	
//	@Test
//	public void listarConductorServiceTest() {
//		//arrange
//		Conductor conductor = construirConductor();
//		TestRestTemplate restTemplate = new TestRestTemplate();
//		HttpEntity<Conductor> entity = new HttpEntity<Conductor>(conductor,new HttpHeaders());
//		//act
//		ResponseEntity<Conductor> response = restTemplate.exchange(obtenerUrl("/listar-conductor"), HttpMethod.POST,entity,Conductor.class);
//		int status = response.getStatusCodeValue();
//		//assert
//		assertTrue(status ==200);
//	}
	
	private Conductor construirConductor() {
		return  new ConductorTestDataBuilder().withCedula(CEDULA).withPrimerApellido(PRIMER_APELLIDO)
				.withSegundoApellido(SEGUNDO_APELLIDO).withPrimerNombre(PRIMER_NOMBRE).withSegundoNombre(SEGUNDO_NOMBRE)
				.build();
	}
	private String obtenerUrl(String urlService) {
		return URL_BASE+port+"/transporte/conductor"+urlService;
	}
}
