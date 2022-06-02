package fr.yo.youtube;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.yo.youtube.bll.DAOManager;
import fr.yo.youtube.entities.Reviews;
import fr.yo.youtube.entities.Video;

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

		daoManager.getVideoManager().addReviews(new Reviews(null, 0, null, null, null),
				new Video(null, 0, null, null, 0, 0, 0, null, null, null, null));
	}

}
