package com.scholanova.groupe2.libraryproject.services;

import java.util.Collection;

import com.scholanova.groupe2.libraryproject.entities.User;

public class UserSrvImpl extends GenericEntityServiceImp<User> implements UserSrv{

	public User get(Long id) {
		return get(id, User.class);
	}

	public Collection<User> getByFields(String KeyName, Object... values) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<User> getAll() {
		return getAll(User.class);
	}

}
