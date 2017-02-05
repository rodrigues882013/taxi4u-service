package com.taxi4u.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("rides")
public class Ride {


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String get(@PathParam("id") Integer rideId) {
        return "Got it!";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
        return "Got it!";
    }
}
