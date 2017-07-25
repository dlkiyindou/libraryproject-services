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
	 * @param KeyName
	 * @param values
	 * @return
	 */
	public Collection<T> getByFields (String KeyName, Object ... values);
	
	/**
	 * 
	 * @return
	 */
	public Collection<T> getAll();
}
