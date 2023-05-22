package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Hotel;
import com.inti.repositories.HotelRepository;
import com.inti.services.interfaces.IHotelService;
@Service
public class HotelService implements IHotelService {

	@Autowired
	HotelRepository hotelRepository;

	@Override
	public List<Hotel> findAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel findOne(Long id) {
		return hotelRepository.findById(id).get();
	}

	@Override
	public Hotel save(Hotel e) {
		return hotelRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		hotelRepository.deleteById(id);

	}

}