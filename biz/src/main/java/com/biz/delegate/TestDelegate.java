package com.biz.delegate;

import com.biz.data.BizOperation;
import com.biz.data.rest.response.ServiceResponse;
import com.biz.data.rest.response.TestServiceResponse;


public class TestDelegate extends BaseDelegate<String> {

	/**
	 * Service business method.
	 */
	private ServiceResponse<String> test(ServiceResponse<String> response) {
		response.setData(getMessage("rest.hello"));
		return response;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public ServiceResponse<String> handleService(BizOperation operation, Object argument) {
		ServiceResponse<String> response = new TestServiceResponse();
		
		switch(operation){
		 case TEST_REST: 
			 return this.test(response);			 
		 default:
			 return this.returnInvalidOperation(response);
		}
	} 	
}
