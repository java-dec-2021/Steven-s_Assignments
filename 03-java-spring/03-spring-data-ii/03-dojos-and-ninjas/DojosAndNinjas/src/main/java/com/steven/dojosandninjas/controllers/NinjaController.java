package com.steven.dojosandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steven.dojosandninjas.models.Ninja;
import com.steven.dojosandninjas.services.DojosAndNinjasService;

@Controller
public class NinjaController {
	private DojosAndNinjasService appService;
	public NinjaController(DojosAndNinjasService service) {
		this.appService = service;
	}
	@RequestMapping("/ninjas")
	public String Index(Model model) {
		model.addAttribute("ninjas", this.appService.allNinjas());
		return "/ninjas/index.jsp";
	}
	
	@RequestMapping("/ninjas/new")
	public String New(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.appService.allDojos());
		return "/ninjas/new.jsp";
	}
	@RequestMapping(value="/ninjas", method=RequestMethod.POST)
	public String Create(@ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", this.appService.allDojos());
			return "/ninjas/new.jsp";
		}
		this.appService.createNinja(ninja);
		return "redirect:/ninjas";
	}
}