package fr.eni.Filmotheque.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.Filmotheque.BO.Avis;
import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.services.ServiceAvis;

@Controller
public class AvisController {
	
	//private ServiceAvis serviceAvis;
	private HttpSession session;
	
	
	public AvisController(ServiceAvis serviceAvis,HttpSession session) {
		super();
		//this.serviceAvis = serviceAvis;
		this.session=session;
	}

	@GetMapping("/film/{id}/ajouterAvis")
	public String creerAvis(@ModelAttribute ("avis") Avis avis,@ModelAttribute ("film") Film film) {
		if(!(session.getAttribute("utilisateur")!= null)){
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		return "/ajouterAvis";
	}

	@PostMapping("/film/{id}/ajouterAvis")
	public String ajouterAvis(@ModelAttribute ("avis") Avis avis,@ModelAttribute ("film") Film film) {
		if(!(session.getAttribute("utilisateur")!= null)){
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		return "redirect:http://localhost:8080/Filmotheque/film/{id}";
	}
	
}
