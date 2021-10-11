package com.example.persondetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persondetails.domain.person;
import com.example.persondetails.repository.personRepository;


@Service
public class personService {
	
	@Autowired
    private personRepository repo;
	 
	public List<person> listAll() {
        return repo.findAll();
    }
    
    public void save(person salry) {
        repo.save(salry);
    }
    
    public get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
}
