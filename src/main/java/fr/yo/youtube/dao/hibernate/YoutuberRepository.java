package fr.yo.youtube.dao.hibernate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.yo.youtube.entities.Youtuber;

/**
 * le repository pour les crud de youtuber
 */

@Repository
public interface YoutuberRepository extends CrudRepository<Youtuber, Long> {

	public Youtuber findByUsername(String username);

	public Youtuber findByEmail(String email);

}
