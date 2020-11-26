package fr.eni.Filmotheque.BO;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Avis {
	
/*------------------------------------------------------------------------------------------------------------------------
  Attributes
 ------------------------------------------------------------------------------------------------------------------------*/
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		private String titre;
		
		private String description;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@Basic(fetch=FetchType.LAZY)
		private Film film;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@Basic(fetch=FetchType.LAZY)
		private Utilisateur auteur;
		
/*------------------------------------------------------------------------------------------------------------------------
  Getters
 ------------------------------------------------------------------------------------------------------------------------*/

		public Long getId() {
			return id;
		}

		public String getTitre() {
			return titre;
		}

		public String getDescription() {
			return description;
		}

		public Film getFilm() {
			return film;
		}

		public Utilisateur getAuteur() {
			return auteur;
		}
			
/*------------------------------------------------------------------------------------------------------------------------
  Setters
 ------------------------------------------------------------------------------------------------------------------------*/		

		public void setId(Long id) {
			this.id = id;
		}

		public void setTitre(String titre) {
			this.titre = titre;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setFilm(Film film) {
			this.film = film;
		}

		public void setAuteur(Utilisateur auteur) {
			this.auteur = auteur;
		}		
/*------------------------------------------------------------------------------------------------------------------------
  toString
 ------------------------------------------------------------------------------------------------------------------------*/

		@Override
		public String toString() {
			return "Avis [id=" + id + ", titre=" + titre + ", description=" + description + ", film=" + film + "]";
		}	

}
