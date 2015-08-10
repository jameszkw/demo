package com.zkw.rpc.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/entry-point")
public class EntryPoint {
	
	 @GET
	 @Path("test")
	 @Produces(MediaType.TEXT_PLAIN)
	public String test() {
        return "Test";
    }
}
