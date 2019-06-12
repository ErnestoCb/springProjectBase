package com.ercabello.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ercabello.springboot.backend.apirest.models.dao.ITiendaDao;
import com.ercabello.springboot.backend.apirest.models.entity.Tienda;

@Service
public class TiendaServiceImpl implements ITiendaService{

	@Autowired
	private ITiendaDao tiendaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tienda> findAll() {
		// TODO Auto-generated method stub
		return (List<Tienda>) tiendaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Tienda findById(Long id) {
		// TODO Auto-generated method stub
		return tiendaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Tienda save(Tienda tienda) {
		// TODO Auto-generated method stub
		return tiendaDao.save(tienda);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tiendaDao.deleteById(id);
	}
	
}
