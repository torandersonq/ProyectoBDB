/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion.filtro;

import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.ws.rs.NotSupportedException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */
// error al enviar un NO json
@Provider
public class NotSupportedExceptionFilter implements ExceptionMapper<NotSupportedException>{

    @Override
    public Response toResponse(NotSupportedException ex) {
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "415", "UNSUPPORTED_MEDIA_TYPE", "Error, NO es un JSON");
        return Response.status(Response.Status.UNSUPPORTED_MEDIA_TYPE).entity(error).build();
    }
    
}
