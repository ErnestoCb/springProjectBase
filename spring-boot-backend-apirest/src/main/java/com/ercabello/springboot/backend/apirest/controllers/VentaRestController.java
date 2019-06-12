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

import com.ercabello.springboot.backend.apirest.models.entity.Venta;
import com.ercabello.springboot.backend.apirest.models.services.IVentaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/casolibros")
public class VentaRestController {

	@Autowired
	private IVentaService ventaService;
	
	@GetMapping("/ventas")
	public List<Venta> index(){
		return ventaService.findAll();
	}
	
	@GetMapping("/ventas/{id}")
	public Venta show(@PathVariable Long id) {
		return ventaService.findById(id);
	}
	
	@PostMapping("/ventas")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta create(@RequestBody Venta venta) {
		return ventaService.save(venta);
	}
	
	@PutMapping("/ventas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta update(@RequestBody Venta venta, @PathVariable Long id) {
		Venta ventaActual = ventaService.findById(id);
		
		ventaActual.setEstado(venta.getEstado());
		
		return ventaService.save(ventaActual);
	}
	
	@DeleteMapping("/ventas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ventaService.delete(id);
	}
}
