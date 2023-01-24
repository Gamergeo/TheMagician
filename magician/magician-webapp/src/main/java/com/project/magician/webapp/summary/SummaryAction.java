package com.project.magician.webapp.summary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.magician.business.card.infos.CardInfosService;
import com.project.magician.webapp.AbstractAction;

/**
 * General action (header, menu,...)
 */
@RequestMapping("summary")
@Controller
public class SummaryAction extends AbstractAction {
	
	@Autowired
	private CardInfosService cardInfosService;
	
	@PostMapping("view")
	public ModelAndView view() {
//		cardInfosService.createTestCard();
//		cardInfosService.updateTestCard();
		
		return new ModelAndView("summary/summaryView");
	}
}
