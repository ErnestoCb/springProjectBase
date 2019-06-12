package com.ercabello.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ercabello.springboot.backend.apirest.models.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long>{
	
	@Query(value = "SELECT * FROM db_springboot_casolibros.factura WHERE rut_persona= :rutPersona",
			nativeQuery=true)
	public List<Factura> findByRutPersona(@Param("rutPersona") String rutPersona);
	
}
