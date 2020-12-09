package fr.eni.Filmotheque.BO;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Personne {

/*------------------------------------------------------------------------------------------------------------------------
  Attributes
 ------------------------------------------------------------------------------------------------------------------------*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private String prenom;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="acteurs")
	private List<Film> filmJoue;
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true, mappedBy="realisateur")
	@Basic(fetch=FetchType.EAGER)
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
