package fr.yo.youtube.dao.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOChannel;
import fr.yo.youtube.dao.hibernate.ChannelRepository;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOChannel
 */

@Service
@Qualifier("ChannelHibernate")
public class DAOChannelRepository implements IDAOChannel {

	@Autowired
	ChannelRepository channelRepository;

}
