package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.Director;
import com.redsocial.repository.DirectorRepository;

@Service
public class DirectorServiceImpl implements DirectorService{

	@Autowired
	private DirectorRepository repository;
	

	@Override
	public Director inserta(Director obj) {
		return repository.save(obj);
	}


	@Override
	public List<Director> listaDirector() {
		return repository.findAll();
	}

}
