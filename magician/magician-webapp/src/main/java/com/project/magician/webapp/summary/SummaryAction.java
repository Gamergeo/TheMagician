package com.project.magician.webapp.summary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.magician.webapp.AbstractAction;

/**
 * General action (header, menu,...)
 */
@RequestMapping("summary")
@Controller
public class SummaryAction extends AbstractAction {
	
	@PostMapping("view")
	public ModelAndView view() {
		return new ModelAndView("summary/summaryView");
	}
}
