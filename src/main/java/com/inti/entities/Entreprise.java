package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ENTREPRISES", schema = "gestion_agence_git")
public class Entreprise implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompany;
	private String adress;
	private String nameCompany;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "EFFECTIFS", joinColumns = @JoinColumn(name = "id_company", 
	referencedColumnName = "idCompany"), 
	inverseJoinColumns = @JoinColumn(name = "id_emp", referencedColumnName = "idEmploye"))
	private Set<Employe> employes = new HashSet<>();
	
	public Entreprise()
	{
		
	}

	public Entreprise(String adress, String nameCompany, Set<Employe> employes) {
		this.adress = adress;
		this.nameCompany = nameCompany;
		this.employes = employes;
	}

	public Long getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Long idCompany) {
		this.idCompany = idCompany;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public Set<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<Employe> employes) {
		this.employes = employes;
	}

	@Override
	public String toString() {
		return "Entreprise [idCompany=" + idCompany + ", adress=" + adress + ", nameCompany=" + nameCompany
				+ ", employes=" + employes + "]";
	}
	
}
