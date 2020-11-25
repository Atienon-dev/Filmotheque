package fr.eni.Filmotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.services.ServiceFilm;


@Controller
public class FilmController {
	
	private ServiceFilm service;
	
	public FilmController(ServiceFilm service) {
		this.service = service;
	}
	
	@GetMapping("/listeDeFilms")
	public String getListeFilms(@ModelAttribute("films") ArrayList<Film> filmRef) {
		
		filmRef.addAll(service.getAllFilms());

		return "listeFilms";
	}
	
	@GetMapping("/film/{id}")
	public String getFilm(@ModelAttribute("film") Film filmRef) {
		service.getFilm(filmRef);
		return "film";
	}
	
	@PostMapping("/film/{id}/modifierReal")
	public String modifierReal() {
		System.out.println("Je suis dans modifierReal");
		return "redirect:http://localhost:8080/Filmotheque/film/{id}";
	}
	
	@PostMapping("/film/{id}/ajoutActeur")
	public String ajouterActeur() {
		System.out.println("Je suis dans ajouterActeur");
		return "redirect:http://localhost:8080/Filmotheque/film/{id}";
	}

}
