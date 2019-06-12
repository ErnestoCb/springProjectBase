package com.ercabello.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ercabello.springboot.backend.apirest.models.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{

}
