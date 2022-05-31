package fr.yo.youtube.dao;

import java.util.List;

import fr.yo.youtube.entities.Category;

//TODO ajouter les crud de base que l'on a besoins -> classe servant à l'impl de la dao

public interface IDAOCategory {

	/**
	 * get all category
	 */
	public List<Category> getAllCategory();

	/**
	 * get a category
	 */
	public Category getCategory(long pk);

	/**
	 * update category
	 */
	public void updateCategory(Category category);
}
