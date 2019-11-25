package br.com.accurate.advanced.coding;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/algoritimo1/{m}/{n}")
public class algoritimo1 {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int mdc(@PathParam int m, @PathParam int n) {

        if(n == 0)
            return m;

        return mdc(n, m % n);
    }
}