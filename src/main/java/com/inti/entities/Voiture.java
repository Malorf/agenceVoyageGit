package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VOITURES", schema = "gestion_agence_git")
public class Voiture implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCar;
	private String brand;
	private String speed;
	private String color;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="employe_id")
	private Employe employe;
	
	public Voiture()
	{
		
	}

	public Voiture(String brand, String speed, String color, Employe employe) {
		super();
		this.brand = brand;
		this.speed = speed;
		this.color = color;
		this.employe = employe;
	}

	public Long getIdCar() {
		return idCar;
	}

	public void setIdCar(Long idCar) {
		this.idCar = idCar;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "Voiture [idCar=" + idCar + ", brand=" + brand + ", speed=" + speed + ", color=" + color + ", employe="
				+ employe + "]";
	}
	
	
}
