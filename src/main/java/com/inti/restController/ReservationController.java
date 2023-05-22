package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Reservation;
import com.inti.services.interfaces.IReservationService;

@RestController
public class ReservationController {
	@Autowired
	IReservationService ReservationService;
	
	@RequestMapping(value = "reservations", method = RequestMethod.GET)
	public List<Reservation> findAll() {
		return ReservationService.findAll();
	}
	@RequestMapping(value = "reservations{id}", method = RequestMethod.GET)
	public Reservation findOne(@PathVariable("id")Long id)
	{
		return ReservationService.findOne(id);
	}
	@RequestMapping(value = "reservations", method = RequestMethod.POST)
	public Reservation saveReservation(@RequestBody Reservation Reservation)
	{
		return ReservationService.save(Reservation);
	}
	@RequestMapping(value = "reservations/{id}", method = RequestMethod.DELETE)
	public void deleteReservation(@PathVariable("id")Long id)
	{
		ReservationService.delete(id);
	}
	@RequestMapping(value = "reservations/{id}", method = RequestMethod.PUT)
	public Reservation updateReservation(@PathVariable("id")Long id, @RequestBody Reservation Reservation)
	{
		Reservation current= ReservationService.findOne(id);
		current.setDateReservation(Reservation.getDateReservation());
		current.setNbJours(Reservation.getNbJours());
		return ReservationService.save(current);
	}
}