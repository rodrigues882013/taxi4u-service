package com.taxi4u.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user/{id}")
public class User {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String get(@PathParam("id") Integer userId) { return "List one User"; }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get() { return "List All Users"; }
}
