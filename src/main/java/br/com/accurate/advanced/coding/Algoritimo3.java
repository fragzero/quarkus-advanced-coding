package br.com.accurate.advanced.coding;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/algoritimo-3")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Algoritimo3 {

    @GET
    @Path("/mmc/{m}/{n}")
    public Resultado algoritimoTresGet(@PathParam int m, @PathParam int n) {
        return new Resultado(Mmc.mmc(m, n));
    }

    @POST
    @Path("/mmc")
    public Resultado algoritimoTresPost(Numeros n) {
        return new Resultado(Mmc.mmc(n.getM(), n.getN()));
    }

    @POST
    @Path("/mmc/list")
    public Resultado algoritimoTresPost(NumerosList n) {
        return new Resultado(Mmc.mmcList(n.getN()));
    }

}