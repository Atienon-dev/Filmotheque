package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Avis;
import fr.eni.Filmotheque.BO.Utilisateur;

@Service
public class ServiceConnexionImpl implements ServiceConnexion{
	
	private Utilisateur utilisateurRef;
	
	public ServiceConnexionImpl() {
		List<Avis> avis = new ArrayList<Avis>();
		this.utilisateurRef = new Utilisateur(Integer.toUnsignedLong(15),"Moi","mdp","admin",avis);
	}
	
	public boolean connexionUtilisateur(Utilisateur utilisateur) {
		if (utilisateur.getPseudo().equals( this.utilisateurRef.getPseudo())
				&& utilisateur.getMotDePasse().equals(this.utilisateurRef.getMotDePasse())
				) {
				return true;
			}else {
				return false;
			}
	}

}
