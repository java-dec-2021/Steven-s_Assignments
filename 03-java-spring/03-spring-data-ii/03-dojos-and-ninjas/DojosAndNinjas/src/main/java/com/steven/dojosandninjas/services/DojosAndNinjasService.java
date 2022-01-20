package com.steven.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steven.dojosandninjas.models.Dojo;
import com.steven.dojosandninjas.models.Ninja;
import com.steven.dojosandninjas.repositories.DojoRepository;
import com.steven.dojosandninjas.repositories.NinjaRepository;

@Service
public class DojosAndNinjasService {
	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;
	public DojosAndNinjasService(DojoRepository dRepo, NinjaRepository nRepo) {
		this.dojoRepo = dRepo;
		this.ninjaRepo = nRepo;
	}
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
	public Dojo findDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
}