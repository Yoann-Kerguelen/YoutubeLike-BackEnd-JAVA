package fr.yo.youtube.dao.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOCategory;
import fr.yo.youtube.dao.hibernate.CategoryRepository;
import fr.yo.youtube.entities.Category;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOCategory
 */

@Service
@Qualifier("CategoryHibernate")
public class DAOCategoryRepository implements IDAOCategory {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {
		return (List<Category>) categoryRepository.findAll();
	}

	@Override
	public Category getCategory(long pk) {
		return categoryRepository.findById(pk).orElse(null);
	}

	@Override
	public void updateCategory(Category category) {
		categoryRepository.save(category);
	}

}
