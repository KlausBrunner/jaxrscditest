package test;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/other")
public class OtherService {
    @Inject
    private MessageBean bean;

    @GET
    @Produces("text/html")
    public String get() {
        String message = bean != null ? bean.getMessage() : "NOTHING - it's null, so field injection has failed miserably!";

        return "<html><body>" +
                "<p>Simple service with injection here. The injected bean says:</p><blockquote>" + message + "</blockquote>" +
                "</body>";

    }
}
