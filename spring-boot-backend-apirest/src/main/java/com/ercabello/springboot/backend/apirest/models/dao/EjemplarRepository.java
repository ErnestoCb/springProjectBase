package com.ercabello.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ercabello.springboot.backend.apirest.models.entity.Ejemplares;

public interface EjemplarRepository extends JpaRepository<Ejemplares, Long>{

	@Query(value = "SELECT * FROM db_springboot_casolibros.ejemplares e WHERE e.id_tienda= :idTienda",
			nativeQuery=true)
	public List<Ejemplares> findByIdTienda(@Param("idTienda") Long idTienda);
	
	@Query(value = "SELECT * FROM db_springboot_casolibros.ejemplares e WHERE e.id_libro= :idLibro",
			nativeQuery=true)
	public List<Ejemplares> findByIdLibro(@Param("idLibro") Long idLibro);
	
}
