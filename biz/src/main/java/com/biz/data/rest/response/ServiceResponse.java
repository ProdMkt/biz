package com.biz.data.rest.response;

/**
 * Generic Service Response. All Service responses are required to
 * extend this class
 * @author ankit.verma
 *
 */
public abstract class ServiceResponse {
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
}
