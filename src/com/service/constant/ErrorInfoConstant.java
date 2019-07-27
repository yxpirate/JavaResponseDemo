package com.service.constant;

import com.service.entities.ErrorEntity;

public interface ErrorInfoConstant {
	
//    private static ErrorEntity getErrorEntity(String errorCode, String errorInfo){
//		ErrorEntity ee = new ErrorEntity();
//		ee.setErrorCode(errorCode);
//		ee.setErrorInfo(errorInfo);
//		return ee;
//	}
	
//	final static ErrorEntity DATA_NOT_FOUND = ErrorInfoConstant.getErrorEntity("001", "δ�ҵ�������");
	
	final static ErrorEntity UNKNOWN_SERVICE = new ErrorEntity("002", "服务器异常");
	
	final static ErrorEntity ILLEGAL_PARAM = new ErrorEntity("003", "参数不合法");

}
