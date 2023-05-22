package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYES", schema = "gestion_agence_git")
public class Employe implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	private String nameEmp;
	private String firstnameEmp;
	private String function;
	
	@OneToOne(mappedBy="employe", cascade = CascadeType.ALL, fetch =FetchType.LAZY)
	private Voiture voiture;
	
	@OneToMany(mappedBy="employe", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Destination> contrats = new ArrayList<>();
	
	public Employe()
	{
		
	}

	public Employe(String nameEmp, String firstnameEmp, String function) {
		super();
		this.nameEmp = nameEmp;
		this.firstnameEmp = firstnameEmp;
		this.function = function;
	}

	public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNameEmp() {
		return nameEmp;
	}

	public void setNameEmp(String nameEmp) {
		this.nameEmp = nameEmp;
	}

	public String getFirstnameEmp() {
		return firstnameEmp;
	}

	public void setFirstnameEmp(String firstnameEmp) {
		this.firstnameEmp = firstnameEmp;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public List<Destination> getContrats() {
		return contrats;
	}

	public void setContrats(List<Destination> contrats) {
		this.contrats = contrats;
	}

	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nameEmp=" + nameEmp + ", firstnameEmp=" + firstnameEmp
				+ ", function=" + function + "]";
	}
	
}
