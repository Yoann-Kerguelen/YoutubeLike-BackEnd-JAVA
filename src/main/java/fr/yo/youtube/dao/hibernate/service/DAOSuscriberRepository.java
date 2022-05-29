package fr.yo.youtube.dao.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOSuscriber;
import fr.yo.youtube.dao.hibernate.SuscriberRepository;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOSuscriber
 */

@Service
@Qualifier("SuscriberHibernate")
public class DAOSuscriberRepository implements IDAOSuscriber {

	@Autowired
	SuscriberRepository suscriberRepository;

}
