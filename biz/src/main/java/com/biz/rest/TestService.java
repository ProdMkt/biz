package com.biz.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biz.data.BizOperation;
import com.biz.delegate.BaseDelegate;

@Component
@Path("/test")
@Produces( { "application/json", "application/xml" } )
public class TestService extends BaseService{

	//Auto - wiring the business object
	@Autowired
	private BaseDelegate test;
	
	
	/**
	 * Rest Service exposed as GET to handle forgot password flow.
	 * @param id : email ID of the user, to reset the password
	 * @return Response.
	 */
	@GET
	public Response forgot( @PathParam( "id" ) String id ){
		Object returnObj = null;
		try{
			returnObj = test.handleService(BizOperation.TEST_REST, null);
		}
		catch( Exception e ){
			throw new WebApplicationException( Response.Status.INTERNAL_SERVER_ERROR );
		}		 
		return Response.ok(returnObj).build();
	}	
}