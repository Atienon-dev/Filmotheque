package fr.eni.Filmotheque.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.Filmotheque.BO.Utilisateur;
import fr.eni.Filmotheque.services.ServiceConnexion;

@Controller
public class ConnexionController {
	
	private ServiceConnexion serviceCnx;
	private HttpSession session;
		
	public ConnexionController(ServiceConnexion serviceCnx,HttpSession session){
		this.serviceCnx= serviceCnx;
		this.session=session;
	}
	
	@GetMapping({"","/","/index","/welcome"})
	public String getConnexion(@ModelAttribute ("utilisateur") Utilisateur utilisateur) {
		
		return "welcome";
	}
	
	@PostMapping("/connexion")
	public String postConnexion(@ModelAttribute ("utilisateur") Utilisateur utilisateur) {
		
		boolean cnx= this.serviceCnx.connexionUtilisateur(utilisateur);
				
		if (cnx){
			session.setAttribute("utilisateur", utilisateur);
			return ("redirect:http://localhost:8080/Filmotheque/listeDeFilms");
		}else {
			return ("redirect:http://localhost:8080/Filmotheque/");
		}
		
	}
	
	@GetMapping("/deconnexion")
	public String Deconnexion() {
		System.out.println("je me deco");
		session.invalidate();
	return ("redirect:http://localhost:8080/Filmotheque/");
		
	}

}
