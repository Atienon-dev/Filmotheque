package fr.eni.Filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.Filmotheque.BO.Personne;

public interface PersonneRepository extends JpaRepository<Personne , Long>{

}
