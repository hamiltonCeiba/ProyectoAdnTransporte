package com.ceiba.transporte.domain.repository;

import java.util.List;

import com.ceiba.transporte.domain.model.Conductor;

public interface ConductorRepository {

	public void guardarConductor(Conductor conductor);
	public void eliminarConductor(Conductor idConductor);
	public List<Conductor> listarConductore();
	public boolean eliminarConductorPorCedula(String cedulaConductor);
}
