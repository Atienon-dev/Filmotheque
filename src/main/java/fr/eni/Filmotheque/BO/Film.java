package fr.eni.Filmotheque.BO;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Film {
/*------------------------------------------------------------------------------------------------------------------------
  Attributes
 ------------------------------------------------------------------------------------------------------------------------*/	
	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titre;
	
	private String description;
	
	private Date dateDeSortie;
	
	private Personne realisateur;
	
	private List<Personne> acteurs;
	
	private Categorie categorie;
	
	private List<Avis> avis;
	
/*------------------------------------------------------------------------------------------------------------------------
  Constructors
 ------------------------------------------------------------------------------------------------------------------------*/
	
	public Film() {
		super();
		
	}
	
	public Film(String titre, String description) {
		super();
		this.titre = titre;
		this.description = description;
	}
	
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

	public Date getDateDeSortie() {
		return dateDeSortie;
	}

	public Personne getRealisateur() {
		return realisateur;
	}

	public List<Personne> getActeurs() {
		return acteurs;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public List<Avis> getAvis() {
		return avis;
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


	public void setDateDeSortie(Date dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}

	public void setActeurs(List<Personne> acteurs) {
		this.acteurs = acteurs;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}
	
/*------------------------------------------------------------------------------------------------------------------------
  toString
 ------------------------------------------------------------------------------------------------------------------------*/	
	
	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", description=" + description + ", dateDeSortie=" + dateDeSortie
				+ ", realisateur=" + realisateur + ", acteurs=" + acteurs + ", categorie=" + categorie + ", avis="
				+ avis + "]";
	}
	
	
	
	
}
