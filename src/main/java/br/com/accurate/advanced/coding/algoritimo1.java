package br.com.accurate.advanced.coding;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/api")
public class algoritimo1 {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/algoritimoUm/{m}/{n}")
    public int algoritimoUmGet(@PathParam int m, @PathParam int n) {
        return mdc(m, n);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/algoritimoUm")
    public Resultado algoritimoUmPost(Numeros num) {
        Resultado r = new Resultado();
        r.setR(mdc(num.getM(), num.getN()));
        return r;
    }

    private int mdc(int m, int n) {
        if(n == 0)
            return m;
        return mdc(n, m % n);
    }

}