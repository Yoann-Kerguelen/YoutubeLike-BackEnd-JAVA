package ihm;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.yo.youtube.bll.DAOManager;
import fr.yo.youtube.bll.utils.VideoFormDataContainer;
import fr.yo.youtube.entities.Reviews;
import fr.yo.youtube.entities.Video;

@Controller
public class YoutubeController {
	
	@Autowired
	private DAOManager daoManager;

//	@Autowired
//	private AuthHelper authHelper;

	/**
	 * Show all video controller entry
	 * 
	 * @return
	 */
	@GetMapping(value = "")
	public String showVideoList(Model model) {

		// get data from BLL
		// put to model
		model.addAttribute("videoList", daoManager.getVideoManager().getAllVideo());

		// return view
		return "videos/video-catalog";
	}

	/**
	 * @return
	 */
	@GetMapping(value = "/video/{id}")
	public String showOneVideo(Model model, @PathVariable long pk, HttpServletRequest request) {

		// get data from dao
		Video video = daoManager.getVideoManager().getVideo(pk);

		// put to model
		model.addAttribute("video", video);

		// Add default empty reviews object
		model.addAttribute("reviews", new Reviews());

		// return view
		return "videos/page-video";
	}

	/**
	 * Show add form model
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping(value = { "/createVideo", "/createVideo/{id}" })
	public String showCreateVideoPage(Model model, @PathVariable("id") Optional<Integer> id) {

		// Form setting
		VideoFormDataContainer videoFormSetting = daoManager.getVideoManager().getVideoFormSetting();

		model.addAttribute("videoFormSetting", videoFormSetting);

		// Video object
		Video video = new Video();

		if (id.isPresent()) {
			video = daoManager.getVideoManager().getVideo(id.orElse(0));
		}

		model.addAttribute("video", video);

		return "videos/add-video";
	}

	/**
	 * Post add form model
	 * 
	 * @param model
	 * @param personForm
	 * @return
	 */
	@PostMapping(value = "/createVideo")
	public String saveVideo(Model model, @ModelAttribute("video") Video video) {

		// Surface control
		if (true) {
			// dao add video
			daoManager.getVideoManager().createVideo(video);

			// return to route
			return "redirect:/";
		}

		return "videos/create-video";
	}

	/**
	 * Post add form model
	 * 
	 * @param model
	 * @param personForm
	 * @return
	 */
//	@PostMapping(value = "/addReviews/{id}")
//	public String saveReviews(Model model, HttpServletRequest request, @PathVariable long id,
//			@ModelAttribute("reviews") Reviews reviews) {
//
//		// Récupérer user connecté (null si pas connecté, sinon bon)
//		Suscriber connectedUser = authHelper.getAuth(request);
//
//		// SI CONNECTE
//		if (connectedUser != null) {
//			// get video
//			Video video = daoManager.getVideoManager().getVideo(pk);
//
//			// hydrate
//			reviews.setId(-1L);
//			reviews.setUser(connectedUser);
//
//			// dao add reviews
//			daoManager.getVideoManager().addReviews(video, reviews);
//
//			// return to video
//			return "redirect:/video/" + id;
//		}
//		// SI PAS CONNECTE -> Redirect sur l'accueil
//		return "redirect:/";
//	}
}
