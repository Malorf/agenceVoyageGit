package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Destination;


@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long>{

	/*@Query(value = "select * from contrats") 
	List<Contrat> findAllContrats();
	
	@Query(value = "select * from contrats c where c.typeContrat = ?1") 
	List<Contrat> findContratByType(String type);*/
}
