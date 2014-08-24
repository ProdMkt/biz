package com.biz.delegate;

import org.springframework.beans.factory.annotation.Autowired;

import com.biz.data.BizOperation;
import com.biz.util.ResourceReader;

public abstract class BaseDelegate {

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
	 * Abstract method to be implemented by various Delegates's depending upon the action
	 * they perform.
	 * @param operation
	 * @param argument
	 * @return
	 */
	public abstract Object handleService(BizOperation operation, Object argument);
}
