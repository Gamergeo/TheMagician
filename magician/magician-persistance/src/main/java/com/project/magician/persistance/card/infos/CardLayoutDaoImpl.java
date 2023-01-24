package com.project.magician.persistance.card.infos;

import org.springframework.stereotype.Repository;

import com.project.magician.model.card.infos.CardLayout;
import com.project.magician.persistance.AbstractCodeDAO;

@Repository("cardLayoutDao")
public class CardLayoutDaoImpl extends AbstractCodeDAO<CardLayout> implements CardLayoutDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = CardLayout.class;
	}
}
