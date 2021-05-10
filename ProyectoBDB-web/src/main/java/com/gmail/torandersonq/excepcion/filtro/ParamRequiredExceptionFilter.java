/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion.filtro;


import com.gmail.torandersonq.excepcion.ParamRequiredException;
import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */
@Provider
public class ParamRequiredExceptionFilter implements ExceptionMapper<ParamRequiredException>{
    
    @Override
    public Response toResponse(ParamRequiredException ex) {
        System.out.println("Entro a ParamRequiredExceptionFilter");
        ex.printStackTrace();
        
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "400", "BAD_REQUEST", "Error ID requerido");
        return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
    }
    
}
