package com.ceiba.transporte.domain.integration;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.Month;
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
import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.domain.testdatabuilder.ServicioTestDataBuilder;
import com.ceiba.transporte.infraestructure.db.ServicioRepositoryImpl;
import com.ceiba.transporte.infraestructure.db.jpa.ServicioRepositoryJPA;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServicioServiceIntegrationTest {

	private static final String CEDULA = "1061774664";
	private static final String PRIMER_NOMBRE = "Hamilton";
	private static final String SEGUNDO_NOMBRE = "Daniel";
	private static final String PRIMER_APELLIDO = "Jojoa";
	private static final String SEGUNDO_APELLIDO = "Cordoba";
	private static final String URL_BASE = "http://localhost:";
	private static final String RANGO = "0 - 5 TONELADAS";
	private static final double PRECIO= 5000;
	private static final double CAPACIDAD = 20.5;
	private static final boolean DISPINIBILIDAD = Boolean.TRUE;
	private static final int MODELO = 2016;
	private static final String PLACA = "BFZ-26C";
	private static final String CELULAR = "3206634722";
	
	@Autowired
	private ServicioRepositoryJPA repositorioJpa;
	
	@Autowired
	private ModelMapper mapper;
	
	@LocalServerPort
	private int port;
	
	@Test
	public void guardarServicioTest() {
		//arrange
		Servicio servicio = construirServicio();
		ServicioRepositoryImpl servicioRepositorio = new ServicioRepositoryImpl(repositorioJpa, mapper);
		List<Servicio> listServicio = new ArrayList<>();
		listServicio.add(servicio);
		//act
		List<Servicio> listServicioRecuperados = servicioRepositorio.listarTodoServicios();
		//assert
		assertTrue(listServicio.size() == listServicioRecuperados.size());
	}
	
	@Test
	public void guardarServicioServiceTest() {
		//arrange
		Servicio servicio = construirServicio();
		TestRestTemplate restTemplate = new TestRestTemplate();
		HttpEntity<Servicio> entity = new HttpEntity<Servicio>(servicio,new HttpHeaders());
		//act
		ResponseEntity<Vehiculo> response = restTemplate.exchange(obtenerUrl("/crear-servicio"), HttpMethod.POST,entity,Vehiculo.class);
		int status = response.getStatusCodeValue();
		if(status == 200) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
	}
	
	private Servicio construirServicio() {
		LocalDateTime soat = LocalDateTime.of(2019, Month.AUGUST, 15, 13, 0);
		LocalDateTime tecnomecanica = LocalDateTime.of(2019, Month.AUGUST, 15, 13, 0);
		Conductor conductor = new Conductor(CEDULA,PRIMER_NOMBRE,SEGUNDO_NOMBRE,PRIMER_APELLIDO,SEGUNDO_APELLIDO,CELULAR);
		Tonelaje tonelaje = new Tonelaje(1,RANGO, PRECIO);
		Vehiculo vehiculo = new Vehiculo(PLACA, MODELO, soat, tecnomecanica, CAPACIDAD, DISPINIBILIDAD, tonelaje); 
		return new ServicioTestDataBuilder().withConductor(conductor).withVehiculo(vehiculo).withDireccionFinal("").build();
	}
	private String obtenerUrl(String urlService) {
		return URL_BASE+port+"/transporte/servicio"+urlService;
	}
}
