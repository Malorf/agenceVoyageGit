package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Voiture;
import com.inti.services.interfaces.IVoitureService;

@RestController
public class VoitureController {
	@Autowired
	IVoitureService voitureService;
	
	@RequestMapping(value = "voitures", method = RequestMethod.GET)
	public List<Voiture> findAll() {
		return voitureService.findAll();
	}
	@RequestMapping(value = "voitures{id}", method = RequestMethod.GET)
	public Voiture findOne(@PathVariable("id")Long id)
	{
		return voitureService.findOne(id);
	}
	@RequestMapping(value = "voitures", method = RequestMethod.POST)
	public Voiture saveVoiture(@RequestBody Voiture voiture)
	{
		return voitureService.save(voiture);
	}
	@RequestMapping(value = "voitures/{id}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id")Long id)
	{
		voitureService.delete(id);
	}
	@RequestMapping(value = "voitures/{id}", method = RequestMethod.PUT)
	public Voiture updateUtilisateur(@PathVariable("id")Long id, @RequestBody Voiture voiture)
	{
		Voiture current= voitureService.findOne(id);
		current.setBrand(voiture.getBrand());
		current.setColor(voiture.getColor());
		current.setSpeed(voiture.getSpeed());
		return voitureService.save(current);
	}
}
