package com.ceiba.transporte.domain.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ceiba.transporte.domain.model.Vehiculo;

@Component
public interface VehiculoRepository {

	public void guardarVehiculo(Vehiculo vehiculo);
	public void eliminarVehiculo(int Idvehiculo);
	public List<Vehiculo> listarVehiculo();
	public List<Vehiculo> listarVehiculosDisponibles();
	public List<Vehiculo> listarVehiculosNoDisponibles();
}
