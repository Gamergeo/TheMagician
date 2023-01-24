package com.project.magician.business.card.infos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractCodeDatabaseService;
import com.project.magician.model.card.infos.CardType;
import com.project.magician.persistance.card.infos.CardTypeDao;

@Service("cardTypeService")
public class CardTypeServiceImpl extends AbstractCodeDatabaseService<CardType> implements CardTypeService {

	@Autowired
	CardTypeDao cardTypeDao;

	public CardTypeDao getDao() {
		return cardTypeDao;
	}

}