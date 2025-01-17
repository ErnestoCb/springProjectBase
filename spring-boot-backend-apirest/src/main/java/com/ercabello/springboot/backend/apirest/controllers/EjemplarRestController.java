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

import com.ercabello.springboot.backend.apirest.models.services.IEjemplarService;
import com.ercabello.springboot.backend.apirest.models.entity.Ejemplares;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/casolibros")
public class EjemplarRestController {

	@Autowired
	private IEjemplarService ejemplarService;
	
	@GetMapping("/ejemplares")
	public List<Ejemplares> index(){
		return ejemplarService.findAll();
	}
	
	@GetMapping("/ejemplares/{id}")
	public Ejemplares show(@PathVariable Long id) {
		return ejemplarService.findById(id);
	}
	
	@PostMapping("/ejemplares")
	@ResponseStatus(HttpStatus.CREATED)
	public Ejemplares create(@RequestBody Ejemplares ejemplares) {
		return ejemplarService.save(ejemplares);
	}
	
	@PutMapping("/ejemplares/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Ejemplares update(@RequestBody Ejemplares ejemplares, @PathVariable Long id) {
		Ejemplares ejemplarActual = ejemplarService.findById(id);
		
		ejemplarActual.setCantidad(ejemplares.getCantidad());
		
		return ejemplarService.save(ejemplarActual);
	}

	@DeleteMapping("/ejemplares/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ejemplarService.delete(id);
	}
	
	@GetMapping("/getEjemplarByTienda/{idTienda}")
    public List<Ejemplares> getEjemplarByTienda(@PathVariable Long idTienda){
        return ejemplarService.findByIdTienda(idTienda);
    }
	
	@GetMapping("/getEjemplarByLibro/{idLibro}")
    public List<Ejemplares> getEjemplarByLibro(@PathVariable Long idLibro){
        return ejemplarService.findByIdLibro(idLibro);
    }
	
	
}