package fr.eni.Filmotheque.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Personne;

@Service
public class ServicePersonneImpl implements ServicePersonne{
	
List<Personne> personnes = new ArrayList();
	
	public ServicePersonneImpl() {
		Personne personne1=new Personne(Integer.toUnsignedLong(0),"Weaver","Sigourney");
		Personne personne2=new Personne(Integer.toUnsignedLong(3),"Cartwight","Veronica");
		Personne personne3=new Personne(Integer.toUnsignedLong(2),"Hurt","John");
		Personne personne4=new Personne(Integer.toUnsignedLong(1),"Besson","Luc");
		Personne personne5=new Personne(Integer.toUnsignedLong(5),"Kotto","Yaphet");
		Personne personne6=new Personne(Integer.toUnsignedLong(2),"Eastwood","Clint");
		Personne personne7=new Personne(Integer.toUnsignedLong(2),"Coppola","Francis Ford");
		Personne personne8=new Personne(Integer.toUnsignedLong(2),"Pitt","Brad");
		Personne personne9=new Personne(Integer.toUnsignedLong(2),"Jolie","Angelina");
		Personne personne10=new Personne(Integer.toUnsignedLong(2),"Kilmer","Val");
		Personne personne11=new Personne(Integer.toUnsignedLong(2),"Aniston","Jennifer");
		Personne personne12=new Personne(Integer.toUnsignedLong(2),"Schwimmer","David");
		Personne personne13=new Personne(Integer.toUnsignedLong(2),"Lucas","Georges");
		Personne personne14=new Personne(Integer.toUnsignedLong(2),"Spielberg","Steven");
		Personne personne15=new Personne(Integer.toUnsignedLong(2),"Johansson","Scarlett");
		Personne personne16=new Personne(Integer.toUnsignedLong(2),"Downey","Robert Jr");
		
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
		return personnes;
	}

	@Override
	public void getPersonne(Personne personne) {
		// TODO Auto-generated method stub
		
	}

}
