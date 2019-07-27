package com.service.service;

import com.service.entities.PaginationEntity;
import com.service.entities.ResponseEntity;
import com.service.entities.StudentEntity;
import com.service.exception.ServiceException;

public interface TestService001 {
	
	public PaginationEntity<StudentEntity> getData(int pageSize, int pageNum);
	
	public StudentEntity updateData(int id) throws ServiceException;

}
