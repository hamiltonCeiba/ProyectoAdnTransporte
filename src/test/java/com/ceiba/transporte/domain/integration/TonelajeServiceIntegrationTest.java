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

import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.domain.service.TonelajeService;
import com.ceiba.transporte.domain.testdatabuilder.TonelajeTestDataBuilder;
import com.ceiba.transporte.infraestructure.db.TonelajeRepositoryImpl;
import com.ceiba.transporte.infraestructure.db.jpa.TonelajeRepositoryJPA;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TonelajeServiceIntegrationTest {

	private static final String RANGO = "0 - 5 TONELADAS";
	private static final double PRECIO= 5000;
	private static final Long ID = (long) 1;
	private static final String URL_BASE = "http://localhost:";
	
	@Autowired
	private TonelajeRepositoryJPA repositoryJpa;
	
	@Autowired
	private ModelMapper mapper;
	
	@LocalServerPort
	private int port;
	
	@Test
	public void guardarTonelaje() {
		//arrange
		Tonelaje tonelaje =  PeticionesIntegrationTest.construirTonelaje();
		TonelajeRepositoryImpl tonelajeRepository = new TonelajeRepositoryImpl(repositoryJpa,mapper);
		TonelajeService tonelajeService = new TonelajeService(tonelajeRepository);
		List<Tonelaje> listTonelaje = new ArrayList<>();
		listTonelaje.add(tonelaje);
		//act
		tonelajeRepository.guardarTonelaje(tonelaje);
		List<Tonelaje> listTonelajeRecuperado = tonelajeService.listarTonelaje();
		//assert
		assertTrue(tonelajeRepository.listarTonelaje().size() == listTonelajeRecuperado.size());
	}
	
	@Test
	public void guardarTonelajeServiceTest() {
		// arrange
		Tonelaje tonelaje = PeticionesIntegrationTest.construirTonelaje();
		//act
		ResponseEntity<Tonelaje> response = PeticionesIntegrationTest.guardarTonelaje(tonelaje,port);
		int status = response.getStatusCodeValue();
		// assertTrue(true);
		if (status == 200) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}	
	
}
