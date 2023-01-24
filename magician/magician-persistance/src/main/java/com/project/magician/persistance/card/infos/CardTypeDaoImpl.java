package com.project.magician.persistance.card.infos;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.infos.CardType;
import com.project.magician.persistance.AbstractCodeDAO;

@Repository("cardTypeDao")
public class CardTypeDaoImpl extends AbstractCodeDAO<CardType> implements CardTypeDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = CardType.class;
	}
}
