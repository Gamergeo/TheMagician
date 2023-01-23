package com.project.magician.webapp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.magician.webapp.AbstractAction;

/**
 * General action (header, menu,...)
 */
@RequestMapping("main")
@Controller
public class MainAction extends AbstractAction {
	
	@GetMapping("main")
	public ModelAndView main() {
		return new ModelAndView("main/main");
	}
	

}
