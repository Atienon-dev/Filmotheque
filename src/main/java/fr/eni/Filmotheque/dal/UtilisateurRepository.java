package fr.eni.Filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.Filmotheque.BO.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur , Long>{

}
