package com.javaweb.dao.impl;

import java.util.List;

import com.javaweb.dao.INewDAO;
import com.javaweb.mapper.NewMapper;
import com.javaweb.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}
	
}
