package com.ceiba.transporte.domain.repository;

import java.util.List;
import com.ceiba.transporte.domain.model.Vehiculo;

public interface VehiculoRepository {

	public void guardarVehiculo(Vehiculo vehiculo);
	public void eliminarVehiculoPorPlaca(String placa);
	public List<Vehiculo> listarVehiculo();
	public List<Vehiculo> listarVehiculosDisponibles();
	public List<Vehiculo> listarVehiculosNoDisponibles();
}
