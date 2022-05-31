package fr.yo.youtube.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;
import fr.yo.youtube.entities.Channel;
import fr.yo.youtube.entities.Suscriber;

/**
 * Classe servant à faire les functions de suscriber pour l'ihm
 **/

@Service
public class SuscriberManager {

	@Autowired
	DAO dao;

	/**
	 * Suscribe to a channel
	 */
	public void suscribeToAChannel(Suscriber suscriber, Channel channel) {
		dao.getDAOSuscriber().suscribeToAChannel(suscriber, channel);
	}

	/**
	 * unSuscribe To A Channel
	 */
	public void unSuscribeToAChannel(Suscriber suscriber, Channel channel) {
		dao.getDAOSuscriber().unSuscribeToAChannel(suscriber, channel);
	}
}
