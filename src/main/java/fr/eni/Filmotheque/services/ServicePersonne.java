package fr.eni.Filmotheque.services;

import java.util.List;

import fr.eni.Filmotheque.BO.Personne;

public interface ServicePersonne {
	
	public List<Personne> getAllPersonnes();
	
	public Personne getPersonne(Long id);
	
	public List<Personne> recupererInfosActeurs(List<Personne> acteurs) ;

}
