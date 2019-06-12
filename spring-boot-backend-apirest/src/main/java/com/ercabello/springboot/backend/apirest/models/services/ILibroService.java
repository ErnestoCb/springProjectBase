package com.ercabello.springboot.backend.apirest.models.services;

import java.util.List;

import com.ercabello.springboot.backend.apirest.models.entity.Libro;

public interface ILibroService {
	
	public List<Libro> findAll();
	
	public Libro findById(Long id);
	
	public Libro save(Libro libro);
	
	public void delete(Long id);
	
}
