package fr.yo.youtube.dao.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOYoutuber;
import fr.yo.youtube.dao.hibernate.YoutuberRepository;
import fr.yo.youtube.entities.Youtuber;

/**
 * La classe sevant à récupérer le repo et l'utiliser pour les crud demander par
 * IDAOYoutuber
 */

@Service
@Qualifier("YoutuberHibernate")
public class DAOYoutuberRepository implements IDAOYoutuber {

	@Autowired
	YoutuberRepository youtuberRepository;

	@Override
	public void createYoutuber(Youtuber youtuber) {
		youtuberRepository.save(youtuber);
	}

	@Override
	public List<Youtuber> getAllYoutuber() {
		return (List<Youtuber>) youtuberRepository.findAll();
	}

	@Override
	public Youtuber getYoutuberByID(long pk) {
		return youtuberRepository.findById(pk).orElse(null);
	}

	@Override
	public Youtuber getYoutuberByUsername(String username) {
		return youtuberRepository.findByUsername(username);
	}

	@Override
	public Youtuber getYoutuberByEmail(String email) {
		return youtuberRepository.findByEmail(email);
	}

	@Override
	public Youtuber getYoutuberByEmailAndPassword(String email, String password) {
		return youtuberRepository.findByEmailAndPassword(email, password);
	}

	@Override
	public void updateYoutuber(Youtuber youtuber) {
		youtuberRepository.save(youtuber);
	}

	@Override
	public void deleteYoutuber(long pk) {
		youtuberRepository.deleteById(pk);
	}

}
