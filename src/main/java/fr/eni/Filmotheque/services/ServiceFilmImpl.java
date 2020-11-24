package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;

@Service
public class ServiceFilmImpl implements ServiceFilm{
	
	List<Film> films = new ArrayList();
	
	public ServiceFilmImpl() {
		Film film1=new Film(Integer.toUnsignedLong(1),"Le cinquième élément","Korben Dallas est embarqué malgré lui dans une quête d'un cinquième élément.");
		Film film2=new Film(Integer.toUnsignedLong(2),"Shane Blake's Kiss Kiss Bang Bang", "A la suite d'un casse ayant mal tourné, Harry se retrouve dans le milieu d'hollywood où il est témoin d'un effroyable meurtre.");
		Film film3=new Film(Integer.toUnsignedLong(3),"Alien - Le huitième passager", "Quand une espèce inconnue infiltre un vaisseau, personne ne vous entend crier.");
		
		film1.setRealisateur(new Personne(Integer.toUnsignedLong(1),"Besson","Luc"));
		
		List acteursAlien =new ArrayList<Personne>();
		acteursAlien.add(0, new Personne(Integer.toUnsignedLong(0),"Weaver","Sigourney"));
		acteursAlien.add(0, new Personne(Integer.toUnsignedLong(2),"Hurt","John"));
		acteursAlien.add(0, new Personne(Integer.toUnsignedLong(3),"Cartwight","Veronica"));
		acteursAlien.add(0, new Personne(Integer.toUnsignedLong(5),"Kotto","Yaphet"));
		film3.setActeurs(acteursAlien);
		
		films.add(film1);
		films.add(film2);
		films.add(film3);
	}
	
	@Override
	public List<Film> getAllFilms(){
		return films;
	}

	@Override
	public void getFilm(Film film1) {
		
		System.out.println("Je suis dans getFilm");
		System.out.println("film1 id : " + film1.getId());
		for(Film film:films) {
			System.out.println("film id : " + film.getId());
			if (film.getId()==film1.getId()) {
				System.out.println(film);
				film1.setTitre(film.getTitre());
				film1.setDescription(film.getDescription());
				film1.setActeurs(film.getActeurs());
				film1.setRealisateur(film.getRealisateur());
			}
		}
	}

}
