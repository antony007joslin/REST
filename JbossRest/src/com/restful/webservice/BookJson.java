package com.restful.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/bookjson")
public class BookJson {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("status")
	public Response getStatus()
	{
		String str = "JSON";
		str = Book.out();
		return Response.ok(str).build();
	}
}
