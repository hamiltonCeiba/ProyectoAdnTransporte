package com.ceiba.transporte.infraestructure.db.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ceiba.transporte.infraestructure.entity.VehiculoEntity;

public interface VehiculoRepositoryJPA extends JpaRepository<VehiculoEntity, Long>{

	@Query("SELECT c FROM VehiculoEntity c where c.placa = :placa")
	VehiculoEntity buscarVehiculoPorPlaca(@Param(value = "placa")String placa);
	
//	@Query("SELECT c FROM VehiculoEntity where c.disponible = :param")
//	List<VehiculoEntity> listarVechiculos(@Param(value = "param")boolean disponible);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM VehiculoEntity where placa = :placa")
	int eliminarVehiculoPorPlaca(@Param(value = "placa")String placa);
	
}
