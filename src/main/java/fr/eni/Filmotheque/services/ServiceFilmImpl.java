package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Film;

@Service
public class ServiceFilmImpl implements ServiceFilm{
	
	List<Film> films = new ArrayList();
	
	public ServiceFilmImpl() {
		Film film1=new Film("Le cinqui�me �l�ment","Korben Dallas est embarqu� malgr� lui dans une qu�te d'un cinqui�me �l�ment.");
		Film film2=new Film("Shane Blake's Kiss Kiss Bang Bang", "A la suite d'un casse ayant mal tourn�, Harry se retrouve dans le milieu d'hollywood o� il est t�moin d'un effroyable meurtre.");
		Film film3=new Film("Alien - Le huiti�me passager", "Quand une esp�ce inconnue infiltre un vaisseau, personne ne vous entend crier.");
		
		films.add(film1);
		films.add(film2);
		films.add(film3);
	}
	
	@Override
	public List<Film> getAllFilms(){
		return films;
	}

}
