package br.com.accurate.advanced.coding;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/algoritimo-1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Algoritimo1 {

    @GET
    @Path("/mdc/{m}/{n}")
    public Response algoritimoUmGet(@PathParam int m, @PathParam int n) {
        return Response.ok(Mdc.mdcBF(m, n)).build();
    }

    @GET
    @Path("/mdc2/{m}/{n}")
    public Resultado algoritimoUmGet2(@PathParam int m, @PathParam int n) {
        return new Resultado(Mdc.mdcStein(m, n));
    }

    @POST
    @Path("/mdc")
    public Response algoritimoUmPost(Numeros n) {
        return Response.ok(new Resultado(Mdc.mdcStein(n.getM(), n.getN()))).build();
    }

    @POST
    @Path("/mdc/list")
    public Resultado algoritimoUmList(NumerosList n) {
        return new Resultado(Mdc.mdcList(n.getN()));
    }

}