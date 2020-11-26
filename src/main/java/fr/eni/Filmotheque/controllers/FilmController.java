package fr.eni.Filmotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;
import fr.eni.Filmotheque.BO.Utilisateur;
import fr.eni.Filmotheque.services.ServiceFilm;

@SessionAttributes("utilisateur")
@Controller
public class FilmController {
	

	private ServiceFilm service;
	
	public FilmController(ServiceFilm service) {
		this.service = service;
	}
	
	@GetMapping("/listeDeFilms")
	public String getListeFilms(Model model) {
		
		List<Film> filmRef= new ArrayList<Film>();
		
		filmRef=service.getAllFilms();
		
		model.addAttribute("films",filmRef);

		return "listeFilms";
	}
	
	@GetMapping("/film/{id}")
	public String getFilm(Model model, @PathVariable String id) {
		Film filmRef = new Film();
		
		filmRef.setId(Long.parseLong(id));
		filmRef=service.getFilm(filmRef.getId());
		model.addAttribute("film",filmRef);
		
		return "film";
	}
	
	@PostMapping("/film/{id}/modifierReal")
	public String modifierReal(@ModelAttribute ("film") Film filmRef) {
		filmRef=this.service.modifierRealisateurs(filmRef);
		System.out.println(filmRef);
		return "redirect:http://localhost:8080/Filmotheque/film/{id}";
	}
	
	@PostMapping("/film/{id}/ajoutActeur")
	public String ajouterActeur(@ModelAttribute("film")Film filmRef) {
		filmRef=this.service.ajouterActeurs(filmRef);
		System.out.println(filmRef);
		return "redirect:http://localhost:8080/Filmotheque/film/{id}";
	}

}
