package com.ceiba.transporte.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.repository.ConductorRepository;

@Service
public class ConductorService {
	
	@Autowired
	ConductorRepository conductorRepository;
	
	public ConductorService(ConductorRepository conductorRepository) {
		this.conductorRepository = conductorRepository;
	}

		
	public void guardarConductor(Conductor conductor) {
		conductorRepository.guardarConductor(conductor);
	}
	
	public void eliminarConductor(Conductor conductor) {
		conductorRepository.eliminarConductor(conductor);
	}
	public List<Conductor> listarConductores(){
		return conductorRepository.listarConductore();
	}
	
}
