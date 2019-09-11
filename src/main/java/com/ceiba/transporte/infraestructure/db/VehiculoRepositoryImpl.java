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
	
	public VehiculoRepositoryImpl(VehiculoRepositoryJPA repositorio, ModelMapper mapper) {
		super();
		this.repositorio = repositorio;
		this.mapper = mapper;
	}
	
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
		VehiculoEntity entity =mapper.map(vehiculo,VehiculoEntity.class); 
		return 	entity;
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

	@Override
	public void eliminarVehiculo(Vehiculo vehiculo) {
		repositorio.deleteById(vehiculo.getIdVehiculo());
		
	}

	@Override
	public Vehiculo actualizarVehiculo(Vehiculo vehiculo) {
		repositorio.deleteById(vehiculo.getIdVehiculo());
		return convertToVehiculo(repositorio.save(convertToEntity(vehiculo)));
	}

	@Override
	public Vehiculo buscarVehiculoPorId(long idVehiculo) {
		return convertToVehiculo(repositorio.buscarVehiculoPorId(idVehiculo));
	}
}
