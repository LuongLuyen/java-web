package com.javaweb.dao;

import java.util.List;

import com.javaweb.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();

}
