package com.ceiba.transporte.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.repository.ConductorRepository;

@Service
public class ConductorService {
	// Los servicios los puede crear por cada responsabilidad que se tenga.
	@Autowired
	ConductorRepository conductorRepository;
	
	public ConductorService(ConductorRepository conductorRepository) {
		this.conductorRepository = conductorRepository;
	}

		
	public void guardarConductor(Conductor conductor) {
		conductorRepository.guardar(conductor);
	}
	
	public void eliminarConductor(Conductor conductor) {
		conductorRepository.eliminar(conductor);
	}
	
	public boolean eliminarConductorPorCedula(String cedulaConductor) {
		return conductorRepository.eliminarPorCedula(cedulaConductor);
	}
	
	public List<Conductor> listarConductores(){
		return conductorRepository.listar();
	}
	
}
