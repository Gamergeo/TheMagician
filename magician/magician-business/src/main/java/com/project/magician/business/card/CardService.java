package com.project.magician.business.card;

import org.springframework.stereotype.Service;

import com.project.magician.business.DatabaseService;
import com.project.magician.model.card.Card;

@Service
public interface CardService extends DatabaseService<Card> {
	
}

