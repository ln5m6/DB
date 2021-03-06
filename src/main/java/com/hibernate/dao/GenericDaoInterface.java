package com.hibernate.dao;

import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public interface GenericDaoInterface<T, Id extends Serializable> {

	public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public List<T> findAll();
	
	public void deleteAll();

	public Session openCurrentSession();

	public Session openCurrentSessionwithTransaction();

	public void closeCurrentSession();

	public void closeCurrentSessionwithTransaction();
	
}
