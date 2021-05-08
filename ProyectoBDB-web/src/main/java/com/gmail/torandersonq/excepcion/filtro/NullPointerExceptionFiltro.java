/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion.filtro;

import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */

@Provider
public class NullPointerExceptionFiltro implements ExceptionMapper<NullPointerException>{

    @Override
    public Response toResponse(NullPointerException ex) {
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "500", "INTERNAL_SERVER_ERROR", "Error interno");
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error).build();
    }
    
}
