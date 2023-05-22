package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Avis;
import com.inti.services.interfaces.IAvisService;

@RestController
public class AvisController {
	@Autowired
	IAvisService avisService;
	
	@RequestMapping(value = "aviss", method = RequestMethod.GET)
	public List<Avis> findAll() {
		return avisService.findAll();
	}
	@RequestMapping(value = "aviss{id}", method = RequestMethod.GET)
	public Avis findOne(@PathVariable("id")Long id)
	{
		return avisService.findOne(id);
	}
	@RequestMapping(value = "aviss", method = RequestMethod.POST)
	public Avis saveAvis(@RequestBody Avis avis)
	{
		return avisService.save(avis);
	}
	@RequestMapping(value = "aviss/{id}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id")Long id)
	{
		avisService.delete(id);
	}
	@RequestMapping(value = "aviss/{id}", method = RequestMethod.PUT)
	public Avis updateUtilisateur(@PathVariable("id")Long id, @RequestBody Avis avis)
	{
		Avis current= avisService.findOne(id);
		current.setCommentaire(avis.getCommentaire());
		return avisService.save(current);
	}
}
