package br.com.accurate.advanced.coding;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/algoritimo-um")
public class Algoritimo1 {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/get/{m}/{n}")
    public int algoritimoUmGet(@PathParam int m, @PathParam int n) {
        return Mdc.mdc(m, n);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/post")
    public Resultado algoritimoUmPost(Numeros num) {
        Resultado r = new Resultado();
        r.setR(Mdc.mdc(num.getM(), num.getN()));
        return r;
    }


}