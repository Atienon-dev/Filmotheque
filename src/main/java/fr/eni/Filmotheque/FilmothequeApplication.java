package fr.eni.Filmotheque;

import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import fr.eni.Filmotheque.BO.Avis;
import fr.eni.Filmotheque.BO.Categorie;
import fr.eni.Filmotheque.BO.Film;
import fr.eni.Filmotheque.BO.Personne;

@SpringBootApplication
public class FilmothequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmothequeApplication.class, args);
		
		Film film = new Film("Le cinqui�me �l�ment", "Korben Dallas est embarqu� malgr� lui dans la qu�te d'un cinqui�me �l�ment.", new Date(), null, null,
				null, null);
	}

}
