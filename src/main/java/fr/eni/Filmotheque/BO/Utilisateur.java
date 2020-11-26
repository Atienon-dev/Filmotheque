package fr.eni.Filmotheque.BO;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {

/*------------------------------------------------------------------------------------------------------------------------
  Attributes
 ------------------------------------------------------------------------------------------------------------------------*/	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String pseudo;
	
	private String motDePasse;
	
	private String statut;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="auteur")
	@Basic(fetch=FetchType.LAZY)
	private List<Avis> listAvis;
	
/*------------------------------------------------------------------------------------------------------------------------
  Constructors
------------------------------------------------------------------------------------------------------------------------*/	

	public Utilisateur() {
		super();
	}
	
	public Utilisateur(Long id, String pseudo, String motDePasse, String statut, List<Avis> listAvis) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.statut = statut;
		this.listAvis = listAvis;
	}
	
/*------------------------------------------------------------------------------------------------------------------------
  Getters
 ------------------------------------------------------------------------------------------------------------------------*/
	
	public Long getId() {
		return id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public String getStatut() {
		return statut;
	}

	public List<Avis> getListAvis() {
		return listAvis;
	}
	
/*------------------------------------------------------------------------------------------------------------------------
  Setters
 ------------------------------------------------------------------------------------------------------------------------*/	

	public void setId(Long id) {
		this.id = id;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public void setListAvis(List<Avis> listAvis) {
		this.listAvis = listAvis;
	}

/*------------------------------------------------------------------------------------------------------------------------
  toString
------------------------------------------------------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", pseudo=" + pseudo + ", motDePasse=" + motDePasse + ", statut=" + statut
				+ ", listAvis=" + listAvis + "]";
	}
	
}
