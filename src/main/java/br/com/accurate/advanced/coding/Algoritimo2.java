package br.com.accurate.advanced.coding;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/algoritimo-2")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Algoritimo2 {

    @GET
    @Path("/mdc/{m}/{n}")
    public ResultadoList algoritimoDoisGet(@PathParam int m, @PathParam int n) {
        return new ResultadoList(new int[] {m,n});
    }

}