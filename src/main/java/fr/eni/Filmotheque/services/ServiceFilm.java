package fr.eni.Filmotheque.services;

import java.util.List;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;

public interface ServiceFilm {
	
	public List<Film> getAllFilms();
	
	public Film getFilm(Long id);
	
	public Film ajouterActeurs(Film filmRef);
	
	public Film modifierRealisateurs(Film film);

}
