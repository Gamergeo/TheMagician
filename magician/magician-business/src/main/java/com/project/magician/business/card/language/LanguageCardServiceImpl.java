package com.project.magician.business.card.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractDatabaseService;
import com.project.magician.model.card.language.LanguageCard;
import com.project.magician.persistance.card.language.LanguageCardDao;

@Service("languageCardService")
public class LanguageCardServiceImpl extends AbstractDatabaseService<LanguageCard> implements LanguageCardService {

	@Autowired
	LanguageCardDao languageCardDao;

	@Override
	public LanguageCardDao getDao() {
		return languageCardDao;
	}

}