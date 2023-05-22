package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Destination;



public interface IDestinationService {

	List<Destination> findAll();

	Destination findOne(Long id);

	Destination save(Destination c);

	void delete(Long id);
}
