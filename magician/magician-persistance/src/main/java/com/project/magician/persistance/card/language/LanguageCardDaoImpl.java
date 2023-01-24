package com.project.magician.persistance.card.language;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.language.LanguageCard;
import com.project.magician.persistance.AbstractDAO;

@Repository("languageCardDao")
public class LanguageCardDaoImpl extends AbstractDAO<LanguageCard> implements LanguageCardDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = LanguageCard.class;
	}
}
