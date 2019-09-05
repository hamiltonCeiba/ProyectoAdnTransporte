package com.ceiba.transporte.domain.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.repository.TonelajeRepository;


@Service
public class TonelajeService {
	
	@Autowired
	TonelajeRepository tonelajeRepository;

	public TonelajeService(TonelajeRepository tonelajeRepository) {
		this.tonelajeRepository = tonelajeRepository;
	}
		
	public void guardarTonelaje(Tonelaje tonelaje) {
		tonelajeRepository.guardarTonelaje(tonelaje);
	}
	
	public List<Tonelaje> listarTonelaje() {
		return tonelajeRepository.listarTonelaje();
	}
	public void eliminarTonelaje(Tonelaje tonelaje) {
		tonelajeRepository.eliminarTonelaje(tonelaje);
	}
}
