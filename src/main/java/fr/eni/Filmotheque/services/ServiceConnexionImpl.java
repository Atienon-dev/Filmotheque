package fr.eni.Filmotheque.services;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Utilisateur;
import fr.eni.Filmotheque.dal.UtilisateurRepository;

@Service
public class ServiceConnexionImpl implements ServiceConnexion{
	
	private Utilisateur utilisateurRef;
	private UtilisateurRepository utilRepo;
	
	public ServiceConnexionImpl(UtilisateurRepository utilRepo) {
		
		this.utilRepo=utilRepo;
	}
	
	public boolean connexionUtilisateur(Utilisateur utilisateur) {
		
		this.utilisateurRef=this.utilRepo.findByPseudo(utilisateur.getPseudo());
		
		if (this.utilisateurRef != null && utilisateur.getPseudo().equals( this.utilisateurRef.getPseudo())
				&& utilisateur.getMotDePasse().equals(this.utilisateurRef.getMotDePasse())
				) {
				return true;
			}else {
				return false;
			}
	}

}
