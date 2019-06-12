package com.ercabello.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ercabello.springboot.backend.apirest.models.dao.ILibroDao;
import com.ercabello.springboot.backend.apirest.models.entity.Libro;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroDao libroDao;
	@Override
	//no es necesario el transactional en este findall por que ya viene pero es bueno tenerlo
	@Transactional(readOnly = true)
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
		return (List<Libro>) libroDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Libro findById(Long id) {
		// TODO Auto-generated method stub
		return libroDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Libro save(Libro libro) {
		// TODO Auto-generated method stub
		return libroDao.save(libro);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		libroDao.deleteById(id);
	}
	
}
