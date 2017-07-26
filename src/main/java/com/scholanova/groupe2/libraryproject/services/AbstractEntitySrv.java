package com.scholanova.groupe2.libraryproject.services;

import java.util.Collection;

import com.scholanova.groupe2.libraryproject.entities.AbstractEntity;

public interface AbstractEntitySrv <T extends AbstractEntity> {
	/**
	 * 
	 * @param id
	 * @return
	 */
	public T get(Long id);
	
	/**
	 * 
	 * @param attributName
	 * @param values
	 * @return
	 */
	public Collection<T> getByFields (String attributName, Object ... values);
	
	/**
	 * 
	 * @return
	 */
	public Collection<T> getAll();
}



