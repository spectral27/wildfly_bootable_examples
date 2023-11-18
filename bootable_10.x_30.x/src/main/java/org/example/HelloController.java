package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

@Path("/hello")
public class HelloController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        Map<String, String> message = new HashMap<>();
        message.put("message", "Hello from WildFly Bootable");
        return Response.ok(message).build();
    }

}
