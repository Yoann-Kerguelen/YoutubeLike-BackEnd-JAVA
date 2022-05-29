package fr.yo.youtube.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;
import fr.yo.youtube.entities.Youtuber;

/**
 * Classe servant à faire les functions de youtuber pour l'ihm
 **/

@Service
public class YoutuberManager {

	@Autowired
	DAO dao;

	/**
	 * get youtuber by his ID
	 */
	public Youtuber getYoutuber(long id) {
		return dao.getDAOYoutuber().getYoutuberByID(id);
	}

	/**
	 * get all youtuber in a list
	 */
	public List<Youtuber> getAllYoutuber() {
		return dao.getDAOYoutuber().getAllYoutuber();
	}

	// TODO suite à faire ...
}
