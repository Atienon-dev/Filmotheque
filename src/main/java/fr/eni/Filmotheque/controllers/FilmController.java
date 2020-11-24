package fr.eni.Filmotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.services.ServiceFilm;


@Controller
public class FilmController {
	
	private ServiceFilm service;
	
	public FilmController(ServiceFilm service) {
		this.service = service;
	}
	
	@GetMapping("/liste_de_films")
	public String getListeFilms(@ModelAttribute("films") ArrayList<Film> filmRef) {
		
		filmRef.addAll(service.getAllFilms());

		return "liste_de_films";
	}
	
	@GetMapping("/film/{id}")
	public String getFilm(@ModelAttribute("film") Film filmRef) {
		service.getFilm(filmRef);
		System.out.println(filmRef);
		return "film";
	}

}
