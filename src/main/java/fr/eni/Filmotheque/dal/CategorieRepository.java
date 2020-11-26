package fr.eni.Filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.Filmotheque.BO.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie , Long>{

}
