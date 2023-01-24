package com.project.magician.webapp.summary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.magician.business.card.CardService;
import com.project.magician.model.card.Card;
import com.project.magician.webapp.AbstractAction;

/**
 * General action (header, menu,...)
 */
@RequestMapping("summary")
@Controller
public class SummaryAction extends AbstractAction {
	
	@Autowired
	private CardService cardService;
	
	@PostMapping("view")
	public ModelAndView view() {
		List<Card> cards = cardService.findAll();
		
		return new ModelAndView("summary/summaryView").addObject("card", cards.get(0));
	}
}
