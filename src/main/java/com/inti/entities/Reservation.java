package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RESERVATIONS", schema = "gestion_agence_git")
public class Reservation implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur; 
	@Temporal(TemporalType.DATE)
	private Date dateReservation;
	private int nbJours; 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="voyageur_id")
	private Voyageur voyageur;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
	public Reservation() {
		
	}
	public Reservation(Date dateReservation, int nbJours, Voyageur voyageur) {
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
		this.voyageur = voyageur;
		
	}
	
	
	public Reservation(Long idVoyageur, Date dateReservation, int nbJours, Voyageur voyageur, Hotel hotel) {
		this.idVoyageur = idVoyageur;
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
		this.voyageur = voyageur;
		this.hotel = hotel;
	}
	public Long getIdVoyageur() {
		return idVoyageur;
	}
	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public int getNbJours() {
		return nbJours;
	}
	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}
	public Voyageur getVoyageur() {
		return voyageur;
	}
	public void setVoyageur(Voyageur voyageur) {
		this.voyageur = voyageur;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "Reservation [idVoyageur=" + idVoyageur + ", dateReservation=" + dateReservation + ", nbJours=" + nbJours
				+ ", voyageur=" + voyageur + "]";
	}
}
	
	
	
	