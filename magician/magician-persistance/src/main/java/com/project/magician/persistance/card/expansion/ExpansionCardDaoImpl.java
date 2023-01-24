package com.project.magician.persistance.card.expansion;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.expansion.ExpansionCard;
import com.project.magician.persistance.AbstractDAO;

@Repository("expansionCardDao")
public class ExpansionCardDaoImpl extends AbstractDAO<ExpansionCard> implements ExpansionCardDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = ExpansionCard.class;
	}
}
