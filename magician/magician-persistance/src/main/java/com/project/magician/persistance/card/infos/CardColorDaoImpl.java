package com.project.magician.persistance.card.infos;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.infos.CardColor;
import com.project.magician.persistance.AbstractCodeDAO;

@Repository("cardColorDao")
public class CardColorDaoImpl extends AbstractCodeDAO<CardColor> implements CardColorDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = CardColor.class;
	}
}
