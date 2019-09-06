package com.ceiba.transporte.infraestructure.db.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.transporte.infraestructure.entity.ServicioEntity;

public interface ServicioRepositoryJPA extends JpaRepository<ServicioEntity, Long> {

}
