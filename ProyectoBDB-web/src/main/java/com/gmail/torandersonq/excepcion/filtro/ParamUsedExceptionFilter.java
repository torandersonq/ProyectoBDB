/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion.filtro;


import com.gmail.torandersonq.excepcion.ParamUsedException;
import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */
@Provider
public class ParamUsedExceptionFilter implements ExceptionMapper<ParamUsedException>{

    @Override
    public Response toResponse(ParamUsedException ex) {
        System.out.println("Entro a ParamUsedExceptionFilter");
        ex.printStackTrace();
        
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "400", "BAD_REQUEST", "Error, informacion ya registrada");
        return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
    }
    
  
}
