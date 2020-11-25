package fr.eni.Filmotheque.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;
import fr.eni.Filmotheque.services.ServicePersonne;

@Controller
public class PersonneController {
	
private ServicePersonne service;
	
	public PersonneController(ServicePersonne service) {
		this.service = service;
	}
	
	@GetMapping("/film/{id}/ajoutActeurs")
	public String getListeActeurs(@ModelAttribute("personnes") ArrayList<Personne> personneRef, @ModelAttribute("film") Film film) {
		
		personneRef.addAll(service.getAllPersonnes());

		return "listeActeurs";
	}
	
	@GetMapping("/film/{id}/modifReal")
	public String getListeReal(@ModelAttribute("personnes") ArrayList<Personne> personneRef, @ModelAttribute("film") Film film) {
		
		personneRef.addAll(service.getAllPersonnes());

		return "listeReal";
	}

}
