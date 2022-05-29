package fr.yo.youtube.dao.hibernate.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOVideo;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOVideo
 */

@Service
@Qualifier("VideoHibernate")
public class DAOVideoRepository implements IDAOVideo {

}
