package com.ercabello.springboot.backend.apirest.models.services;

import java.util.List;

import com.ercabello.springboot.backend.apirest.models.entity.Ejemplares;

public interface IEjemplarService {
	
	public List<Ejemplares> findAll();
	
	public Ejemplares findById(Long id);
	
	public Ejemplares save(Ejemplares ejemplares);
	
	public void delete(Long id);
	
	public List<Ejemplares> findByIdTienda(Long idTienda);
	
	public List<Ejemplares> findByIdLibro(Long idLibro);

}