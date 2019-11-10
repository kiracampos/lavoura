package com.nordeste.nordesteApp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nordeste.nordesteApp.model.Companie;
import com.nordeste.nordesteApp.service.CompanieService;

@Controller
public class CompanieController {


	@Autowired
	CompanieService service;
	
	@RequestMapping("/companie/create")
	public ModelAndView insert(Companie companie) {
		ModelAndView mv = new ModelAndView("companie/CreateCompanie");
		return mv;
	}
	
	@RequestMapping(value = "/companie/create", method = RequestMethod.POST)
	public ModelAndView create(@Valid Companie companie, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors()) {
			return insert(companie);
		}
		
		service.save(companie);
		attributes.addFlashAttribute("Mensagem", "Success");
		return new ModelAndView("redirect:/companie/create");
	}
}
