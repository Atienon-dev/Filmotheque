package fr.eni.Filmotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.services.ServiceFilm;

@Controller
public class FilmController {
	

	private ServiceFilm service;
	private HttpSession session;
	
	public FilmController(ServiceFilm service , HttpSession session) {
		this.service = service;
		this.session=session;
	}
	
	@GetMapping("/listeDeFilms")
	public String getListeFilms(Model model) {
		
		if(!(session.getAttribute("utilisateur")!= null)){
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
			
		List<Film> filmRef= new ArrayList<Film>();
		
		filmRef=service.getAllFilms();
			
		model.addAttribute("films",filmRef);
	
		return "listeFilms";
	
	}
	
	@GetMapping("/film/{id}")
	public String getFilm(Model model, @PathVariable String id) {
		
		if(!(session.getAttribute("utilisateur")!= null)){
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		
		Film filmRef = new Film();
		
		filmRef.setId(Long.parseLong(id));
		filmRef=service.getFilm(filmRef.getId());
		model.addAttribute("film",filmRef);
		
		return "film";
	}
	
	@PostMapping("/film/{id}/modifierReal")
	public String modifierReal(@ModelAttribute ("film") Film filmRef) {
		
		if(!(session.getAttribute("utilisateur")!= null)){
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		
		filmRef=this.service.modifierRealisateurs(filmRef);
		
		return "redirect:http://localhost:8080/Filmotheque/film/{id}";
	}
	
	@PostMapping("/film/{id}/ajoutActeur")
	public String ajouterActeur(@ModelAttribute("film")Film filmRef) {
		
		if(!(session.getAttribute("utilisateur")!= null)){
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		
		filmRef=this.service.ajouterActeurs(filmRef);
		
		return "redirect:http://localhost:8080/Filmotheque/film/{id}";
	}

}
