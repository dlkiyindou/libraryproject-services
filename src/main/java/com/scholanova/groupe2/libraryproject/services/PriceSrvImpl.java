package com.scholanova.groupe2.libraryproject.services;

import java.util.Collection;

import com.scholanova.groupe2.libraryproject.entities.Price;

public class PriceSrvImpl extends GenericEntityServiceImp<Price> implements PriceSrv {
	
	public Price get(Long id) {
		return get(id, Price.class);
	}

	public Collection<Price> getByFields(String attributName, Object... values) {
		return null;
	}

	public Collection<Price> getAll() {
		return getAll(Price.class);
	}

}
