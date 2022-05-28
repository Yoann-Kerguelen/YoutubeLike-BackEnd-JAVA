package fr.yo.youtube.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * classe servant à récupérer les services pour l'ihm
 **/

@Component
public class DAOManager {

	@Autowired
	CategoryManager categoryManager;

}
