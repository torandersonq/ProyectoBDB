/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion.filtro;

import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.ws.rs.NotAllowedException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */
    
// Error en tipo de metodo envidado
@Provider
public class NotAllowedExceptionFilter implements ExceptionMapper<NotAllowedException>{

    @Override
    public Response toResponse(NotAllowedException ex) {
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "405", "METHOD_NOT_ALLOWED", "Error, valide el tipo de metodo");
        return Response.status(Response.Status.METHOD_NOT_ALLOWED).entity(error).build();    
    }
    
}
