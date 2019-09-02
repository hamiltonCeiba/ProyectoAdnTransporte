package com.ceiba.transporte.infraestructure.db;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.ceiba.transporte.domain.model.Conductor;
import com.ceiba.transporte.domain.repository.ConductorRepository;
import com.ceiba.transporte.infraestructure.db.jpa.ConductorRepositoryJPA;
import com.ceiba.transporte.infraestructure.entity.ConductorEntity;

public class ConductorRepositoryImpl implements ConductorRepository {

	@Autowired
	private ConductorRepositoryJPA repositorio;

	@Autowired
	private ModelMapper mapper;

	@Override
	public void guardarConductor(Conductor conductor) {
		repositorio.save(mapper.map(conductor, ConductorEntity.class));

	}

	@Override
	public void eliminarConductor(Conductor conductor) {
		repositorio.delete(mapper.map(conductor, ConductorEntity.class));

	}

	@Override
	public List<Conductor> listarConductore() {
		List<ConductorEntity> listconductor = (List<ConductorEntity>) repositorio.listConductores();
		List<Conductor> listaConductores = new ArrayList<Conductor>();
		listconductor.forEach((conductor)->{
			listaConductores.add(mapper.map(conductor, Conductor.class));
					});
		return listaConductores;
	}

}
