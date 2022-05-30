package fr.yo.youtube.dao.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOChannel;
import fr.yo.youtube.dao.hibernate.ChannelRepository;
import fr.yo.youtube.entities.Channel;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOChannel
 */

@Service
@Qualifier("ChannelHibernate")
public class DAOChannelRepository implements IDAOChannel {

	@Autowired
	ChannelRepository channelRepository;

	@Override
	public Channel getChannelByID(long pk) {
		return channelRepository.findById(pk).orElse(null);
	}

	@Override
	public List<Channel> getAllChannel() {
		return (List<Channel>) channelRepository.findAll();
	}

	@Override
	public void updateChannel(Channel channel) {
		channelRepository.save(channel);
	}

}
