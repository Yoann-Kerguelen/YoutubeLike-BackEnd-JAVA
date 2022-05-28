package fr.yo.youtube.dao.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOCategory;
import fr.yo.youtube.dao.hibernate.CategoryRepository;

/**
 * La classe sevant � r�cup�rer le repo et l'utiliser pour les crud demander par
 * IDAOCategory
 */

@Service
@Qualifier("CategoryHibernate")
public class DAOCategoryRepository implements IDAOCategory {

	@Autowired
	CategoryRepository categoryRepository;

}
