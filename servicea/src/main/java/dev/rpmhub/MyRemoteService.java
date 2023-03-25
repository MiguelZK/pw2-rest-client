package dev.rpmhub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:4444/service")
public interface MyRemoteService {
    
    @GET
    @Path("/person/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPerson(@PathParam("name") String name);
}