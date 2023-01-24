package com.project.magician.persistance.card;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.Card;
import com.project.magician.persistance.AbstractDAO;

@Repository("cardDao")
public class CardDaoImpl extends AbstractDAO<Card> implements CardDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = Card.class;
	}
}
