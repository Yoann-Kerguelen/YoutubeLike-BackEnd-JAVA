package fr.yo.youtube.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * classe servant � r�cup�rer les services pour l'ihm
 **/

@Component
public class DAOManager {

	@Autowired
	CategoryManager categoryManager;

}
