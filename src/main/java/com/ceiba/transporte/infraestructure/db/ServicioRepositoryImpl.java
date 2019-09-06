package com.ceiba.transporte.infraestructure.db;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ceiba.transporte.domain.model.Servicio;
import com.ceiba.transporte.domain.repository.ServicioRepository;
import com.ceiba.transporte.infraestructure.db.jpa.ServicioRepositoryJPA;
import com.ceiba.transporte.infraestructure.entity.ServicioEntity;

@Repository
public class ServicioRepositoryImpl implements ServicioRepository {

	@Autowired
	private ServicioRepositoryJPA repositorio;
	
	@Autowired
	private ModelMapper mapper;
	
	public ServicioRepositoryImpl(ServicioRepositoryJPA repositorio,ModelMapper mapper) {
		this.repositorio = repositorio;
		this.mapper = mapper;
	}
	
	@Override
	public void guardarServicio(Servicio servicio) {
		ServicioEntity entity = mapper.map(servicio, ServicioEntity.class);
		repositorio.save(entity);		
	}

	@Override
	public List<Servicio> listarTodoServicios() {
		List<ServicioEntity> listEntity = repositorio.findAll();
		List<Servicio> listServicio = new ArrayList<>();
		listEntity.forEach(entity->{listServicio.add(mapper.map(entity,Servicio.class));});
		return listServicio;
	}

}
