package com.ercabello.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ercabello.springboot.backend.apirest.models.entity.Factura;
import com.ercabello.springboot.backend.apirest.models.services.IFacturaService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/casolibros")
public class FacturaRestController {

	@Autowired
	private IFacturaService facturaService;
	
	@GetMapping("/facturas")
	public List<Factura> index(){
		return facturaService.findAll();
	}
	
	@GetMapping("/facturas/{id}")
	public Factura show(@PathVariable Long id) {
		return facturaService.findById(id);
	}
	
	@PostMapping("/facturas")
	@ResponseStatus(HttpStatus.CREATED)
	public Factura create(@RequestBody Factura factura) {
		return facturaService.save(factura);
	}

	@DeleteMapping("/facturas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		facturaService.delete(id);
	}
	
	@GetMapping("/getFacturasByRutPersona/{rutPersona}")
    public List<Factura> getFacturasByRutPersona(@PathVariable String rutPersona){
        return facturaService.findByRutPersona(rutPersona);
    }
}
