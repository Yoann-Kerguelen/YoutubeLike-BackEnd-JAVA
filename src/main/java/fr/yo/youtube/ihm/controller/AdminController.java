package fr.yo.youtube.ihm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	//@Autowired
	//private DAOManager dAOManager;

	@GetMapping(value = "/admin")
	public String getPageAdmin() {
		
		return "admin";
	}
}
