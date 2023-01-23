package com.ensim.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ensim.TP3.model.Address;
import com.ensim.TP3.model.AddressRepository;

@Controller
public class AddressController {
	@Autowired
	AddressRepository addressRepository;
	@GetMapping("/adresses")
	public String showAddresses(Model model) {
		model.addAttribute("allAddresses", addressRepository.findAll());
		return "addresses";
	}
	
	@GetMapping("/adress")
    public String weatherForm(Model model) {
        return "formulaire";
    }
}