package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Voyageur;
import com.inti.services.interfaces.IVoyageurService;

@RestController
public class VoyageurController {
	@Autowired
	IVoyageurService voyageurService;
	
	@RequestMapping(value = "voyageurs", method = RequestMethod.GET)
	public List<Voyageur> findAll() {
		return voyageurService.findAll();
	}
	@RequestMapping(value = "voyageurs{id}", method = RequestMethod.GET)
	public Voyageur findOne(@PathVariable("id")Long id)
	{
		return voyageurService.findOne(id);
	}
	@RequestMapping(value = "voyageurs", method = RequestMethod.POST)
	public Voyageur saveVoyageur(@RequestBody Voyageur voyageur)
	{
		return voyageurService.save(voyageur);
	}
	@RequestMapping(value = "voyageurs/{id}", method = RequestMethod.DELETE)
	public void deleteVoyageur(@PathVariable("id")Long id)
	{
		voyageurService.delete(id);
	}
	@RequestMapping(value = "voyageurs/{id}", method = RequestMethod.PUT)
	public Voyageur updateVoyageur(@PathVariable("id")Long id, @RequestBody Voyageur voyageur)
	{
		Voyageur current= voyageurService.findOne(id);
		current.setAge(voyageur.getAge());
		return voyageurService.save(current);
	}
}
