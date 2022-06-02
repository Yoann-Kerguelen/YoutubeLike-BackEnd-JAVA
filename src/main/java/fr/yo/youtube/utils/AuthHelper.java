package fr.yo.youtube.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.bll.DAOManager;
import fr.yo.youtube.entities.Youtuber;

@Service
public class AuthHelper {

	@Autowired
	private DAOManager daoManager;

	public Youtuber getAuth(HttpServletRequest request) {
		// Username de user detail (login pour nous)
		if (request.getUserPrincipal() != null) {
			// Stocké dans spring security
			String login = request.getUserPrincipal().getName();

			// Récupère le membre depuis la base
			Youtuber connectedUser = daoManager.getYoutuberManager().getYoutuberByUsername(login);

			return connectedUser;
		}

		return null;
	}
}
