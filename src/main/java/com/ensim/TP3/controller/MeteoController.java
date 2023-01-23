package com.ensim.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ensim.TP3.model.Address;
import com.ensim.TP3.model.AddressRepository;

@Controller
public class MeteoController {
	@Autowired
    AddressRepository addressRepository;
    
    @GetMapping("/meteo")
    public String weatherForm() {
       // model.addAttribute("address", new Address());
        return "meteo";
    }
    
    @PostMapping("/meteo")
    public String weatherSubmit(@ModelAttribute Address address) {
        addressRepository.save(address);
        return "meteo";
    }
}
