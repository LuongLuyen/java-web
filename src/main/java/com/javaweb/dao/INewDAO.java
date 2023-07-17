package com.javaweb.dao;

import java.util.List;

import com.javaweb.model.NewModel;
import com.javaweb.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {
	NewModel findOne(Long id);
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);
	void update(NewModel updateNew);
	void delete(long id);
	List<NewModel>findlAll(Pageble pageble);
	int getTotalItem();
}
