package com.project.magician.business.card.infos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractCodeDatabaseService;
import com.project.magician.model.card.infos.CardSupertype;
import com.project.magician.persistance.card.infos.CardSupertypeDao;

@Service("cardSupertypeService")
public class CardSupertypeServiceImpl extends AbstractCodeDatabaseService<CardSupertype> implements CardSupertypeService {

	@Autowired
	CardSupertypeDao cardSupertypeDao;

	@Override
	public CardSupertypeDao getDao() {
		return cardSupertypeDao;
	}

}