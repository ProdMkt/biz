package com.biz.data.rest.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generic Service Response. All Service responses are required to
 * extend this class
 * @author ankit.verma
 *
 */

@XmlRootElement
public abstract class ServiceResponse<T extends Object> implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * Response Status.
     */
    private ResponseStatus responseStatus;
    
    /**
     * Returns Response Status holding status code and message.
     */
    public ResponseStatus getResponseStatus() {
    	return responseStatus;
    }
    
    /**
     * Set Response Status.
     * 
     * @param responseStatus
     */
    public void setResponseStatus (final ResponseStatus responseStatus) {
    	this.responseStatus = responseStatus;
    }

	/**
	 * @return the data
	 */
	public abstract T getData();
	
	/**
	 * @param data the data to set
	 */
	public abstract void setData(T data);
}