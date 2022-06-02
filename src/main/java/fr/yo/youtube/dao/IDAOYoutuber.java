package fr.yo.youtube.dao;

import java.util.List;

import fr.yo.youtube.entities.Youtuber;

//TODO ajouter les crud de base que l'on a besoins -> classe servant à l'impl de la dao

public interface IDAOYoutuber {

	/**
	 * create a youtuber
	 */
	public void createYoutuber(Youtuber youtuber);

	/**
	 * get all youtubers in a list
	 */
	public List<Youtuber> getAllYoutuber();

	/**
	 * get a youtuber by his ID
	 */
	public Youtuber getYoutuberByID(long pk);

	/**
	 * get a youtuber by his Username
	 */
	public Youtuber getYoutuberByUsername(String username);

	/**
	 * get a youtuber by his Email
	 */
	public Youtuber getYoutuberByEmail(String email);

	/**
	 * update a youtuber
	 */
	public void updateYoutuber(Youtuber youtuber);

	/**
	 * delete a youtuber by his ID
	 */
	public void deleteYoutuber(long pk);

}
