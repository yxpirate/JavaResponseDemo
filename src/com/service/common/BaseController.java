package com.service.common;

import com.service.entities.ErrorEntity;
import com.service.entities.ResponseEntity;
import com.service.enumerate.ResponseStateEnum;
import com.service.exception.ServiceException;

public abstract class BaseController {
	
	public ResponseEntity getSuccessResponse(Object resultList){
		ResponseEntity re = new ResponseEntity();
		re.setState(ResponseStateEnum.SUCCESS.getState());
		re.setError(null);
		re.setResult(resultList);
		return re;
	}
	
	public ResponseEntity getErrorResponse(ErrorEntity ee){
		ResponseEntity re = new ResponseEntity();
		re.setState(ResponseStateEnum.ERROR.getState());
		re.setError(ee);
		re.setResult(null);
		return re;
	}
	
	public ResponseEntity getErrorResponse(ServiceException se){
		ResponseEntity re = new ResponseEntity();
		re.setState(ResponseStateEnum.ERROR.getState());
		re.setError(se.getErrorEntity());
		re.setResult(null);
		return re;
	}

}
