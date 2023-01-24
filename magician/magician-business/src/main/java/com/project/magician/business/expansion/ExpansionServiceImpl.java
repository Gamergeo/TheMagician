package com.project.magician.business.expansion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.magician.business.AbstractDatabaseService;
import com.project.magician.model.expansion.Expansion;
import com.project.magician.persistance.expansion.ExpansionDao;

@Service("expansionService")
public class ExpansionServiceImpl extends AbstractDatabaseService<Expansion> implements ExpansionService {

	@Autowired
	ExpansionDao expansionDao;

	@Override
	public ExpansionDao getDao() {
		return expansionDao;
	}

}