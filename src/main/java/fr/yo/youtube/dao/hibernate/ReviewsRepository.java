package fr.yo.youtube.dao.hibernate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.yo.youtube.entities.Reviews;

/**
 * le repository pour les crud de reviews
 */

@Repository
public interface ReviewsRepository extends CrudRepository<Reviews, Long> {

}
