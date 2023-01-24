package com.project.magician.business.card.infos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractCodeDatabaseService;
import com.project.magician.model.card.infos.CardRarity;
import com.project.magician.persistance.card.infos.CardRarityDao;

@Service("cardRarityService")
public class CardRarityServiceImpl extends AbstractCodeDatabaseService<CardRarity> implements CardRarityService {

	@Autowired
	CardRarityDao cardRarityDao;

	@Override
	public CardRarityDao getDao() {
		return cardRarityDao;
	}

}