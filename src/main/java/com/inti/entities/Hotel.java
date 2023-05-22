package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL", schema = "gestion_agence_voyage_db")
public class Hotel  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHotel;

	private String nom;
	private int nbEtoile;

	@OneToMany(mappedBy = "hotel")
	private List<Reservation>res = new ArrayList<>();

	@OneToMany(mappedBy = "hotel")
	private Set<Avis>avis = new HashSet<>(); 

	@ManyToOne
	private Destination destination;



	public Hotel() {
		// TODO Auto-generated constructor stub
	}



	public Hotel(String nom, int nbEtoile) {
		super();
		this.nom = nom;
		this.nbEtoile = nbEtoile;
	}







	public Hotel(String nom, int nbEtoile, Destination destination) {
		super();
		this.nom = nom;
		this.nbEtoile = nbEtoile;

		this.destination = destination;
	}



	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEtoile() {
		return nbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}


	public List<Reservation> getRes() {
		return res;
	}



	public void setRes(List<Reservation> res) {
		this.res = res;
	}



	public Set<Avis> getAvis() {
		return avis;
	}



	public void setAvis(Set<Avis> avis) {
		this.avis = avis;
	}



	public Destination getDestination() {
		return destination;
	}



	public void setDestination(Destination destination) {
		this.destination = destination;
	}



	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nom=" + nom + ", nbEtoile=" + nbEtoile + "]";
	}


}
