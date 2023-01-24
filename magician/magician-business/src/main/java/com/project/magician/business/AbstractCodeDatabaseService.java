package com.project.magician.business;

import javax.transaction.Transactional;

import com.project.magician.model.CodeObject;
import com.project.magician.persistance.CodeDao;

public abstract class AbstractCodeDatabaseService<T extends CodeObject> extends AbstractDatabaseService<T> implements CodeDatabaseService<T> {
	
	public abstract CodeDao<T> getDao();

	@Transactional
	public T findByCode(String code) {
		return getDao().findByCode(code);
	}
	
	@Override
	@Transactional
    public void saveOrUpdate(T type) {
		
		// Code unicity verifying
		T findType = findByCode(type.getCode());
		
		if (findType != null) {
			type.setId(findType.getId());
			getDao().merge(type);
		} else {
	    	getDao().saveOrUpdate(type);
		}
		
		
    }
}