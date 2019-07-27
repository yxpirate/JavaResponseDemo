package com.service.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.service.common.BaseServiceImpl;
import com.service.constant.ErrorInfoConstant;
import com.service.entities.PaginationEntity;
import com.service.entities.StudentEntity;
import com.service.exception.ServiceException;
import com.service.service.TestService001;

public class TestService001Impl extends BaseServiceImpl implements TestService001 {

	/**
	 * 
	 */
	public PaginationEntity<StudentEntity> getData(int pageSize, int pageNum) {
		List<StudentEntity> listResult = new ArrayList<StudentEntity>();
		int dataCount = 0;
		for(int i = 5;i < 8;i ++){
			StudentEntity st = new StudentEntity();
			st.setId(String.valueOf(i));
			st.setName("abcd" + i);
			st.setAge(i + 20);
			listResult.add(st);
			dataCount ++;
		}
		int remainder = dataCount % pageSize;
		int pageCount = (remainder == 0 ? (dataCount / pageSize) : ((dataCount / pageSize) + 1));
		return getPagination(dataCount, pageCount, listResult);
	}
	/**
	 * 
	 */
	public StudentEntity updateData(int id) throws ServiceException {
		if (id < 5) {
			StudentEntity st = new StudentEntity();
			st.setId(String.valueOf(id));
			st.setName("updateData" + id);
			st.setAge(id + 20);
			return st;
		} else if (id == 5) {
			throw new ServiceException(ErrorInfoConstant.UNKNOWN_SERVICE);
		} else {
			throw new ServiceException(ErrorInfoConstant.ILLEGAL_PARAM, "id参数异常");
		}
	}

}
