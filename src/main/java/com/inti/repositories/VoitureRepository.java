package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository <Voiture, Long> {

	/*@Query(value = "select * from voitures") 
	List<Voiture> findAllVoitures();
	
	@Query(value = "select * from voitures v where v.brand = ?1")
	List<Voiture> findVoitureByBrand(String brand);
	
	@Query(value = "select * from voitures v where v.color = ?1")
	List<Voiture> findVoitureByColor(String color);*/
}
