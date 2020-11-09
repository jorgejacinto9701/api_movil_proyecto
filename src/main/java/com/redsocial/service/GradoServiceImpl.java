package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Grado;
import com.redsocial.repository.GradoRepository;

@Service
public class GradoServiceImpl implements GradoService{

	@Autowired
	private GradoRepository repository;
	
	@Override
	public List<Grado> listaGrado() {
		return repository.findAll();
	}

	

}
