package com.project.magician.persistance.card.infos;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.infos.CardInfos;
import com.project.magician.persistance.AbstractDAO;

@Repository("cardInfosDao")
public class CardInfosDaoImpl extends AbstractDAO<CardInfos> implements CardInfosDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = CardInfos.class;
	}
}
