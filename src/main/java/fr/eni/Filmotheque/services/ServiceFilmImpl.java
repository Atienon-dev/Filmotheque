package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;

@Service
@SessionAttributes("FilmIni")
public class ServiceFilmImpl implements ServiceFilm{
	
	Film film;
	List<Film> films = new ArrayList();
	ServicePersonne servicePersonne;
	
	Film film1;
	Film film2;
	Film film3;
	
	public ServiceFilmImpl(ServicePersonne servicePersonne) {
		
		this.servicePersonne=servicePersonne;
		
			this.film1=new Film(Integer.toUnsignedLong(1),"Le cinquième élément","Korben Dallas est embarqué malgré lui dans une quête d'un cinquième élément.");
			this.film2=new Film(Integer.toUnsignedLong(2),"Shane Blake's Kiss Kiss Bang Bang", "A la suite d'un casse ayant mal tourné, Harry se retrouve dans le milieu d'hollywood où il est témoin d'un effroyable meurtre.");
			this.film3=new Film(Integer.toUnsignedLong(3),"Alien - Le huitième passager", "Quand une espèce inconnue infiltre un vaisseau, personne ne vous entend crier.");
			this.film=new Film();
			this.film1.setRealisateur(new Personne(Integer.toUnsignedLong(1),"Besson","Luc"));
			
			List acteursAlien =new ArrayList<Personne>();
			acteursAlien.add(new Personne(Integer.toUnsignedLong(0),null,null));
			acteursAlien.add(new Personne(Integer.toUnsignedLong(2),null,null));
			acteursAlien.add(new Personne(Integer.toUnsignedLong(3),null,null));
			acteursAlien.add(new Personne(Integer.toUnsignedLong(5),null,null));
			this.film3.setActeurs(acteursAlien);
			
			this.films.add(film1);
			this.films.add(film2);
			this.films.add(film3);
		
	}
	
	@ModelAttribute("FilmIni")
	public void initialise() {
		
	}
	
	
	@Override
	public List<Film> getAllFilms(){
		return this.films;
	}

	@Override
	public Film getFilm(Long id) {
		
		for(Film film:this.films) {
			
			if (id==film.getId()) {
				
					this.film.setId(id);
					
					this.film.setTitre(film.getTitre());	
				
					this.film.setDescription(film.getDescription());
				
					this.film.setActeurs(film.getActeurs());

					this.film.setRealisateur(film.getRealisateur());
				
					this.film.setActeurs(servicePersonne.getAllActeurs(this.film.getActeurs()));
			}
		}
		return this.film;
	}

	@Override
	public Film ajouterActeurs(Film filmRef) {

		this.film=getFilm(filmRef.getId());
		List<Personne> acteurs = new ArrayList<Personne>();
		
		if(filmRef.getActeurs() != null) {
			for(Personne acteur:filmRef.getActeurs()) {
				if (acteur.getId() != null) {
					acteurs.add(acteur);
				}
			}
		}
		
		acteurs=servicePersonne.getAllActeurs(acteurs);
		
		for(Personne acteur:acteurs) {
			if (!this.film.getActeurs().contains(acteur)) {
				this.film.getActeurs().add(acteur);
			}
		}	
		
		return this.film;
		
	}

	@Override
	public Film modifierRealisateurs(Film filmRef) {
		this.film=getFilm(filmRef.getId());
	
		this.film.setRealisateur(servicePersonne.getPersonne(filmRef.getRealisateur().getId()));
		
		return this.film;
	}
	
	

}
