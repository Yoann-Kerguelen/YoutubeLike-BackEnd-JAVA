package fr.yo.youtube.ihm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.yo.youtube.bll.DAOManager;
import fr.yo.youtube.entities.Youtuber;
import fr.yo.youtube.utils.AuthHelper;

@Controller
public class MainController {

	@Autowired
	private DAOManager dAOManager;

	@Autowired
	private AuthHelper authHelper;

	@GetMapping(value = "")
	public String getPageIndex(Model model, HttpServletRequest request) {
		Youtuber currentYoutuber = authHelper.getAuth(request);

		model.addAttribute("categoryList", dAOManager.getCategoryManager().getAllCategory());

		model.addAttribute("videoList", dAOManager.getVideoManager().getAllVideo());

		model.addAttribute("currentYoutuber", currentYoutuber);

		return "index";
	}

}
