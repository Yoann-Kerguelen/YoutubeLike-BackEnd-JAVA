package fr.yo.youtube.dao;

import java.util.List;

import fr.yo.youtube.entities.Channel;
import fr.yo.youtube.entities.Suscriber;

//TODO ajouter les crud de base que l'on a besoins -> classe servant � l'impl de la dao

public interface IDAOSuscriber {

	/**
	 * Suscribe to a channel
	 */
	public void suscribeToAChannel(Suscriber suscriber, Channel channel);

	/**
	 * unSuscribe To A Channel
	 */
	public void unSuscribeToAChannel(Suscriber suscriber, Channel channel);
	
	public List<Suscriber> selectAllSuscriber();
	public Suscriber selectSuscriberById(long id);
}
