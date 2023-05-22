package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Destination;
import com.inti.repositories.DestinationRepository;
import com.inti.services.interfaces.IDestinationService;

@Service
public class DestinationService implements IDestinationService {
	@Autowired
	DestinationRepository destinationRepository;

	@Override
	public List<Destination> findAll() {
		return destinationRepository.findAll();
	}

	@Override
	public Destination findOne(Long id) {
		return destinationRepository.findById(id).get();
	}

	@Override
	public Destination save(Destination c) {
		return destinationRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		destinationRepository.deleteById(id);
		
	}

}
