package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Destination;
import com.inti.services.interfaces.IDestinationService;

@RestController
public class DestinationController {
	@Autowired
	IDestinationService DestinationService;
	
	@RequestMapping(value = "destinations", method = RequestMethod.GET)
	public List<Destination> findAll() {
		return DestinationService.findAll();
	}
	@RequestMapping(value = "destinations{id}", method = RequestMethod.GET)
	public Destination findOne(@PathVariable("id")Long id)
	{
		return DestinationService.findOne(id);
	}
	@RequestMapping(value = "destinations", method = RequestMethod.POST)
	public Destination saveDestination(@RequestBody Destination Destination)
	{
		return DestinationService.save(Destination);
	}
	@RequestMapping(value = "destinations/{id}", method = RequestMethod.DELETE)
	public void deleteDestination(@PathVariable("id")Long id)
	{
		DestinationService.delete(id);
	}
	@RequestMapping(value = "destinations/{id}", method = RequestMethod.PUT)
	public Destination updateDestination(@PathVariable("id")Long id, @RequestBody Destination Destination)
	{
		Destination current= DestinationService.findOne(id);
		current.setLongitude (Destination.getLongitude());
		current.setLatitude(Destination.getLatitude());
		return DestinationService.save(current);
	}
}