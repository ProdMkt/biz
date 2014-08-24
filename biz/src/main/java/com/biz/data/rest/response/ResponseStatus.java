package com.biz.data.rest.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.biz.data.StatusCode;

@XmlRootElement
public class ResponseStatus {
    
    /**
     * The status code for the response returned by the API.
     */
    private StatusCode statusCode;
    
    /**
     * The response message returned by the API.
     */
    private String statusMessage;
    
    /**
     * Errors (if any) while processing the request. 
     */
    private List<ServiceError> errors;
    
    /**
     * Constructor
     * 
     * @param statusCode
     * @param statusMessage
     */
    public ResponseStatus(final StatusCode statusCode, final String statusMessage, final List<ServiceError> errors) {
    	this.statusCode = statusCode;
    	this.statusMessage = statusMessage;
    	this.errors = errors;
    }

    /**
     * Constructor
     * 
     * @param statusCode
     * @param statusMessage
     */
    public ResponseStatus(final StatusCode statusCode, final String statusMessage) {
    	this.statusCode = statusCode;
    	this.statusMessage = statusMessage;
    }
    
    public ResponseStatus(){
    	
    }
    /**
     * Gets the value for statusCode.
     * @return the statusCode
     */
    public StatusCode getStatusCode() {
        return this.statusCode;
    }

    /**
     * Gets the value for statusMessage.
     * @return the statusMessage
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * Sets the value for statusCode.
     * @param statusCode the statusCode to set
     */
    public void setStatusCode(final StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Sets the value for statusMessage.
     * @param statusMessage the statusMessage to set
     */
    public void setStatusMessage(final String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * Gets the value for errors.
     * @return the errors
     */
    public List<ServiceError> getErrors() {
        return this.errors;
    }

    /**
     * Sets the value for errors.
     * @param errors the errors to set
     */
    public void setErrors(final List<ServiceError> errors) {
        this.errors = errors;
    }
    
    /**
     * Add an error occurred during operation to return object
     * @param error
     */
    public void addError(final ServiceError error){
    	if(errors == null){
    		errors = new ArrayList<ServiceError>();
    	}
    	
    	errors.add(error);
    }
}

