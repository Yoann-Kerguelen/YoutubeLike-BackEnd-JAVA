package fr.yo.youtube.dao.hibernate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.yo.youtube.entities.Video;

/**
 * le repository pour les crud de video
 */

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {

}
