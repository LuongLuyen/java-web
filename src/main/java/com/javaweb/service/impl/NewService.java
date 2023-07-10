package com.javaweb.service.impl;

import java.util.List;
import javax.inject.Inject;

import com.javaweb.dao.INewDAO;
import com.javaweb.model.NewModel;
import com.javaweb.service.INewService;

public class NewService implements INewService {
	
	@Inject
	private INewDAO newDao;

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		return newDao.findByCategoryId(categoryId);
	}

}
