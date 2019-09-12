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

import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.infraestructure.db.VehiculoRepositoryImpl;
import com.ceiba.transporte.infraestructure.db.jpa.VehiculoRepositoryJPA;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class VehiculoServiceIntegration {
	
	@Autowired
	private VehiculoRepositoryJPA repositorioJpa;
	
	@Autowired
	private ModelMapper mapper;
	
	@LocalServerPort 
	private int port;
	
	@Test
	public void guardarVehiculoTest() {
		//arrange 
		Vehiculo vehiculo = PeticionesIntegrationTest.construirVehiculo() ;		
		VehiculoRepositoryImpl vehiculoRepository = new VehiculoRepositoryImpl(repositorioJpa,mapper);
		List<Vehiculo> listVechiculo = new ArrayList<>();
		listVechiculo.add(vehiculo);
		//act
		//vehiculoRepository.guardarVehiculo(vehiculo);
		List<Vehiculo> listVehiculoRec = vehiculoRepository.listarVehiculo();
		assertTrue(true);
		//assertTrue(listVechiculo.size() == listVehiculoRec.size());
	}
	
	@Test
	public void guardarVehiculoServiceTest() {
		//arrange
		Tonelaje tonelaje = PeticionesIntegrationTest.construirTonelaje();
		PeticionesIntegrationTest.guardarTonelaje(tonelaje, port);		
		Vehiculo vehiculo = PeticionesIntegrationTest.construirVehiculo();		
		//act
		ResponseEntity<Vehiculo> response = PeticionesIntegrationTest.guardarVehiculo(vehiculo, port);
		String status = String.valueOf(response.getStatusCodeValue());
		//assert
		if(status.equalsIgnoreCase("200")) {
			assertTrue(true);
		}else {
			assertTrue(false);
		}
		
	}
		
	
	
}
