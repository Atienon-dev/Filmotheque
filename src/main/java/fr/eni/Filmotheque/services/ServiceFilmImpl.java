package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;
import fr.eni.Filmotheque.dal.FilmRepository;

@Service
public class ServiceFilmImpl implements ServiceFilm{
	
	private Film film;
	private ServicePersonne servicePersonne;
	private FilmRepository filmRepo;
	
	public ServiceFilmImpl(ServicePersonne servicePersonne, FilmRepository filmRepo) {
		this.filmRepo=filmRepo;
		this.servicePersonne=servicePersonne;
	}	
	
	@Override
	public List<Film> getAllFilms(){
		return this.filmRepo.findAll();
	}

	@Override
	public Film getFilm(Long id) {
		return this.filmRepo.getOne(id);
	}

	@Override
	public Film ajouterActeurs(Film filmRef) {

		List<Personne> acteursTemp=new ArrayList<Personne>();
		
		if(filmRef.getActeurs() != null) {
			for(Personne acteurRef:filmRef.getActeurs()) {
				if(acteurRef.getId() != null) {
					acteursTemp.add(acteurRef);
				}
			}
		}
		
		for(Personne acteurTemp:acteursTemp) {
			acteurTemp.setId(this.servicePersonne.getPersonne(acteurTemp.getId()).getId());
			acteurTemp.setNom(this.servicePersonne.getPersonne(acteurTemp.getId()).getNom());
			acteurTemp.setPrenom(this.servicePersonne.getPersonne(acteurTemp.getId()).getPrenom());
			acteurTemp.setFilmJoue(this.servicePersonne.getPersonne(acteurTemp.getId()).getFilmJoue());
			acteurTemp.setFilmRealise(this.servicePersonne.getPersonne(acteurTemp.getId()).getFilmRealise());
		}
		System.out.println("acteursTemp : " + acteursTemp);
		
		filmRef=this.getFilm(filmRef.getId());
		
		if(acteursTemp != null) {
			boolean add=true;
			
			for(Personne acteurTemp:acteursTemp) {
				
				if(filmRef.getActeurs() != null) {
					
					for(Personne acteurRef:filmRef.getActeurs()) {
						if(acteurRef.getId()==acteurTemp.getId()) {
							add=false;
						}
					}					
					
				}
				
				if(add) {
					if(acteurTemp != null) {
						filmRef.getActeurs().add(acteurTemp);
					}
				}else {
					add=true;
				}
			}
		}
		
		if (filmRef != null) {
		return this.filmRepo.save(filmRef);
		}else {
			return null;
		}
	}

	@Override
	public Film modifierRealisateurs(Film filmRef) {
		this.film=getFilm(filmRef.getId());
	
		this.film.setRealisateur(servicePersonne.getPersonne(filmRef.getRealisateur().getId()));		
		
		return this.filmRepo.save(this.film);
	}
	
	

}
