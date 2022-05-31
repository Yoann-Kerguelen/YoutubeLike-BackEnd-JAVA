package fr.yo.youtube.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;
import fr.yo.youtube.entities.Category;

/**
 * Classe servant à faire les functions de category pour l'ihm
 **/

@Service
public class CategoryManager {

	@Autowired
	DAO dao;

	/**
	 * get all category
	 */
	public List<Category> getAllCategory() {
		return dao.getDAOCategory().getAllCategory();
	}

	/**
	 * get a category
	 */
	public Category getCategory(long pk) {
		return dao.getDAOCategory().getCategory(pk);
	}

	/**
	 * update category
	 */
	public void updateCategory(Category category) {
		dao.getDAOCategory().updateCategory(category);
	}

}
