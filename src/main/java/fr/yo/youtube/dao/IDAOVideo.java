package fr.yo.youtube.dao;

import java.util.List;

import fr.yo.youtube.entities.Category;
import fr.yo.youtube.entities.Video;

//TODO ajouter les crud de base que l'on a besoins -> classe servant � l'impl de la dao

public interface IDAOVideo {

	/**
	 * create a video
	 */
	public void createVideo(Video video);

	/**
	 * get all video
	 */
	public List<Video> getAllVideo();

	/**
	 * get a video
	 */
	public Video getVideo(long pk);

	/**
	 * update a video
	 */
	public void updateVideo(Video video);

	/**
	 * delete a video
	 */
	public void deleteVideo(long pk);
	
	/**
	 * get category
	 */
	public List <Category> selectAllCategory();
	public Category selectCategoryById(long id);

}
