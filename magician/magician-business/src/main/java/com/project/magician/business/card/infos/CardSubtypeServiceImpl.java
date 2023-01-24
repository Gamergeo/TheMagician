package com.project.magician.business.card.infos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractCodeDatabaseService;
import com.project.magician.model.card.infos.CardSubtype;
import com.project.magician.persistance.card.infos.CardSubtypeDao;

@Service("cardSubtypeService")
public class CardSubtypeServiceImpl extends AbstractCodeDatabaseService<CardSubtype> implements CardSubtypeService {

	@Autowired
	CardSubtypeDao cardSubtypeDao;

	@Override
	public CardSubtypeDao getDao() {
		return cardSubtypeDao;
	}

}