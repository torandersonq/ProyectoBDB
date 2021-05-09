/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion.filtro;

import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */

// Cuando es un post y se coloca un get
@Provider
public class BadRequestExceptionFilter implements ExceptionMapper<BadRequestException>{

    @Override
    public Response toResponse(BadRequestException ex) {
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "400", "BAD_REQUEST", "Error, metodo erroneo debe ser POST");
        return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
    }
    
}
