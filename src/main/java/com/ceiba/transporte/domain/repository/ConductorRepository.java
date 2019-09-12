package com.ceiba.transporte.domain.repository;

import java.util.List;

import com.ceiba.transporte.domain.model.Conductor;

public interface ConductorRepository {
// Documentar las interfaces
	public void guardar(Conductor conductor);
	public void eliminar(Conductor idConductor);
	public List<Conductor> listar();
	public boolean eliminarPorCedula(String cedulaConductor);
}
