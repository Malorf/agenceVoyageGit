package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AVIS", schema = "gestion_agence_git")

public class Avis implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;
	private String commentaire;
	
	
	@ManyToOne
	private Hotel hotel;
	
	public Avis() {
		// TODO Auto-generated constructor stub
	}

	public Avis(String commentaire) {
		super();
		this.commentaire = commentaire;
	}

	
	
	
	public Avis(String commentaire, Hotel hotel) {
		super();
		this.commentaire = commentaire;
		this.hotel = hotel;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", commentaire=" + commentaire + ", hotel=" + hotel + "]";
	}

	
	

}
