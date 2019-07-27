package com.service.common;

import java.util.List;

import com.service.entities.PaginationEntity;

public abstract class BaseServiceImpl<T> {

	public PaginationEntity<T> getPagination(Integer dataCount, Integer pageCount, List<T> data){
		PaginationEntity<T> pe = new PaginationEntity<T>();
		pe.setDataCount(dataCount);
		pe.setPageCount(pageCount);
		pe.setData(data);
		return pe;
	}
}
