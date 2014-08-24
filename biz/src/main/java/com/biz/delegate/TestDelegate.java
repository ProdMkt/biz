package com.biz.delegate;

import com.biz.data.BizOperation;
import com.biz.data.StatusCode;


public class TestDelegate extends BaseDelegate {

	private String test() {
		return com.biz.data.StatusCode.SUCCESS.toString();
	}
	
	@Override
	public Object handleService(BizOperation operation, Object argument) {
		switch(operation){
		 case TEST_REST: 
			 return this.test();			 
		 default:
			 return StatusCode.INVALID_OPERATION.toString();
		}
	} 	
}
