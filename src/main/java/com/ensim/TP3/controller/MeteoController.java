package com.ensim.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ensim.TP3.model.Address;
import com.ensim.TP3.model.AddressRepository;

@Controller
public class MeteoController {
	@Autowired
    AddressRepository addressRepository;
    
    
    @PostMapping("/meteo")
    public String weatherSubmit(@RequestParam(name="address", required=false) String adressGET, Model model) {
    	model.addAttribute("adress", adressGET);
        return "meteo";
    }
}
