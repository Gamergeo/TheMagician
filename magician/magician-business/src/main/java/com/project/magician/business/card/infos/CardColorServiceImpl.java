package com.project.magician.business.card.infos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractCodeDatabaseService;
import com.project.magician.model.card.infos.CardColor;
import com.project.magician.persistance.card.infos.CardColorDao;

@Service("cardColorService")
public class CardColorServiceImpl extends AbstractCodeDatabaseService<CardColor> implements CardColorService {

	@Autowired
	CardColorDao cardColorDao;

	@Override
	public CardColorDao getDao() {
		return cardColorDao;
	}

}