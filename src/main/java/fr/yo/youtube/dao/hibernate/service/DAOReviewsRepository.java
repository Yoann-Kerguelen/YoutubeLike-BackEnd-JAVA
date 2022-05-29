package fr.yo.youtube.dao.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOReviews;
import fr.yo.youtube.dao.hibernate.ReviewsRepository;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOReviews
 */
@Service
@Qualifier("ReviewsHibernate")
public class DAOReviewsRepository implements IDAOReviews {

	@Autowired
	ReviewsRepository reviewsRepository;

}
