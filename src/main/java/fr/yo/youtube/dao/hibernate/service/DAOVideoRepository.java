package fr.yo.youtube.dao.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOVideo;
import fr.yo.youtube.dao.hibernate.VideoRepository;
import fr.yo.youtube.entities.Video;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOVideo
 */

@Service
@Qualifier("VideoHibernate")
public class DAOVideoRepository implements IDAOVideo {

	@Autowired
	VideoRepository videoRepository;

	@Override
	public void createVideo(Video video) {
		videoRepository.save(video);
	}

	@Override
	public List<Video> getAllVideo() {
		return (List<Video>) videoRepository.findAll();
	}

	@Override
	public Video getVideo(long pk) {
		return videoRepository.findById(pk).orElse(null);
	}

	@Override
	public void updateVideo(Video video) {
		videoRepository.save(video);
	}

	@Override
	public void deleteVideo(long pk) {
		videoRepository.deleteById(pk);
	}

}
