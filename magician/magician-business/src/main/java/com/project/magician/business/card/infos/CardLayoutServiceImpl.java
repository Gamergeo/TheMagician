package com.project.magician.business.card.infos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractCodeDatabaseService;
import com.project.magician.model.card.infos.CardLayout;
import com.project.magician.persistance.card.infos.CardLayoutDao;

@Service("cardLayoutService")
public class CardLayoutServiceImpl extends AbstractCodeDatabaseService<CardLayout> implements CardLayoutService {

	@Autowired
	CardLayoutDao cardLayoutDao;

	@Override
	public CardLayoutDao getDao() {
		return cardLayoutDao;
	}

	@Override
	public CardLayout createLayout(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}