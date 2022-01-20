package com.steven.dojosandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steven.dojosandninjas.models.Dojo;
import com.steven.dojosandninjas.services.DojosAndNinjasService;

@Controller
public class DojoController {
	private final DojosAndNinjasService appService;
	public DojoController(DojosAndNinjasService service) {
		this.appService = service;
	}
	@RequestMapping("/dojos")
	public String Index(Model model) {
		model.addAttribute("dojos", appService.allDojos());
		return "/dojos/index.jsp";
	}
	@RequestMapping("/dojos/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", this.appService.findDojo(id));
		return "/dojos/show.jsp";
	}
	@RequestMapping("/dojos/new")
	public String New(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/new.jsp";
	}
	@RequestMapping(value="/dojos", method=RequestMethod.POST)
	public String Create(@ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors())
			return "/dojos/new.jsp";
		this.appService.createDojo(dojo);
		return "redirect:/dojos";
	}
}