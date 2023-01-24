package com.project.magician.persistance;

import com.project.magician.model.CodeObject;

/**
 * Interface for named DAO (name is unic and not null)
 */
public interface CodeDao<T extends CodeObject> extends IDao<T>{

	T findByCode(String code);
}
