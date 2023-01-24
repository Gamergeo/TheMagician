package com.project.magician.persistance;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.project.magician.model.CodeObject;
import com.project.magician.model.DatabaseName;

/**
 * Generic class for named Object
 */
public abstract class AbstractCodeDAO<T extends CodeObject> extends AbstractDAO<T> implements CodeDao<T>{

	public AbstractCodeDAO() {
		super();
	}
	
	@Override
	public T findByCode(String code) {
		CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(typeParameterClass);
		Root<T> root = query.from(typeParameterClass);
		query.select(root);
		
		Set<Predicate> restrictions = new HashSet<Predicate>();
		restrictions.add(builder.equal(root.get(DatabaseName.CODE), code));
		
		query.where(getPredicateArray(restrictions));
		
		try {
			return getCurrentSession().createQuery(query).getSingleResult();
		} catch (NoResultException exception) {
			return null;
		}
	}
	
}
