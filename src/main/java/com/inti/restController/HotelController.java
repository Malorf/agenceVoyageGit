package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Hotel;
import com.inti.services.interfaces.IHotelService;

@RestController
public class HotelController {
	@Autowired
	IHotelService hotelService;

	@RequestMapping(value = "hotels", method = RequestMethod.GET)
	public List<Hotel> findAll() {
		return hotelService.findAll();
	}
	@RequestMapping(value = "hotels{id}", method = RequestMethod.GET)
	public Hotel findOne(@PathVariable("id")Long id)
	{
		return hotelService.findOne(id);
	}
	@RequestMapping(value = "hotels", method = RequestMethod.POST)
	public Hotel saveHotel(@RequestBody Hotel Hotel)
	{
		return hotelService.save(Hotel);
	}
	@RequestMapping(value = "hotels/{id}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id")Long id)
	{
		hotelService.delete(id);
	}
	@RequestMapping(value = "hotels/{id}", method = RequestMethod.PUT)
	public Hotel updateUtilisateur(@PathVariable("id")Long id, @RequestBody Hotel Hotel)
	{
		Hotel current= hotelService.findOne(id);
		current.setDestination(Hotel.getDestination());
		current.setNom(Hotel.getNom());
		current.setNbEtoile(Hotel.getNbEtoile());
		current.setRes(Hotel.getRes());
		return hotelService.save(current);
	}
}