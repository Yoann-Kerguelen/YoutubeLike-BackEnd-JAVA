package fr.yo.youtube.bll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * classe servant à récupérer les services pour l'ihm
 **/

@Component
public class DAOManager {

	@Autowired
	private YoutuberManager youtuberManager;

	@Autowired
	private ChannelManager channelManager;

	@Autowired
	private VideoManager videoManager;

	@Autowired
	private CategoryManager categoryManager;

	@Autowired
	private SuscriberManager suscriberManager;

	public YoutuberManager getYoutuberManager() {
		return youtuberManager;
	}

	public ChannelManager getChannelManager() {
		return channelManager;
	}

	public VideoManager getVideoManager() {
		return videoManager;
	}

	public CategoryManager getCategoryManager() {
		return categoryManager;
	}

	public SuscriberManager getSuscriberManager() {
		return suscriberManager;
	}

}
