package com.example.persondetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.persondetails.domain.person;

@Repository
public interface personRepository extends JpaRepository<person, Long> {
	 

}
