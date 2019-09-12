package com.ceiba.transporte.domain.integration;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.domain.testdatabuilder.ConductorTestDataBuilder;
import com.ceiba.transporte.domain.testdatabuilder.ServicioTestDataBuilder;
import com.ceiba.transporte.domain.testdatabuilder.TonelajeTestDataBuilder;
import com.ceiba.transporte.domain.testdatabuilder.VehiculoTestDataBuilder;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public final class PeticionesIntegrationTest {

	//Tonelaje
	private static final String RANGO = "0 - 5 TONELADAS";
	private static final double PRECIO= 5000;
	private static final Long ID = (long) 1;
	private static final String URL_BASE = "http://localhost:";
	//Vehiculo
	private static final double CAPACIDAD = 20.5;
	private static final boolean DISPINIBILIDAD = true;
	private static final int MODELO = 2016;
	private static final String PLACA = "BFZ-26C";
	//Conductor
	private static final String CEDULA = "1061774664";
	private static final String PRIMER_NOMBRE = "Hamilton";
	private static final String SEGUNDO_NOMBRE = "Daniel";
	private static final String PRIMER_APELLIDO = "Jojoa";
	private static final String SEGUNDO_APELLIDO = "Cordoba";
	//Servicio	
	private static final String CELULAR = "3206634722";
	private static final String MEDELLIN = "Medellin";
	private static final long DISTANCIA = 20;
	private static final String DIRECCION_FINAL ="dirección final";
	
	public static String obtenerUrl(String urlService, int port) {
		return URL_BASE + port + "/transporte/" + urlService;
	}
	
	public static Tonelaje construirTonelaje() {
		return new TonelajeTestDataBuilder().withRango(RANGO).withPrecio(PRECIO).withId(ID).build();
	}
	
	public static ResponseEntity<Tonelaje> guardarTonelaje(Tonelaje tonelaje, int port) {		
		TestRestTemplate restTemplate = new TestRestTemplate();
		HttpEntity<Tonelaje> entity = new HttpEntity<Tonelaje>(tonelaje, new HttpHeaders());		
		ResponseEntity<Tonelaje> response = restTemplate.exchange(obtenerUrl("tonelaje/crear-tonelaje",port), HttpMethod.POST,
				entity, Tonelaje.class);
		return response;
	}
	public static ResponseEntity<Vehiculo> guardarVehiculo(Vehiculo vehiculo, int port){
		TestRestTemplate restTemplate = new TestRestTemplate();
		HttpEntity<Vehiculo> entity = new HttpEntity<Vehiculo>(vehiculo,new HttpHeaders());
		ResponseEntity<Vehiculo> response = restTemplate.exchange(obtenerUrl("vehiculo/crear-vehiculo",port), HttpMethod.POST,entity,Vehiculo.class);
		return response;
	}
	
	public static Vehiculo construirVehiculo() {
		LocalDateTime soat = LocalDateTime.of(2019, Month.AUGUST, 15, 13, 0);
		LocalDateTime tecnomecanica = LocalDateTime.of(2019, Month.AUGUST, 15, 13, 0);
		Tonelaje tonelaje = new Tonelaje(1,"0 - 1 tonelaje",20.5);
		return new VehiculoTestDataBuilder().withCapacidad(CAPACIDAD)
				.withDisponible(DISPINIBILIDAD).withModelo(MODELO)
				.withPlaca(PLACA).withSoat(soat).withTecnomecanica(tecnomecanica)
				.withTonelaje(tonelaje)
				.build();
	}
	
	public static ResponseEntity<Conductor> guardarConductor(Conductor conductor, int port){
		TestRestTemplate restTemplate = new TestRestTemplate();
		HttpEntity<Conductor> entity = new HttpEntity<Conductor>(conductor,new HttpHeaders());
		ResponseEntity<Conductor> response = restTemplate.exchange(obtenerUrl("conductor/crear-conductor",port), HttpMethod.POST,entity,Conductor.class);
		return response;
	}
	public static Conductor construirConductor() {
		return  new ConductorTestDataBuilder().withCedula(CEDULA).withPrimerApellido(PRIMER_APELLIDO)
				.withSegundoApellido(SEGUNDO_APELLIDO).withPrimerNombre(PRIMER_NOMBRE).withSegundoNombre(SEGUNDO_NOMBRE)
				.build();
	}
	
	public static ResponseEntity<Servicio> guardarServicio(Servicio servicio, int port){
		TestRestTemplate restTemplate = new TestRestTemplate();
		HttpEntity<Servicio> entity = new HttpEntity<Servicio>(servicio,new HttpHeaders());
		ResponseEntity<Servicio> response = restTemplate.exchange(obtenerUrl("servicio/crear-servicio",port), HttpMethod.POST,entity,Servicio.class);
		return response;
	}
	
	public static Servicio construirServicio() {
		LocalDateTime soat = LocalDateTime.of(2019, Month.AUGUST, 15, 13, 0);
		LocalDateTime tecnomecanica = LocalDateTime.of(2019, Month.AUGUST, 15, 13, 0);
		Conductor conductor = new Conductor(ID,CEDULA, PRIMER_NOMBRE, SEGUNDO_NOMBRE, PRIMER_APELLIDO,
				SEGUNDO_APELLIDO, CELULAR);
		Tonelaje tonelaje = new Tonelaje(ID,RANGO, PRECIO);
		Vehiculo vehiculo = new Vehiculo(ID,PLACA, MODELO, soat, tecnomecanica, CAPACIDAD, DISPINIBILIDAD,
				tonelaje);
		return new ServicioTestDataBuilder()
				.withConductor(conductor)
				.withVehiculo(vehiculo)
				.withDireccionFinal(DIRECCION_FINAL)
				.withMunicipioFinal(MEDELLIN)
				.withDistanciaKm(DISTANCIA)
				.build();
	}
}
