package com.biz.data.rest.response;

import java.io.Serializable;

/**
 * Represents an error while executing the service.
 */
public class ServiceError implements Serializable {
    /**
     * Generic error code if no code is supplied.
     */
    public static final String GENERIC_ERROR_CODE = "500";
    
    /**
     * Generated Serial version ID.
     */
    private static final long serialVersionUID = 3425918573792708628L;

    /**
     * Code for the error.
     */
    private String code;
    
    /**
     * Error message.
     */
    private String message;
    
    /**
     * Name of the field with which error is associated (can be null). 
     */
    private String field;
    
    /**
     * Default constructor for frameworks like jackson to construct instances.  
     */
    public ServiceError() {
        this(null, null, null);
    }

    /**
     * Creates a service error using the provided values.
     * @param code Code for the error.
     * @param message Error message.
     * @param field Name of the field with which error is associated. 
     */
    public ServiceError(final String code, final String message, final String field) {
        this.code = code;
        this.message = message;
        this.field = field;
    }
    
    /**
     * Creates a service error using the provided values.
     * @param code Code for the error.
     * @param message Error message.
     */
    public ServiceError(final String code, final String message) {
        this.code = code;
        this.message = message;
        this.field = null;
    }

    /**
     * Creates a service error using the provided values.
     * @param message Error message.
     */
    public ServiceError(final String message) {
        this.code = GENERIC_ERROR_CODE;
        this.message = message;
        this.field = null;
    }

    /**
     * {@inheritDoc}
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ServiceError [code=" + code + ", message=" + message + ", field=" + field + "]";
    }

    /**
     * Gets the value for code.
     * @return the code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the value for message.
     * @return the message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Gets the value for field.
     * @return the field
     */
    public String getField() {
        return this.field;
    }

    /**
     * Sets the value for code.
     * @param code the code to set
     */
    public void setCode(final String code) {
        this.code = code;
    }

    /**
     * Sets the value for message.
     * @param message the message to set
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * Sets the value for field.
     * @param field the field to set
     */
    public void setField(final String field) {
        this.field = field;
    }
}
