package com.scholanova.groupe2.libraryproject.services.dao.impl;

import java.util.Collection;

import com.scholanova.groupe2.libraryproject.entities.Stock;
import com.scholanova.groupe2.libraryproject.services.StockSrv;

public class StockSrvImpl extends AbstractEntityServiceImpl<Stock> implements StockSrv {
	
	public Stock get(Long id) {
		return get(id, Stock.class);
	}

	public Collection<Stock> getByFields(String attributName, Object... values) {
		return null;
	}

	public Collection<Stock> getAll() {
		return getAll(Stock.class);
	}

}
