package com.project.magician.persistance.card.infos;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.infos.CardRarity;
import com.project.magician.persistance.AbstractCodeDAO;

@Repository("cardRarityDao")
public class CardRarityDaoImpl extends AbstractCodeDAO<CardRarity> implements CardRarityDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = CardRarity.class;
	}
}
