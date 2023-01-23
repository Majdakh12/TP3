package com.ensim.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.ensim.TP3.model.Address;
import com.ensim.TP3.model.AddressRepository;

@Controller
public class MeteoController {
	@Autowired
    AddressRepository addressRepository;
	RestTemplate restTemplate = new RestTemplate();
    
    @PostMapping("/meteo")
    public String weatherSubmit(@RequestParam(name="adress", required=false) String adressGET, Model model) {
    	model.addAttribute("adress", adressGET);
    	ResponseEntity<MyResponse> response =  restTemplate.getForEntity("https://api-adresse.data.gouv.fr/search/?q={adress}", MyResponse.class);
        MyResponse myResponse = response.getBody();
        return "meteo";
    }
    
    
}
