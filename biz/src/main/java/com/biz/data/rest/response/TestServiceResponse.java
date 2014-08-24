package com.biz.data.rest.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestServiceResponse extends ServiceResponse<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TestServiceResponse(){
		ResponseStatus status = new ResponseStatus();
		this.setResponseStatus(status);
	}
	
	private String data;

	@Override
	public String getData() {
		return this.data;
	}

	@Override
	public void setData(String data) {
		this.data = data;
	}
}
