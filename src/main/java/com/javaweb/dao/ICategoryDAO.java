package com.javaweb.dao;

import java.util.List;

import com.javaweb.model.CategoryModel;

public interface ICategoryDAO {
	List<CategoryModel> findAll();

}
