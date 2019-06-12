package com.ercabello.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ercabello.springboot.backend.apirest.models.dao.EjemplarRepository;
import com.ercabello.springboot.backend.apirest.models.entity.Ejemplares;

@Service
public class EjemplarServiceImpl implements IEjemplarService{

	@Autowired
	private EjemplarRepository ejemplarRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ejemplares> findAll() {
		// TODO Auto-generated method stub
		return (List<Ejemplares>) ejemplarRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Ejemplares findById(Long id) {
		// TODO Auto-generated method stub
		return ejemplarRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Ejemplares save(Ejemplares ejemplares) {
		// TODO Auto-generated method stub
		return ejemplarRepository.save(ejemplares);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ejemplarRepository.deleteById(id);
	}
	

	@Override
	@Transactional(readOnly = true)
	public List<Ejemplares> findByIdTienda(Long idTienda) {

		List<Ejemplares> ejemplares;
		ejemplares = ejemplarRepository.findByIdTienda(idTienda);
		
		return ejemplares;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Ejemplares> findByIdLibro(Long idLibro) {

		List<Ejemplares> ejemplares;
		ejemplares = ejemplarRepository.findByIdLibro(idLibro);
		
		return ejemplares;
	}

}