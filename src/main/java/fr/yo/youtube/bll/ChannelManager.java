package fr.yo.youtube.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;

/**
 * Classe servant à faire les functions de channel pour l'ihm
 **/

@Service
public class ChannelManager {

	@Autowired
	DAO dao;

}
