package com.steven.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steven.relationships.models.License;
import com.steven.relationships.models.Person;
import com.steven.relationships.repositories.LicenseRepository;
import com.steven.relationships.repositories.PersonRepository;

@Service
public class RelationshipsService {
	private final PersonRepository personRepo;
	private final LicenseRepository licRepo;
	public RelationshipsService(PersonRepository pRepo, LicenseRepository licRepo) {
		this.personRepo = pRepo;
		this.licRepo = licRepo;
	}
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	public List<Person> getPeople() {
		return personRepo.findAll();
	}
	public List<Person> getUnlicensedPeople() {
		return personRepo.findByLicenseIdIsNull();
	}
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	public License createLicense(License l) {
		l.setNumber(this.generateLicenseNumber());
		return licRepo.save(l);
	}
	public int generateLicenseNumber() {
		License l = licRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	
}