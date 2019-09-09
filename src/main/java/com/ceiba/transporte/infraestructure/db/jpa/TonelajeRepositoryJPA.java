package com.ceiba.transporte.infraestructure.db.jpa;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ceiba.transporte.infraestructure.entity.TonelajeEntity;

public interface TonelajeRepositoryJPA extends JpaRepository<TonelajeEntity, Long> {

	@Query("SELECT c FROM TonelajeEntity c where c.id = :id")
	TonelajeEntity buscarPorId(@Param(value = "id")long id);
	
}
