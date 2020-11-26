package fr.eni.Filmotheque.BO;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Film {
/*------------------------------------------------------------------------------------------------------------------------
  Attributes
 ------------------------------------------------------------------------------------------------------------------------*/	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titre;
	
	private String description;
	
	private Date dateDeSortie;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@Basic(fetch=FetchType.LAZY)
	private Personne realisateur;
	
	@ManyToMany(cascade=CascadeType.ALL)
	//@JoinTable(name="acteurs_films",joinColumns= {@JoinColumn(name="acteur_id")},
	//	inverseJoinColumns=@JoinColumn(name="film_id")})
	private List<Personne> acteurs;
	
	@OneToOne(cascade=CascadeType.ALL)
	@Basic(fetch=FetchType.LAZY)
	private Categorie categorie;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="film")
	@Basic(fetch=FetchType.LAZY)
	private List<Avis> avis;
	
/*------------------------------------------------------------------------------------------------------------------------
  Constructors
 ------------------------------------------------------------------------------------------------------------------------*/
	
	public Film() {
		super();
		
	}
	
	public Film(String titre, String description, Date dateDeSortie, Personne realisateur, List<Personne> acteurs,
			Categorie categorie, List<Avis> avis) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateDeSortie = dateDeSortie;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
		this.categorie = categorie;
		this.avis = avis;
	}

	public Film(Long id,String titre, String description) {
		super();
		this.id = id;
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
