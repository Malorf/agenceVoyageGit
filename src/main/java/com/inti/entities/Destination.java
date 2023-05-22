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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DESTINATIONS", schema = "gestion_agence_git")
public class Destination implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDestination;
	private Long longitude;
	private Long latitude;
	
	@OneToMany(mappedBy="destination", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Hotel> hotels = new ArrayList<>();
	
	public Destination()
	{
		
	}

	public Destination(Long longitude, Long latitude) {
		
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Long getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(Long idDestination) {
		this.idDestination = idDestination;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

	@Override
	public String toString() {
		return "Destination [idDestination=" + idDestination + ", longitude=" + longitude + ", latitude=" + latitude
				+ "]";
	}

	
	
	
	
	
}
