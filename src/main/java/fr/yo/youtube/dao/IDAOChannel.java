package fr.yo.youtube.dao;

import java.util.List;

import fr.yo.youtube.entities.Channel;

//TODO ajouter les crud de base que l'on a besoins -> classe servant à l'impl de la dao

public interface IDAOChannel {

	/**
	 * get a channel by id
	 */
	public Channel getChannelByID(long pk);

	/**
	 * get all channels
	 */
	public List<Channel> getAllChannel();

	/**
	 * update a channel
	 */
	public void updateChannel(Channel channel);
}
