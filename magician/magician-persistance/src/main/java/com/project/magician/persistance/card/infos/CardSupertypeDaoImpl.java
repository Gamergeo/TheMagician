package com.project.magician.persistance.card.infos;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.infos.CardSupertype;
import com.project.magician.persistance.AbstractCodeDAO;

@Repository("cardSupertypeDao")
public class CardSupertypeDaoImpl extends AbstractCodeDAO<CardSupertype> implements CardSupertypeDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = CardSupertype.class;
	}
}
