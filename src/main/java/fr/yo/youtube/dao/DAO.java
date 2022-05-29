package fr.yo.youtube.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//TODO ajouter les nouveaux services utilisants les repos ici

@Component
public class DAO {

	@Autowired
	@Qualifier("YoutuberHibernate")
	private IDAOYoutuber daoYoutuber;

	@Autowired
	@Qualifier("ChannelHibernate")
	private IDAOChannel daoChannel;

	@Autowired
	@Qualifier("VideoHibernate")
	private IDAOVideo daoVideo;

	@Autowired
	@Qualifier("CategoryHibernate")
	private IDAOCategory daoCategory;

	@Autowired
	@Qualifier("ReviewsHibernate")
	private IDAOReviews daoReviews;

	@Autowired
	@Qualifier("SuscriberHibernate")
	private IDAOSuscriber daoSuscriber;

	public IDAOYoutuber getDAOYoutuber() {
		return daoYoutuber;
	}

	public IDAOChannel getDAOChannel() {
		return daoChannel;
	}

	public IDAOVideo getDAOVideo() {
		return daoVideo;
	}

	public IDAOCategory getDAOCategory() {
		return daoCategory;
	}

	public IDAOReviews getDAOReviews() {
		return daoReviews;
	}

	public IDAOSuscriber getDAOSuscriber() {
		return daoSuscriber;
	}
}
