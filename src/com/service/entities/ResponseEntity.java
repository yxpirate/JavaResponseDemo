package com.service.entities;

import com.service.enumerate.ResponseStateEnum;

public class ResponseEntity {
	
//	public enum States 
//	{
//		success,
//		error;
//	};
	
	private String state = ResponseStateEnum.SUCCESS.getState();

	private ErrorEntity error = null;
	
	private Object result = null;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ErrorEntity getError() {
		return error;
	}

	public void setError(ErrorEntity error) {
		this.error = error;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	
	public String toString(){
		return  "ResponseEntity ==> "+ "\n" + 
				"state : " + this.getState() + "\n" +
				"error : " + this.getError() + "\n" +
				"result : " + this.getResult();
	}

}
