package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Employe;
import com.inti.services.interfaces.IEmployeService;

@RestController
public class EmployeController {
	@Autowired
	IEmployeService EmployeService;
	
	@RequestMapping(value = "employes", method = RequestMethod.GET)
	public List<Employe> findAll() {
		return EmployeService.findAll();
	}
	@RequestMapping(value = "employes{id}", method = RequestMethod.GET)
	public Employe findOne(@PathVariable("id")Long id)
	{
		return EmployeService.findOne(id);
	}
	@RequestMapping(value = "employes", method = RequestMethod.POST)
	public Employe saveEmploye(@RequestBody Employe Employe)
	{
		return EmployeService.save(Employe);
	}
	@RequestMapping(value = "employes/{id}", method = RequestMethod.DELETE)
	public void deleteUtilisateur(@PathVariable("id")Long id)
	{
		EmployeService.delete(id);
	}
	@RequestMapping(value = "employes/{id}", method = RequestMethod.PUT)
	public Employe updateUtilisateur(@PathVariable("id")Long id, @RequestBody Employe Employe)
	{
		Employe current= EmployeService.findOne(id);
		current.setFunction(Employe.getFunction());
		current.setNameEmp(Employe.getNameEmp());
		current.setFirstnameEmp(Employe.getFirstnameEmp());
		return EmployeService.save(current);
	}
}