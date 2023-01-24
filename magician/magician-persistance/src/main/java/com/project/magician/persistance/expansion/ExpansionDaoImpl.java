package com.project.magician.persistance.expansion;

import org.springframework.stereotype.Repository;

import com.project.magician.model.expansion.Expansion;
import com.project.magician.persistance.AbstractDAO;

@Repository("expansionDao")
public class ExpansionDaoImpl extends AbstractDAO<Expansion> implements ExpansionDao {

	@Override
	protected void setTypeParameterClass() {
		typeParameterClass = Expansion.class;
	}
}
