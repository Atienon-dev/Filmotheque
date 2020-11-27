package fr.eni.Filmotheque.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;
import fr.eni.Filmotheque.services.ServiceFilm;
import fr.eni.Filmotheque.services.ServicePersonne;

@Controller
public class PersonneController {
	
private ServicePersonne personneService;
private ServiceFilm filmService;
private HttpSession session;
	
	public PersonneController(ServicePersonne personneService,ServiceFilm filmService,HttpSession session) {
		this.personneService = personneService;
		this.filmService=filmService;
		this.session=session;
	}
	
	@GetMapping("/film/{id}/ajoutActeurs")
	public String getListeActeurs(@ModelAttribute("personnes") ArrayList<Personne> personneRef, @ModelAttribute("film") Film film) {
		
		if(!(session.getAttribute("utilisateur")!= null)){
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		film.setTitre(this.filmService.getFilm(film.getId()).getTitre());
		personneRef.addAll(personneService.getAllPersonnes());

		return "listeActeurs";
	}
	
	@GetMapping("/film/{id}/modifReal")
	public String getListeReal(@ModelAttribute("personnes") ArrayList<Personne> personneRef, @ModelAttribute("film") Film film) {
		
		if(!(session.getAttribute("utilisateur")!= null)){
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		film.setTitre(this.filmService.getFilm(film.getId()).getTitre());
		personneRef.addAll(personneService.getAllPersonnes());

		return "listeReal";
	}

}
