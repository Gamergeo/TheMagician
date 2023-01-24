package com.project.magician.business.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractDatabaseService;
import com.project.magician.model.card.Card;
import com.project.magician.persistance.card.CardDao;

@Service("cardService")
public class CardServiceImpl extends AbstractDatabaseService<Card> implements CardService {

	@Autowired
	CardDao cardDao;

	@Override
	public CardDao getDao() {
		return cardDao;
	}

}