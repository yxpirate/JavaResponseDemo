package com.service.controller;

import java.util.ArrayList;
import java.util.List;

import com.service.common.BaseController;
import com.service.constant.ErrorInfoConstant;
import com.service.entities.PaginationEntity;
import com.service.entities.ResponseEntity;
import com.service.entities.StudentEntity;
import com.service.exception.ServiceException;
import com.service.service.TestService001;
import com.service.service.impl.TestService001Impl;

public class TestController001 extends BaseController {
	/**
	 * 
	 */
	public ResponseEntity saveData(){
		System.out.println(getErrorResponse(ErrorInfoConstant.UNKNOWN_SERVICE).toString());
		return getErrorResponse(ErrorInfoConstant.UNKNOWN_SERVICE);
	}
	/**
	 * 
	 */
	public ResponseEntity checkData(){
		List<StudentEntity> listResult = new ArrayList<StudentEntity>();
		for(int i = 0;i < 3;i ++){
			StudentEntity st = new StudentEntity();
			st.setId(String.valueOf(i));
			st.setName("abc" + i);
			st.setAge(i + 10);
			listResult.add(st);
		}
		System.out.println(getSuccessResponse(listResult).toString());
		return getSuccessResponse(listResult);
	}
	/**
	 * 
	 */
	public ResponseEntity getData(){
		TestService001 ts001Impl = new TestService001Impl();
		PaginationEntity<StudentEntity> result = ts001Impl.getData(10, 0);
		System.out.println(getSuccessResponse(result).toString());
		return getSuccessResponse(result);
	}
	/**
	 * 
	 */
	public ResponseEntity updateData(int id) throws ServiceException{
		try {
			TestService001 ts001Impl = new TestService001Impl();
			StudentEntity se = ts001Impl.updateData(id);
			System.out.println(getSuccessResponse(se).toString());
			return getSuccessResponse(se);
		} catch (ServiceException e) {
			System.out.println(getErrorResponse(e).toString());
			return getErrorResponse(e);
		}
		
	}
}
