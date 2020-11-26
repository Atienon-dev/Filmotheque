package fr.eni.Filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.Filmotheque.BO.Film;

public interface FilmRepository extends JpaRepository<Film , Long>{

}
