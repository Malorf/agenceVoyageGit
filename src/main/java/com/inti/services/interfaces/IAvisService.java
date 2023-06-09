package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Avis;



public interface IAvisService {

	List<Avis> findAll();

	Avis findOne(Long id);

	Avis save(Avis voiture);

	void delete(Long id);

}