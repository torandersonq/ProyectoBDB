package com.gmail.torandersonq.excepcion.filtro;

import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */

// Json Mal formado
@Provider
public class WebApplicationExceptionFilter implements ExceptionMapper<WebApplicationException>{

    @Override
    public Response toResponse(WebApplicationException ex) {
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "400", "BAD_REQUEST", "Error, Json mal formado");
        return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
    }
    
}
