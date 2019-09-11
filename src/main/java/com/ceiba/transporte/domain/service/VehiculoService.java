package com.ceiba.transporte.domain.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.domain.repository.VehiculoRepository;

@Service
public class VehiculoService {

	@Autowired
	VehiculoRepository vehiculoRepository;
	
	public VehiculoService() {
		
	}
	
	public VehiculoService(VehiculoRepository vehiculoRepository) {
		this.vehiculoRepository = vehiculoRepository;
	}
	
	public void guardarVehiculo(Vehiculo vehiculo) {
		vehiculoRepository.guardarVehiculo(vehiculo);
	}
	
	public void eliminarVehiculo(String placa) {
		vehiculoRepository.eliminarVehiculoPorPlaca(placa);
	}
	
	public List<Vehiculo> listarVehiculo(){
		return vehiculoRepository.listarVehiculo();
	}
	
	public void eliminarVehiculo(Vehiculo vehiculo) {
		vehiculoRepository.eliminarVehiculo(vehiculo);
	}
	
	public Vehiculo actualizarVehiculo(Vehiculo vehiculo) {
		return vehiculoRepository.actualizarVehiculo(vehiculo);
	}
	
	public Vehiculo buscarVehiculoPorId(long idVehiculo) {
		return vehiculoRepository.buscarVehiculoPorId(idVehiculo);
	}
	
}
