package com.scholanova.groupe2.libraryproject.services.dao.impl;

import java.util.Collection;

import com.scholanova.groupe2.libraryproject.entities.User;
import com.scholanova.groupe2.libraryproject.services.UserSrv;

public class UserSrvImpl extends AbstractEntityServiceImpl<User> implements UserSrv {
	public User get(Long id) {
		return get(id, User.class);
	}

	public Collection<User> getByFields(String attributName, Object... values) {
		return null;
	}

	public Collection<User> getAll() {
		return getAll(User.class);
	}

}
