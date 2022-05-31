package fr.yo.youtube.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;
import fr.yo.youtube.entities.Channel;

/**
 * Classe servant à faire les functions de channel pour l'ihm
 **/

@Service
public class ChannelManager {

	@Autowired
	DAO dao;

	/**
	 * get a channel by id
	 */
	public Channel getChannelByID(long pk) {
		return dao.getDAOChannel().getChannelByID(pk);
	}

	/**
	 * get all channels
	 */
	public List<Channel> getAllChannel() {
		return dao.getDAOChannel().getAllChannel();
	}

	/**
	 * update a channel
	 */
	public void updateChannel(Channel channel) {
		dao.getDAOChannel().updateChannel(channel);
	}

}
