package fr.eni.Filmotheque.BO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Personne {

/*------------------------------------------------------------------------------------------------------------------------
  Attributes
 ------------------------------------------------------------------------------------------------------------------------*/
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	private List<Film> filmJoue;
	
	private List<Film> filmRealise;

/*------------------------------------------------------------------------------------------------------------------------
  Constructors
------------------------------------------------------------------------------------------------------------------------*/
	public Personne() {
		super();
		
	}
	
	public Personne(Long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
/*------------------------------------------------------------------------------------------------------------------------
  Getters
 ------------------------------------------------------------------------------------------------------------------------*/
	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public List<Film> getFilmJoue() {
		return filmJoue;
	}

	public List<Film> getFilmRealise() {
		return filmRealise;
	}


	
/*------------------------------------------------------------------------------------------------------------------------
  Setters
 ------------------------------------------------------------------------------------------------------------------------*/

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setFilmJoue(List<Film> filmJoue) {
		this.filmJoue = filmJoue;
	}

	public void setFilmRealise(List<Film> filmRealise) {
		this.filmRealise = filmRealise;
	}

	
	
/*------------------------------------------------------------------------------------------------------------------------
  toString
 ------------------------------------------------------------------------------------------------------------------------*/	
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", filmJoue=" + filmJoue
				+ ", filmRealise=" + filmRealise + "]";
	}
	
}
