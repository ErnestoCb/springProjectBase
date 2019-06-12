package com.ercabello.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ercabello.springboot.backend.apirest.models.dao.FacturaRepository;
import com.ercabello.springboot.backend.apirest.models.entity.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return (List<Factura>) facturaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Factura findById(Long id) {
		// TODO Auto-generated method stub
		return facturaRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Factura save(Factura factura) {
		// TODO Auto-generated method stub
		return facturaRepository.save(factura);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		facturaRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Factura> findByRutPersona(String rutPersona) {
		// TODO Auto-generated method stub
		List<Factura> facturas;
		facturas = facturaRepository.findByRutPersona(rutPersona);
		
		return facturas;
	}
	
}

