package com.project.magician.business.card.expansion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractDatabaseService;
import com.project.magician.model.card.expansion.ExpansionCard;
import com.project.magician.persistance.card.expansion.ExpansionCardDao;

@Service("expansionCardService")
public class ExpansionCardServiceImpl extends AbstractDatabaseService<ExpansionCard> implements ExpansionCardService {

	@Autowired
	ExpansionCardDao expansionCardDao;

	@Override
	public ExpansionCardDao getDao() {
		return expansionCardDao;
	}

}