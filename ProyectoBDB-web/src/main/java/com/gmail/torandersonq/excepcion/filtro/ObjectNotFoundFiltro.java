/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion.filtro;

import com.gmail.torandersonq.excepcion.ObjectNotFound;
import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */

@Provider
public class ObjectNotFoundFiltro implements ExceptionMapper<ObjectNotFound>{

    @Override
    public Response toResponse(ObjectNotFound ex) {
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "404", "NOT_FOUND", "Objeto no encontrado");
        return Response.status(Response.Status.NOT_FOUND).entity(error).build();
    }
}
