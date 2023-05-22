package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRATS", schema = "gestion_agence_git")
public class Contrat implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContrat;
	private String typeContrat;
	private float salary;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="employe_id")
	private Employe employe;
	
	public Contrat()
	{
		
	}

	public Contrat(String typeContrat, float salary, Employe employe) {
		super();
		this.typeContrat = typeContrat;
		this.salary = salary;
		this.employe = employe;
	}

	public Long getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(Long idContrat) {
		this.idContrat = idContrat;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Contrat(Long idContrat, String typeContrat, float salary, Employe employe) {
		super();
		this.idContrat = idContrat;
		this.typeContrat = typeContrat;
		this.salary = salary;
		this.employe = employe;
	}
	
	
}
