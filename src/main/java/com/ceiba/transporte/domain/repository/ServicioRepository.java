package com.ceiba.transporte.domain.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.transporte.domain.model.Servicio;

@Component // no amarrar a ninguna tecnologia, el dominio deberia quedar lo mas limpio posible
public interface ServicioRepository {
// Este nombramiento no es en terminos de negocio, podria ser ServicioTransporte
	public void guardarServicio(Servicio servicio);
	public List<Servicio> listarTodoServicios();
}
