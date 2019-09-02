package com.ceiba.transporte.domain.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.transporte.domain.model.Servicio;

@Component
public interface ServicioRepository {

	public void guardarServicio(Servicio servicio);
	public List<Servicio> listarTodoServicios();
}
