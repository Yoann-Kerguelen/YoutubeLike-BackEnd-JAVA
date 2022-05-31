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
	 * create a youtuber
	 */
	public void createYoutuber(Youtuber youtuber) {
		dao.getDAOYoutuber().createYoutuber(youtuber);
	}

	/**
	 * get all youtubers in a list
	 */
	public List<Youtuber> getAllYoutuber() {
		return dao.getDAOYoutuber().getAllYoutuber();
	}

	/**
	 * get a youtuber by his ID
	 */
	public Youtuber getYoutuberByID(long pk) {
		return dao.getDAOYoutuber().getYoutuberByID(pk);
	}

	/**
	 * get a youtuber by his Username
	 */
	public Youtuber getYoutuberByUsername(String username) {
		return dao.getDAOYoutuber().getYoutuberByUsername(username);
	}

	/**
	 * update a youtuber
	 */
	public void updateYoutuber(Youtuber youtuber) {
		dao.getDAOYoutuber().updateYoutuber(youtuber);
	}

	/**
	 * delete a youtuber by his ID
	 */
	public void deleteYoutuber(long pk) {
		dao.getDAOYoutuber().deleteYoutuber(pk);
	}
}
