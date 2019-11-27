package br.com.accurate.advanced.coding;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Path("/algoritimo-4")
@Produces(MediaType.TEXT_PLAIN)
public class Algoritimo4 {

    static final int SAROS_YEAR = 18;
    static final int SAROS_DAYS = 11;
    static final int SAROS_HOURS = 8;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @GET
    @Path("/{date}")
    public String algoritimoQuatroGet(@PathParam String date) {
        return saros(date);
    }

    @POST
    public String algoritimoQuatroPost(@PathParam String date) {
        return saros(date);
    }

    private String saros(String d) {
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(d));
        } catch (ParseException e) { }

        c.add(Calendar.YEAR, SAROS_YEAR);
        c.add(Calendar.DAY_OF_MONTH, SAROS_DAYS);
        c.add(Calendar.HOUR, SAROS_HOURS);

        return sdf.format(c.getTime());
    }

}