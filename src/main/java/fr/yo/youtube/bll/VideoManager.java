package fr.yo.youtube.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;
import fr.yo.youtube.entities.Suscriber;
import fr.yo.youtube.entities.Video;
import fr.yo.youtube.bll.utils.VideoFormDataContainer;

/**
 * Classe servant � faire les functions de video pour l'ihm
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
	
	@SuppressWarnings("unchecked")
	public VideoFormDataContainer getVideoFormSetting() {
		VideoFormDataContainer videoSetting = new VideoFormDataContainer();
		
		videoSetting.suscriberList = (List<Suscriber>)(List<?>) dao.getDAOSuscriber().selectAllSuscriber();
		
		videoSetting.categoryList = dao.getDAOVideo().selectAllCategory();
		
		return videoSetting;
	}
}
