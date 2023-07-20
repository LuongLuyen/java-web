package com.javaweb.service;

import java.util.List;

import com.javaweb.model.NewModel;
import com.javaweb.paging.Pageble;

public interface INewService {
	List<NewModel> findByCategoryId(Long categoryId);
	NewModel save(NewModel newModel);
	NewModel update(NewModel updateNew);
	void delete(long[] ids);
	List<NewModel> findlAll(Pageble pageble);
	int getTotalItem();
	NewModel findOne(long id);
}
