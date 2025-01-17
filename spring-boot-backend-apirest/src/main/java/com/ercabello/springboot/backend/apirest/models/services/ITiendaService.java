package com.ercabello.springboot.backend.apirest.models.services;

import java.util.List;

import com.ercabello.springboot.backend.apirest.models.entity.Tienda;

public interface ITiendaService {

	public List<Tienda> findAll();

	public Tienda findById(Long id);
	
	public Tienda save(Tienda tienda);
	
	public void delete(Long id);
}
