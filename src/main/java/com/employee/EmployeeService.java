package com.employee;

import com.employee.Employee;
import io.swagger.annotations.*;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/")
@Api(tags = { "SwaggerAPIJavaExample" })
public class EmployeeService {
	@Inject
	ArrayList<Employee> ejb;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Fetches all Employees")
	@ApiResponses({ @ApiResponse(code = 200, message = "Success") })
	public List<Employee> getAll() {
		ArrayList<Employee> ret = new ArrayList<Employee>();
		ret.toArray(ejb.toArray());
		return ret;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Creates a new Employee")
	@ApiResponses({ @ApiResponse(code = 204, message = "Success") })
	public void create(@ApiParam(required = true) Employee incoming) {
		Employee todo = new Employee();
		todo.setName(incoming.getName());
		todo.setId(incoming.getId());
		ejb.add(todo);
	}

	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Updates a new Employee")
	@ApiResponses({ @ApiResponse(code = 204, message = "Success"), @ApiResponse(code = 404, message = "Not Found") })
	public void update(@ApiParam(required = true) @PathParam("id") Long id,
			@ApiParam(required = true) Employee incoming) {
		Employee todo = new Employee();
		todo.setName(incoming.getName());
		todo.setId(incoming.getId());
		ejb.add(todo);
	}

	@DELETE
	@Path("{id}")
	@ApiOperation(value = "Removes a new Employee")
	@ApiResponses({ @ApiResponse(code = 204, message = "Success"), @ApiResponse(code = 404, message = "Not Found") })
	public void remove(@ApiParam(required = true) @PathParam("id") Long id) {
		// ejb.remove(id);
	}

}
