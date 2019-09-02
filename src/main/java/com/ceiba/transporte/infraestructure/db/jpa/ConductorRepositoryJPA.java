package com.ceiba.transporte.infraestructure.db.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.ceiba.transporte.infraestructure.entity.ConductorEntity;

public interface ConductorRepositoryJPA  extends JpaRepository<ConductorEntity,Long> 
{
	@Query("SELECT c FROM ConductorEntity ")
	List<ConductorEntity> listConductores();
}
