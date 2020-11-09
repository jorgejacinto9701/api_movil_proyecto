package com.redsocial.service;

import java.util.List;
import java.util.Optional;

import com.redsocial.entity.Director;

public interface DirectorService {

	public abstract List<Director> listaDirector();
	public abstract Director insertaActualizaDirector(Director obj);
	public abstract void eliminaDirectorPorId(int id);
	public abstract Optional<Director> buscaDirectorPorId(int id);
	
}
