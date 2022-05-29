package fr.yo.youtube.dao.hibernate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.yo.youtube.entities.Channel;

/**
 * le repository pour les crud de channel
 */

@Repository
public interface ChannelRepository extends CrudRepository<Channel, Long> {

}
