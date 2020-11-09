package com.redsocial.service;

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

}
