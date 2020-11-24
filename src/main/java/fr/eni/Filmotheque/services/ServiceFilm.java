package fr.eni.Filmotheque.services;

import java.util.List;

import fr.eni.Filmotheque.BO.Film;

public interface ServiceFilm {
	
	public List<Film> getAllFilms();
	
	public void getFilm(Film film);

}
