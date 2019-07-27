package com.service.exception;

import com.service.constant.ErrorInfoConstant;
import com.service.entities.ErrorEntity;

public class ServiceException extends Exception {
	
	private static final long serialVersionUID = 407321754002913507L;
	
	private ErrorEntity errorEntity = ErrorInfoConstant.UNKNOWN_SERVICE;
	
	public ServiceException(ErrorEntity e){
		this.errorEntity = e;
	}
	
    public ServiceException(ErrorEntity e, String newErrorInfo){
    	this.errorEntity = getErrorEntity(e, newErrorInfo);
	}

    public ErrorEntity getErrorEntity(ErrorEntity e, String newErrorInfo) {
    	ErrorEntity ee = new ErrorEntity();
    	ee.setErrorCode(e.getErrorCode());
    	ee.setErrorInfo(newErrorInfo);
    	return ee;
	}
    
	public ErrorEntity getErrorEntity() {
		return errorEntity;
	}

	public void setErrorEntity(ErrorEntity errorEntity) {
		this.errorEntity = errorEntity;
	}

}
