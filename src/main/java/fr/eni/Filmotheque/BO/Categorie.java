package fr.eni.Filmotheque.BO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//@Entity
public class Categorie {
		
/*------------------------------------------------------------------------------------------------------------------------
  Attributes
 ------------------------------------------------------------------------------------------------------------------------*/

	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String categorie;

/*------------------------------------------------------------------------------------------------------------------------
  Getters
 ------------------------------------------------------------------------------------------------------------------------*/
	
	public Long getId() {
		return id;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
/*------------------------------------------------------------------------------------------------------------------------
  Setters
 ------------------------------------------------------------------------------------------------------------------------*/

	public void setId(Long id) {
		this.id = id;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

/*------------------------------------------------------------------------------------------------------------------------
  toString
 ------------------------------------------------------------------------------------------------------------------------*/
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", categorie=" + categorie + "]";
	}
	
}
