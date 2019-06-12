package com.ercabello.springboot.backend.apirest.models.services;

import java.util.List;

import com.ercabello.springboot.backend.apirest.models.entity.Factura;

public interface IFacturaService {

	public List<Factura> findAll();
	
	public Factura findById(Long id);
	
	public Factura save(Factura factura);
	
	public void delete(Long id);
	
	public List<Factura> findByRutPersona(String rutPersona);
	
}
