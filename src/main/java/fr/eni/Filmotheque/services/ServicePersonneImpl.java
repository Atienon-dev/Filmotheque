package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;
import fr.eni.Filmotheque.dal.PersonneRepository;

@Service
public class ServicePersonneImpl implements ServicePersonne{
	
	private List<Personne> personnes = new ArrayList<Personne>();
	private PersonneRepository persRepo;
	
	public ServicePersonneImpl(PersonneRepository persRepo) {
		this.persRepo=persRepo;
	}

	@Override
	public List<Personne> getAllPersonnes() {
		
		return this.persRepo.findAll();
	}
	
	public List<Personne> recupererInfosActeurs(List<Personne> acteursRef) {
		
		for (Personne acteur:acteursRef) {
			acteur.setId(this.persRepo.getOne(acteur.getId()).getId());
			acteur.setNom(this.persRepo.getOne(acteur.getId()).getNom());
			acteur.setPrenom(this.persRepo.getOne(acteur.getId()).getPrenom());
			acteur.setFilmJoue(this.persRepo.getOne(acteur.getId()).getFilmJoue());
			acteur.setFilmRealise(this.persRepo.getOne(acteur.getId()).getFilmRealise());
		}
		return acteursRef;
	}

	@Override
	public Personne getPersonne(Long id) {
		return this.persRepo.getOne(id);
	}

}
