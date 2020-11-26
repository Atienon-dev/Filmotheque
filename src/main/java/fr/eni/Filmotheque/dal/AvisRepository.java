package fr.eni.Filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.Filmotheque.BO.Avis;

public interface AvisRepository extends JpaRepository<Avis , Long> {

}
