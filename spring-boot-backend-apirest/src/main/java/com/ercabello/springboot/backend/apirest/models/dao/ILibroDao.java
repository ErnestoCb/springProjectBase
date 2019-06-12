package com.ercabello.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ercabello.springboot.backend.apirest.models.entity.Libro;

public interface ILibroDao extends CrudRepository<Libro, Long>{
	
	
	
}
