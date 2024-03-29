package com.ceiba.transporte.infraestructure.db.jpa;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.transporte.infraestructure.entity.ConductorEntity;

public interface ConductorRepositoryJPA extends JpaRepository<ConductorEntity, Long> {
	@Query("SELECT c FROM ConductorEntity c ")
	List<ConductorEntity> listConductores();

	// @Query("DELETE FROM ConductorEntity where cedula = :cedula")
	@Transactional
	@Modifying
	@Query("DELETE FROM ConductorEntity WHERE cedula = :cedula")
	int eliminarConductorPorCedula(@Param(value = "cedula") String cedula);

}
