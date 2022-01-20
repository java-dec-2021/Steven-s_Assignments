package com.steven.relationships.controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steven.relationships.models.License;
import com.steven.relationships.models.Person;
import com.steven.relationships.services.RelationshipsService;

public class RelationshipsController {
	private final RelationshipsService service;
	public RelationshipsController(RelationshipsService serv) {
		this.service = serv;
	}
	@RequestMapping("/")
	public String Index(Model model) {
		List<Person> people = service.getPeople();
		model.addAttribute("persons", people);
		return "index.jsp";
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String CreatePerson(@ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors() ) {
			return "newperson.jsp";
		}
		service.createPerson(person);
		return "redirect:/";
	}
	@RequestMapping("/{id}")
	public String ShowPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", service.getPerson(id));
		return "show.jsp";
	}
	@RequestMapping("/new")
	public String NewPerson(@ModelAttribute("person") Person person) {
		return "newperson.jsp";
	}
	@RequestMapping("/licenses/new")
	public String NewLicense(@ModelAttribute("license") License lic, Model model) {
		List<Person> unlicensed = service.getUnlicensedPeople();
		model.addAttribute("persons", unlicensed);
		return "newlicense.jsp";
	}
	@RequestMapping(value = "/licenses", method=RequestMethod.POST)
	public String CreateLicense(@ModelAttribute("license") License lic, BindingResult result) {
		if(result.hasErrors())
			return "newlicense.jsp";
		service.createLicense(lic);
		return "redirect:/";
	}
}