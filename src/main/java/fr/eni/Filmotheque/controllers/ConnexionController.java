package fr.eni.Filmotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.Filmotheque.BO.Utilisateur;
import fr.eni.Filmotheque.services.ServiceConnexion;

@Controller
public class ConnexionController {
	
	private ServiceConnexion serviceCnx;
		
	public ConnexionController(ServiceConnexion serviceCnx){
		this.serviceCnx= serviceCnx;
	}
	
	@GetMapping({"","/","/index","/welcome"})
	public String getConnexion(@ModelAttribute ("utilisateur") Utilisateur utilisateur) {
		
		return "welcome";
	}
	
	@PostMapping("/connexion")
	public String postConnexion(@ModelAttribute ("utilisateur") Utilisateur utilisateur) {
		
		boolean cnx= this.serviceCnx.connexionUtilisateur(utilisateur);
				
		if (cnx){
			return ("redirect:http://localhost:8080/Filmotheque/listeDeFilms");
		}else {
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		
	}

}
