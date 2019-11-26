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
        return Mdc.mdcBF(m, n);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/post")
    public Resultado algoritimoUmPost(Numeros n) {
        Resultado r = new Resultado();
        r.setR(Mdc.mdcStein(n.getM(), n.getN()));
        return r;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list")
    public Resultado algoritimoUmList(NumerosList n) {
        Resultado r = new Resultado();
        r.setR(Mdc.mdcList(n.getN()));
        return r;
    }

}