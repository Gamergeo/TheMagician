package com.project.magician.business;

import java.util.List;

import com.project.magician.model.ModelObject;

public interface DatabaseService<T extends ModelObject> {
	
    public void saveOrUpdate(T type);
    
    public T findById(Integer id);

    public void delete(T type);

    public List<T> findAll();
	
    public void delete(Integer id);

	public List<T> findAllOrderBy(String attributeName);

	void deleteIfPossible(Integer id);

	void merge(T type);
}