package fr.yo.youtube.dao.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.IDAOSuscriber;
import fr.yo.youtube.dao.hibernate.SuscriberRepository;
import fr.yo.youtube.entities.Channel;
import fr.yo.youtube.entities.Suscriber;

/**
 * La classe sevant � r�cup�rer le repo et l'utiliser pour les crud demander par
 * IDAOSuscriber
 */

@Service
@Qualifier("SuscriberHibernate")
public class DAOSuscriberRepository implements IDAOSuscriber {

	@Autowired
	SuscriberRepository suscriberRepository;

	@Override
	public void suscribeToAChannel(Suscriber suscriber, Channel channel) {
		suscriber.getChannelsSubscriptions().add(channel);
		suscriberRepository.save(suscriber);
	}

	@Override
	public void unSuscribeToAChannel(Suscriber suscriber, Channel channel) {
		suscriber.getChannelsSubscriptions().remove(channel);
		suscriberRepository.save(suscriber);
	}

	@Override
	public List<Suscriber> selectAllSuscriber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Suscriber selectSuscriberById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
