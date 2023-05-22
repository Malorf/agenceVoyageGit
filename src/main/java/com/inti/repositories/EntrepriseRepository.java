package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Entreprise;


@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long>{
	
	/*@Query(value = "select * from entreprises") 
	List<Entreprise> findAllEntreprises();
	
	@Query(value = "select * from employes e where e.adress = ?1")
	List<Entreprise> findCompanyByAdress(String adress);
	
	@Query(value = "select * from entreprises e where e.nameCompany = ?1")
	List<Entreprise> findCompanyByName(String nameCompany);*/
}
