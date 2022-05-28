package fr.yo.youtube.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//TODO ajouter les nouveaux services utilisants les repos ici

@Component
public class DAO {

	@Autowired
	@Qualifier("CategoryHibernate")
	private IDAOCategory daoCategory;

	public IDAOCategory getDAOCategory() {
		return daoCategory;
	}

}
