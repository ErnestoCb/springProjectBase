package com.ercabello.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ercabello.springboot.backend.apirest.models.entity.Venta;

public interface IVentaDao extends CrudRepository<Venta, Long> {

}