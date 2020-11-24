package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Film;

@Service
public class ServiceFilmImpl implements ServiceFilm{
	
	List<Film> films = new ArrayList();
	
	public ServiceFilmImpl() {
		Film film1=new Film("Le cinquième élément","Korben Dallas est embarqué malgré lui dans une quête d'un cinquième élément.");
		Film film2=new Film("Shane Blake's Kiss Kiss Bang Bang", "A la suite d'un casse ayant mal tourné, Harry se retrouve dans le milieu d'hollywood où il est témoin d'un effroyable meurtre.");
		Film film3=new Film("Alien - Le huitième passager", "Quand une espèce inconnue infiltre un vaisseau, personne ne vous entend crier.");
		
		films.add(film1);
		films.add(film2);
		films.add(film3);
	}
	
	@Override
	public List<Film> getAllFilms(){
		return films;
	}

}
