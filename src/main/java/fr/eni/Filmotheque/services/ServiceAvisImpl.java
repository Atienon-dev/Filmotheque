package fr.eni.Filmotheque.services;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.BO.Avis;
import fr.eni.Filmotheque.dal.AvisRepository;

@Service
public class ServiceAvisImpl implements ServiceAvis{
	
	private AvisRepository avisRepo;	

	public ServiceAvisImpl(AvisRepository avisRepo) {
		super();
		this.avisRepo = avisRepo;
	}

	@Override
	public Avis creerAvis(Avis avis) {
		return this.avisRepo.save(avis);
		
	}

}
