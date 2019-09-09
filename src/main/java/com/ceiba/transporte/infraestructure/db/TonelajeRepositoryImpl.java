package com.ceiba.transporte.infraestructure.db;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ceiba.transporte.domain.model.Tonelaje;
import com.ceiba.transporte.domain.repository.TonelajeRepository;
import com.ceiba.transporte.infraestructure.db.jpa.TonelajeRepositoryJPA;
import com.ceiba.transporte.infraestructure.entity.TonelajeEntity;

@Repository
public class TonelajeRepositoryImpl implements TonelajeRepository {

	@Autowired
	private TonelajeRepositoryJPA repositorio;

	@Autowired
	private ModelMapper modelMapper;

	public TonelajeRepositoryImpl(TonelajeRepositoryJPA repositorio, ModelMapper modelMapper) {
		super();
		this.repositorio = repositorio;
		this.modelMapper = modelMapper;
	}

	@Override
	public void guardarTonelaje(Tonelaje tonelaje) {
		repositorio.save(convertToEntity(tonelaje));
	}

	@Override
	public List<Tonelaje> listarTonelaje() {
		List<TonelajeEntity> listEntity = repositorio.findAll();
		List<Tonelaje> listTonelaje = new ArrayList<>();
		listEntity.forEach(entity -> {
			listTonelaje.add(convertToTonelaje(entity));
		});
		return listTonelaje;
	}

	@Override
	public void eliminarTonelaje(Tonelaje tonelaje) {
		repositorio.delete(convertToEntity(tonelaje));
	}

	private TonelajeEntity convertToEntity(Tonelaje tonelaje) {
		return modelMapper.map(tonelaje, TonelajeEntity.class);
	}

	private Tonelaje convertToTonelaje(TonelajeEntity tonelaje) {
		return modelMapper.map(tonelaje, Tonelaje.class);
	}

	@Override
	public Tonelaje obtenerTonelajePorId(long idTonelaje) {
		return convertToTonelaje(repositorio.buscarPorId(idTonelaje));
	}

	@Override
	public void actualizarTonelaje(Tonelaje tonelaje) {
		repositorio.deleteById(tonelaje.getId());
		repositorio.save(convertToEntity(tonelaje));		
	}
	
	

}
