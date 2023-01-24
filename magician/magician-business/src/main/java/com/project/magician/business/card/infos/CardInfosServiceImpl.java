package com.project.magician.business.card.infos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractDatabaseService;
import com.project.magician.model.card.infos.CardInfos;
import com.project.magician.persistance.card.infos.CardInfosDao;

@Service("cardInfosService")
public class CardInfosServiceImpl extends AbstractDatabaseService<CardInfos> implements CardInfosService {

	@Autowired
	CardInfosDao cardInfosDao;

	@Override
	public CardInfosDao getDao() {
		return cardInfosDao;
	}

}