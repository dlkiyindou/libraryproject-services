package com.scholanova.groupe2.libraryproject.services.dao.impl;

import java.util.Collection;

import com.scholanova.groupe2.libraryproject.entities.Price;
import com.scholanova.groupe2.libraryproject.services.PriceSrv;

public class PriceSrvImpl extends AbstractEntityServiceImpl<Price> implements PriceSrv {
	
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
