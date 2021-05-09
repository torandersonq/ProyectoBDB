/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion.filtro;

import com.gmail.torandersonq.pojo.ErrorWrraper;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Ander
 */


// Validaciones
@Provider
public class ConstrainViolationFilter implements ExceptionMapper<ConstraintViolationException>{

    @Override
    public Response toResponse(ConstraintViolationException ex) {
        ErrorWrraper error = new ErrorWrraper(ex.getMessage(), "400", "BAD_REQUEST", "Error");
        return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
    }
    
    private String prepareMessage(ConstraintViolationException exception){
        String msg = "";
        for(ConstraintViolation<?> cv : exception.getConstraintViolations()){
            msg+=cv.getPropertyPath()+" "+cv.getMessage()+"\n";
        }
        return msg;
    }
}
