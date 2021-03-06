package com.biz.data.rest.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestServiceResponse extends ServiceResponse<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Empty constructor
	 */
	public TestServiceResponse(){
		ResponseStatus status = new ResponseStatus();
		this.setResponseStatus(status);
	}
	
	/**
	 * Value holder for response data
	 */
	private String data;

	/**
	 *{@inheritDoc} 
	 */
	@Override
	public String getData() {
		return this.data;
	}

	/**
	 *{@inheritDoc} 
	 */
	@Override
	public void setData(String data) {
		this.data = data;
	}
}
