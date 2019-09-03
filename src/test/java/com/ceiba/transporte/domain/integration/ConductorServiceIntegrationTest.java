package com.ceiba.transporte.domain.integration;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
	//private static final boolean DISPONIBLE = true;

	@Autowired
	private ConductorRepositoryJPA repositoryJpa;

	@Autowired
	private ModelMapper mapper;

	@Test
	public void guardarConductorTest() {
		// arrange
		Conductor conductor = new ConductorTestDataBuilder().withCedula(CEDULA).withPrimerApellido(PRIMER_APELLIDO)
				.withSegundoApellido(SEGUNDO_APELLIDO).withPrimerNombre(PRIMER_NOMBRE).withSegundoNombre(SEGUNDO_NOMBRE)
				.build();

		ConductorRepositoryImpl conductorRepository = new ConductorRepositoryImpl(repositoryJpa, mapper);
		ConductorService conductorServicio = new ConductorService(conductorRepository);
		List<Conductor> listaConductores = new ArrayList<Conductor>();
		listaConductores.add(conductor);
		// act
		List<Conductor> conductoresRecuperados = conductorServicio.listarConductores();

		// assert
		assertTrue(listaConductores.size() == conductoresRecuperados.size());
	}
}
