package com.ceiba.transporte.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.repository.ServicioRepository;

@Service
public class ServicioService {
	
	@Autowired
	ServicioRepository servicioRepository;
	
	public ServicioService(ServicioRepository servicioRepository) {
		this.servicioRepository = servicioRepository;
	}
	
	public void guardarServicio(Servicio servicio) {
		servicioRepository.guardarServicio(servicio);
	}
	
	public List<Servicio> listarTodoServicios(){
		return servicioRepository.listarTodoServicios();
	}	
	

}
