package com.ceiba.transporte.domain.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.transporte.domain.model.Tonelaje;

@Component
public interface TonelajeRepository {

	public void guardarTonelaje(Tonelaje tonelaje);
	public List<Tonelaje> listarTonelaje();
	public void eliminarTonelaje(Tonelaje tonelaje);
	public Tonelaje obtenerTonelajePorId(long idTonelaje);
	public Tonelaje actualizarTonelaje(Tonelaje tonelaje);
}
