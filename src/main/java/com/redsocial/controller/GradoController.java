package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.Grado;
import com.redsocial.service.GradoService;

@RestController
@RequestMapping("/api/rest/grado/")
public class GradoController {

	@Autowired
	private GradoService service;

	@GetMapping
	public ResponseEntity<List<Grado>> lista() {
		return ResponseEntity.ok(service.listaGrado());
	}

}
