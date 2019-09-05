package com.ceiba.transporte.infraestructure.db;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ceiba.transporte.domain.model.Vehiculo;
import com.ceiba.transporte.domain.repository.VehiculoRepository;
import com.ceiba.transporte.infraestructure.db.jpa.VehiculoRepositoryJPA;
import com.ceiba.transporte.infraestructure.entity.VehiculoEntity;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{

	@Autowired
	private VehiculoRepositoryJPA repositorio;
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public void guardarVehiculo(Vehiculo vehiculo) {
		VehiculoEntity entity = convertToEntity(vehiculo);
		repositorio.save(entity);		
	}

	@Override
	public void eliminarVehiculoPorPlaca(String placa) {
		repositorio.eliminarVehiculoPorPlaca(placa);	
	}

	@Override
	public List<Vehiculo> listarVehiculo() {		
		return listVehiculos(repositorio.findAll());
	}

	@Override
	public List<Vehiculo> listarVehiculosDisponibles() {
		return null;//listVehiculos(repositorio.listarVechiculos(true));
	}

	@Override
	public List<Vehiculo> listarVehiculosNoDisponibles() {
		return null;//listVehiculos(repositorio.listarVechiculos(false));
	}

	
	private VehiculoEntity convertToEntity(Vehiculo vehiculo) {
		return mapper.map(vehiculo,VehiculoEntity.class);		
	}
	
	private Vehiculo convertToVehiculo(VehiculoEntity entity) {
		return mapper.map(entity,Vehiculo.class);
	}
	
	private List<Vehiculo> listVehiculos(List<VehiculoEntity> listEntity){
		List<Vehiculo> listaVehiculos = new ArrayList<>();
		listEntity.forEach(entity->{
			listaVehiculos.add(convertToVehiculo(entity));
			});
		return listaVehiculos;
	}
}
