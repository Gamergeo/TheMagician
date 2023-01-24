package com.project.magician.business;

import com.project.magician.model.CodeObject;

/**
 * Interface for named service (name is unic and not null)
 */
public interface CodeDatabaseService<T extends CodeObject> extends DatabaseService<T> {

	public T findByCode(String code);

	/**
	 * We need to find if type exist
	 */
    public void saveOrUpdate(T type);
}