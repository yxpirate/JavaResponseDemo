package com.service.enumerate;

public enum ResponseStateEnum {
	
	SUCCESS("success"),
	ERROR("error");
	
	ResponseStateEnum(String state){
		this.state = state;
	}
	
	private String state;

	public String getState() {
		return state;
	}

}
