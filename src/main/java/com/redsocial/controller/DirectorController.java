package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping
	public ResponseEntity<Director> inserta(@RequestBody Director obj){
		return ResponseEntity.ok(service.inserta(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<Director>> lista() {
		return ResponseEntity.ok(service.listaDirector());
	}
	
}



