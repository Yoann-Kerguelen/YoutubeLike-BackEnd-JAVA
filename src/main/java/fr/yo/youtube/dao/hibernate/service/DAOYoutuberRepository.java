package fr.yo.youtube.dao.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOYoutuber;
import fr.yo.youtube.dao.hibernate.YoutuberRepository;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOYoutuber
 */

@Service
@Qualifier("YoutuberHibernate")
public class DAOYoutuberRepository implements IDAOYoutuber {

	@Autowired
	YoutuberRepository youtuberRepository;
}
