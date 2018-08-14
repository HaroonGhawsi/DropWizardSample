package com.haroon.rest.controller;

import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeRESTController {
	
	private final Validator validator;
	
	public EmployeeRESTController(Validator validator) {
		this.validator = validator;
	}
	
	@GET
	@Path("/{id}")
	public Response getEmployeeById(@PathParam("id") Integer id) {
		Employee employee = EmployeeDB.getEmployee(id);
		if(employee != null) {
			return Response.ok(employee).build();
		}
		else
			return Response.status(Status.NOT_FOUND).build();
	}

}
