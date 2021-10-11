package com.example.persondetails.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class person {

	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String personname;
    private String place ;
    private int salary;
    public person() {
    	super();
    }
	public person(Long id, String personname, String place, int salary) {
		super();
		this.id = id;
		this.personname = personname;
		this.place = place;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int sallary) {
		this.salary = sallary;
	}
	
	
}
