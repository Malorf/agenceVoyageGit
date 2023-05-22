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
import javax.persistence.Table;

@Entity
@Table(name = "VOYAGEURS", schema = "gestion_agence_git")
public class Voyageur implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur;
	private String nameVoyageur;
	private String firstNameVoyageur;
	private int age;
	
	@OneToMany(mappedBy="voyageur", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Reservation> reservations = new ArrayList<>();
	public Voyageur() {
		
	}

	public Voyageur(String nameVoyageur, String firstNameVoyageur, int age) {
		
		this.nameVoyageur = nameVoyageur;
		this.firstNameVoyageur = firstNameVoyageur;
		this.age = age;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNameVoyageur() {
		return nameVoyageur;
	}

	public void setNameVoyageur(String nameVoyageur) {
		this.nameVoyageur = nameVoyageur;
	}

	public String getFirstNameVoyageur() {
		return firstNameVoyageur;
	}

	public void setFirstNameVoyageur(String firstNameVoyageur) {
		this.firstNameVoyageur = firstNameVoyageur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nameVoyageur=" + nameVoyageur + ", firstNameVoyageur="
				+ firstNameVoyageur + ", age=" + age + "]";
	}
	
	
}
