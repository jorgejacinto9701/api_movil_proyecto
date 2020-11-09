package com.redsocial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.Director;
import com.redsocial.service.DirectorService;

@RestController
@RequestMapping("/api/rest/director/")
public class DirectorController {
	
	@Autowired
	private DirectorService service;
	
	@GetMapping
	public ResponseEntity<List<Director>> lista(){
		return ResponseEntity.ok(service.listaDirector());
	}

	@PostMapping
	public ResponseEntity<Director> inserta(@RequestBody Director obj){
		return ResponseEntity.ok(service.insertaActualizaDirector(obj));
	}
	
	@PutMapping
	public ResponseEntity<Director> actualiza(@RequestBody Director obj){
		return ResponseEntity.ok(service.insertaActualizaDirector(obj));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> elimina(@PathVariable int id){
		Optional<Director> obj = service.buscaDirectorPorId(id);
		if(obj.isPresent()) {
			service.eliminaDirectorPorId(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
}



