package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.inti.entities.Employe;


@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{

	/*@Query(value = "select * from employes") 
	List<Employe> findAllEmployes();
	
	@Query(value = "select * from employes e where e.nameEmp = ?1 and e.firstnameEmp = ?2")
	List<Employe> findEmployeByNameAndFirstName(String name, String firstName);
	
	@Query(value = "select * from employes e where e.function = ?1")
	List<Employe> findEmployeByFunction(String function);*/
}
