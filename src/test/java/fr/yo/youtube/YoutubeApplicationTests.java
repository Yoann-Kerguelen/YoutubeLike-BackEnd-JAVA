package fr.yo.youtube;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.yo.youtube.bll.DAOManager;

@SpringBootTest
class YoutubeApplicationTests {

	@Autowired
	DAOManager daoManager;

	@Test
	void contextLoads() {
		System.out.println(daoManager.getYoutuberManager().getAllYoutuber().size());
		daoManager.getYoutuberManager().deleteYoutuber(1);
		System.out.println(daoManager.getYoutuberManager().getAllYoutuber().size());

		System.out.println(daoManager.getVideoManager().getAllVideo().size());
		daoManager.getVideoManager().deleteVideo(1);
		System.out.println(daoManager.getVideoManager().getAllVideo().size());
	}

}
