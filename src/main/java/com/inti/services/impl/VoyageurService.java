package com.inti.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Voyageur;
import com.inti.repositories.VoyageurRepository;
import com.inti.services.interfaces.IVoyageurService;

@Service
public class VoyageurService implements IVoyageurService {
	
	@Autowired
	VoyageurRepository voyageurRepository;
	@Override
	public List<Voyageur> findAll() {
		return voyageurRepository.findAll();
	}

	@Override
	public Voyageur findOne(Long id) {
		return voyageurRepository.findById(id).get();
	}

	@Override
	public Voyageur save(Voyageur voyageur) {
		return voyageurRepository.save(voyageur);
	}

	@Override
	public void delete(Long id) {
		voyageurRepository.deleteById(id);
		
	}

}
