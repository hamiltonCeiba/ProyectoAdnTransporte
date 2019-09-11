package com.ceiba.transporte.domain.repository;

import java.util.List;
import com.ceiba.transporte.domain.model.Vehiculo;

public interface VehiculoRepository {

	public void guardarVehiculo(Vehiculo vehiculo);
	public void eliminarVehiculoPorPlaca(String placa);
	public List<Vehiculo> listarVehiculo();
	public List<Vehiculo> listarVehiculosDisponibles();
	public List<Vehiculo> listarVehiculosNoDisponibles();
	public void eliminarVehiculo(Vehiculo vehiculo);
	public Vehiculo actualizarVehiculo(Vehiculo vehiculo);
	public Vehiculo buscarVehiculoPorId(long idVehiculo);
}
