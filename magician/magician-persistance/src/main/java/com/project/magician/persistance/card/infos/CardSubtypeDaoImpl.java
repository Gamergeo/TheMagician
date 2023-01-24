package com.project.magician.persistance.card.infos;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.infos.CardSubtype;
import com.project.magician.persistance.AbstractCodeDAO;

@Repository("cardSubtypeDao")
public class CardSubtypeDaoImpl extends AbstractCodeDAO<CardSubtype> implements CardSubtypeDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = CardSubtype.class;
	}
}
