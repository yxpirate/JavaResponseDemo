package com.service.entities;

import java.util.List;

public class PaginationEntity<T> {
	// 数据总数
	private Integer dataCount = 0;
	// 页码总数
	private Integer pageCount = 0;
	// 数据
	private List<T> data = null;
	
	public Integer getDataCount() {
		return dataCount;
	}
	public void setDataCount(Integer dataCount) {
		this.dataCount = dataCount;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
	public String toString(){
		return "PaginationEntity ==> " + "\n" +
				"dataCount : " + this.getDataCount() +"\n" +
				"pageCount : " + this.getPageCount() + "\n" +
				"data : " + this.getData();
	}
	

}
