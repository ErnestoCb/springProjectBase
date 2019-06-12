package com.ercabello.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ercabello.springboot.backend.apirest.models.entity.Tienda;

public interface ITiendaDao extends CrudRepository<Tienda, Long> {

}