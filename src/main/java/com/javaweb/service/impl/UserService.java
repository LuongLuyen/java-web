package com.javaweb.service.impl;

import com.javaweb.dao.IUserDAO;
import com.javaweb.dao.impl.UserDAO;
import com.javaweb.model.UserModel;
import com.javaweb.service.IUserService;

public class UserService implements IUserService {

	private IUserDAO userDAO;

	public UserService() {
		userDAO = new UserDAO();
	}
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}
	
}
