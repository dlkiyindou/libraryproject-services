package com.scholanova.groupe2.libraryproject.services.dao.impl;

import java.util.Collection;

import com.scholanova.groupe2.libraryproject.entities.Book;
import com.scholanova.groupe2.libraryproject.services.BookSrv;

public class BookSrvImpl extends AbstractEntityServiceImpl<Book> implements BookSrv {
	
	public Book get(Long id) {
		return get(id, Book.class);
	}

	public Collection<Book> getByFields(String attributName, Object... values) {
		return null;
	}

	public Collection<Book> getAll() {
		return getAll(Book.class);
	}

}