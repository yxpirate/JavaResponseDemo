package com.service.entities;

public class ErrorEntity {
	private String errorCode = null;
	private String errorInfo = null;
	
	public ErrorEntity(){
		
	}
	
	public ErrorEntity(String errorCode, String errorInfo){
		this.errorCode = errorCode;
		this.errorInfo = errorInfo;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	
	public String toString(){
		return  "ErrorEntity ==> " + "\n" +
				"errorCode : "+ this.getErrorCode() + "\n" +
				"errorInfo : " + this.getErrorInfo();
	}
	

}
