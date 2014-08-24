package com.biz.delegate;

import org.springframework.beans.factory.annotation.Autowired;

import com.biz.data.BizConstants;
import com.biz.data.BizOperation;
import com.biz.data.StatusCode;
import com.biz.data.rest.response.ResponseStatus;
import com.biz.data.rest.response.ServiceResponse;
import com.biz.util.ResourceReader;

public abstract class BaseDelegate<T extends Object> {

	@Autowired
	private ResourceReader resourceReader;
	
	/**
	 * Returns the message from the bundle for the given key
	 * @param key
	 * @return
	 */
	public String getMessage(String key){
		return resourceReader.getMessage(key);
	}
	
	/**
	 * Returns the message from the bundle for the given key with the given args
	 * @param key
	 * @return
	 */
	public String getMessage(String key, Object[] args){
		return resourceReader.getMessage(key, args);
	}
	
	/**
	 * Prepares Object for returning an Invalid Operation
	 * @param <T>
	 * @param response
	 * @return
	 */
	public ServiceResponse<T> returnInvalidOperation(ServiceResponse<T> response){
		return this.returnInvalidOperation(response, null);
	}
	
	/**
	 * Prepares Object for returning an Invalid Operation
	 * @param <T>
	 * @param response
	 * @param args
	 * @return
	 */
	public ServiceResponse<T> returnInvalidOperation(ServiceResponse<T> response, Object[] args){
		ResponseStatus status = new ResponseStatus(StatusCode.FAILURE, BizConstants.INVALID_OPERATION_MSG);
		response.setResponseStatus(status);
		return response;
	}
	
	/**
	 * Abstract method to be implemented by various Delegates's depending upon the action
	 * they perform.
	 * @param <T>
	 * @param operation
	 * @param argument
	 * @return
	 */
	public abstract ServiceResponse<T> handleService(BizOperation operation, Object argument);
}
