package com.service;

import com.service.controller.TestController001;
import com.service.exception.ServiceException;

public class MainTest {
	public static void main(String args[]) throws ServiceException { 
        System.out.println("Hello World!"); 
        TestController001 tc001 = new TestController001();
        tc001.saveData();
        System.out.println("-------------------001 done");
        tc001.checkData();
        System.out.println("-------------------002 done");
        tc001.getData();
        System.out.println("-------------------003 done");
        tc001.updateData(2);
        System.out.println("-------------------004_01 done");
        tc001.updateData(5);
        System.out.println("-------------------004_02 done");
        tc001.updateData(7);
        System.out.println("-------------------004_03 done");
    }
}
