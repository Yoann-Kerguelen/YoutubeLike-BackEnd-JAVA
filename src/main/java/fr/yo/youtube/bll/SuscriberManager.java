package fr.yo.youtube.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.yo.youtube.dao.DAO;

/**
 * Classe servant à faire les functions de suscriber pour l'ihm
 **/

@Service
public class SuscriberManager {

	@Autowired
	DAO dao;
}
