package com.ercabello.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ercabello.springboot.backend.apirest.models.entity.Reserva;
import com.ercabello.springboot.backend.apirest.models.services.IReservaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/casolibros")
public class ReservaRestController {

	@Autowired
	private IReservaService iReservaService;
	
	@GetMapping("/reservas")
	public List<Reserva> index(){
		return iReservaService.findAll();
	}
	
	@GetMapping("/reservas/{id}")
	public Reserva show(@PathVariable Long id) {
		return iReservaService.findById(id);
	}
	
	@PostMapping("/reservas")
	@ResponseStatus(HttpStatus.CREATED)
	public Reserva create(@RequestBody Reserva reserva) {
		return iReservaService.save(reserva);
	}
	
	@PutMapping("/reservas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Reserva update(@RequestBody Reserva reserva, @PathVariable Long id) {
		Reserva reservaActual = iReservaService.findById(id);
		
		reservaActual.setEstado(reserva.getEstado());
		
		return iReservaService.save(reservaActual);
	}

	@DeleteMapping("/reservas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		iReservaService.delete(id);
	}
	
}
