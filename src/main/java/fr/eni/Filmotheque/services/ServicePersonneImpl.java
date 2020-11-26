package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;

@Service
public class ServicePersonneImpl implements ServicePersonne{
	
	private Personne personne= new Personne();
	private List<Personne> personnes = new ArrayList();
	
	public ServicePersonneImpl() {
		Personne personne1=new Personne(Integer.toUnsignedLong(0),"Weaver","Sigourney");
		Personne personne2=new Personne(Integer.toUnsignedLong(3),"Cartwight","Veronica");
		Personne personne3=new Personne(Integer.toUnsignedLong(2),"Hurt","John");
		Personne personne4=new Personne(Integer.toUnsignedLong(1),"Besson","Luc");
		Personne personne5=new Personne(Integer.toUnsignedLong(5),"Kotto","Yaphet");
		Personne personne6=new Personne(Integer.toUnsignedLong(6),"Eastwood","Clint");
		Personne personne7=new Personne(Integer.toUnsignedLong(7),"Coppola","Francis Ford");
		Personne personne8=new Personne(Integer.toUnsignedLong(8),"Pitt","Brad");
		Personne personne9=new Personne(Integer.toUnsignedLong(9),"Jolie","Angelina");
		Personne personne10=new Personne(Integer.toUnsignedLong(10),"Kilmer","Val");
		Personne personne11=new Personne(Integer.toUnsignedLong(11),"Aniston","Jennifer");
		Personne personne12=new Personne(Integer.toUnsignedLong(12),"Schwimmer","David");
		Personne personne13=new Personne(Integer.toUnsignedLong(13),"Lucas","Georges");
		Personne personne14=new Personne(Integer.toUnsignedLong(14),"Spielberg","Steven");
		Personne personne15=new Personne(Integer.toUnsignedLong(15),"Johansson","Scarlett");
		Personne personne16=new Personne(Integer.toUnsignedLong(16),"Downey","Robert Jr");
		
		personnes.add(personne1);
		personnes.add(personne2); 
		personnes.add(personne3); 
		personnes.add(personne4);
		personnes.add(personne5);
		personnes.add(personne6);
		personnes.add(personne7);
		personnes.add(personne8);
		personnes.add(personne9);
		personnes.add(personne10);
		personnes.add(personne11);
		personnes.add(personne12);
		personnes.add(personne13);
		personnes.add(personne14);
		personnes.add(personne15);
		personnes.add(personne16);
		
		
		
	}

	@Override
	public List<Personne> getAllPersonnes() {
		// TODO Auto-generated method stub
		return this.personnes;
	}
	
	public List<Personne> getAllActeurs(List<Personne> acteursRef) {
		
		List<Personne> acteurs = new ArrayList<Personne>();
		
		if (this.personnes != null) {			
			for(Personne acteur:personnes) {
				if (acteursRef != null) {
					for(Personne acteurRef:acteursRef) {
						if (acteurRef.getId() == acteur.getId()) {
							acteurRef.setNom(acteur.getNom());
							acteurRef.setPrenom(acteur.getPrenom());
							acteurRef.setFilmJoue(acteur.getFilmJoue());
							acteurRef.setFilmRealise(acteur.getFilmRealise());
							acteurs.add(acteur);
						}
					}
				}
			}
		}return acteurs;
	}

	@Override
	public Personne getPersonne(Long id) {
		if (this.personnes != null) {			
			for(Personne acteur:this.personnes) {
						if (id == acteur.getId()) {
							this.personne.setId(id);
							this.personne.setNom(acteur.getNom());
							this.personne.setPrenom(acteur.getPrenom());
							this.personne.setFilmJoue(acteur.getFilmJoue());
							this.personne.setFilmRealise(acteur.getFilmRealise());
							return this.personne;
						}
			}
		}
		return null;
	}

}
