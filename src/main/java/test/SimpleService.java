package test;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/simple")
public class SimpleService {

    @GET
    @Produces("text/plain")
    public String get() {
        return "Simple JAX-RS service here. Apparently, I work. (No injection or anything, just plain JAX-RS 2.0.)";
    }

}
