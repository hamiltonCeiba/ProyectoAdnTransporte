package com.ceiba.transporte.infraestructure.db;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.repository.ConductorRepository;
import com.ceiba.transporte.infraestructure.db.jpa.ConductorRepositoryJPA;
import com.ceiba.transporte.infraestructure.entity.ConductorEntity;

@Repository 
public class ConductorRepositoryImpl implements ConductorRepository {

	@Autowired
	private ConductorRepositoryJPA repositorio;

	@Autowired
	private ModelMapper mapper;
	
	public ConductorRepositoryImpl(ConductorRepositoryJPA repositorio, ModelMapper mapper) {
		super();
		this.repositorio = repositorio;
		this.mapper = mapper;
	}

	@Override
	public void guardar(Conductor conductor) {
		ConductorEntity entity = mapper.map(conductor, ConductorEntity.class);
		repositorio.save(entity);

	}

	@Override
	public void eliminar(Conductor conductor) {
		repositorio.delete(mapper.map(conductor, ConductorEntity.class));
	}

	@Override
	public List<Conductor> listar() {
		List<ConductorEntity> listconductor = repositorio.listConductores();
		List<Conductor> listaConductores = new ArrayList<>();
		listconductor.forEach(conductor-> {
			listaConductores.add(mapper.map(conductor, Conductor.class));
					});
		return listaConductores;
	}
	
	@Override
	public boolean eliminarPorCedula(String cedula) {
		int resultSql = repositorio.eliminarConductorPorCedula(cedula);
		return resultSql == 1;
	}

}
