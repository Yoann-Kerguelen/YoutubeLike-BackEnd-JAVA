package fr.yo.youtube.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;
import fr.yo.youtube.entities.Reviews;
import fr.yo.youtube.entities.Video;

/**
 * Classe servant à faire les functions de video pour l'ihm
 **/

@Service
public class VideoManager {

	@Autowired
	DAO dao;

	/**
	 * create a video
	 */
	public void createVideo(Video video) {
		dao.getDAOVideo().createVideo(video);
	}

	/**
	 * get all video
	 */
	public List<Video> getAllVideo() {
		return dao.getDAOVideo().getAllVideo();
	}

	/**
	 * get a video
	 */
	public Video getVideo(long pk) {
		return dao.getDAOVideo().getVideo(pk);
	}

	/**
	 * update a video
	 */
	public void updateVideo(Video video) {
		dao.getDAOVideo().updateVideo(video);
	}

	/**
	 * delete a video
	 */
	public void deleteVideo(long pk) {
		dao.getDAOVideo().deleteVideo(pk);
	}

	/**
	 * add a review
	 */
	public void addReviews(Reviews reviews, Video video) {
		dao.getDAOVideo().addReviews(reviews, video);
	}
}
