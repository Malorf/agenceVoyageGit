package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Contrat;
import com.inti.services.interfaces.IContratService;

@RestController
public class ContratController {
	@Autowired
	IContratService ContratService;
	
	@RequestMapping(value = "contrats", method = RequestMethod.GET)
	public List<Contrat> findAll() {
		return ContratService.findAll();
	}
	@RequestMapping(value = "contrats{id}", method = RequestMethod.GET)
	public Contrat findOne(@PathVariable("id")Long id)
	{
		return ContratService.findOne(id);
	}
	@RequestMapping(value = "contrats", method = RequestMethod.POST)
	public Contrat saveContrat(@RequestBody Contrat Contrat)
	{
		return ContratService.save(Contrat);
	}
	@RequestMapping(value = "contrats/{id}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id")Long id)
	{
		ContratService.delete(id);
	}
	@RequestMapping(value = "contrats/{id}", method = RequestMethod.PUT)
	public Contrat updateUtilisateur(@PathVariable("id")Long id, @RequestBody Contrat Contrat)
	{
		Contrat current= ContratService.findOne(id);
		current.setSalary(Contrat.getSalary());
		current.setTypeContrat(Contrat.getTypeContrat());
		return ContratService.save(current);
	}
}