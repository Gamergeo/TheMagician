package com.project.magician.persistance;

import java.util.List;

import com.project.magician.model.ModelObject;

public interface IDao<T extends ModelObject> {

	public void persist(T type);
    
    public void update(T type);   
    
    public void saveOrUpdate(T type);

    public T findById(Integer id);
 
    public void delete(T type);

	public List<T> findAll();
	
	public void delete(Integer id);

	public List<T> findAllOrderedBy(String attributeName);

	void merge(T type);
}
