package fr.yo.youtube.dao.hibernate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.yo.youtube.entities.Suscriber;

/**
 * le repository pour les crud de suscriber
 */

@Repository
public interface SuscriberRepository extends CrudRepository<Suscriber, Long> {

}
