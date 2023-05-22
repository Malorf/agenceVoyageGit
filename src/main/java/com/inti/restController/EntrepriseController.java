package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Entreprise;
import com.inti.services.interfaces.IEntrepriseService;

@RestController
public class EntrepriseController {
	@Autowired
	IEntrepriseService EntrepriseService;
	
	@RequestMapping(value = "entreprises", method = RequestMethod.GET)
	public List<Entreprise> findAll() {
		return EntrepriseService.findAll();
	}
	@RequestMapping(value = "entreprises{id}", method = RequestMethod.GET)
	public Entreprise findOne(@PathVariable("id")Long id)
	{
		return EntrepriseService.findOne(id);
	}
	@RequestMapping(value = "entreprises", method = RequestMethod.POST)
	public Entreprise saveEntreprise(@RequestBody Entreprise Entreprise)
	{
		return EntrepriseService.save(Entreprise);
	}
	@RequestMapping(value = "entreprises/{id}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id")Long id)
	{
		EntrepriseService.delete(id);
	}
	@RequestMapping(value = "entreprises/{id}", method = RequestMethod.PUT)
	public Entreprise updateUtilisateur(@PathVariable("id")Long id, @RequestBody Entreprise Entreprise)
	{
		Entreprise current= EntrepriseService.findOne(id);
		current.setNameCompany(Entreprise.getNameCompany());
		current.setAdress(Entreprise.getAdress());
		return EntrepriseService.save(current);
	}
}