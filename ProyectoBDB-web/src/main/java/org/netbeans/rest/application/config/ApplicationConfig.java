/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Ander
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.gmail.torandersonq.controlador.EmpleadoControlador.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.BadRequestExceptionFilter.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.ConstrainViolationFilter.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.ExceptionFilter.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.NotAllowedExceptionFilter.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.NotFoundExceptionFilter.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.NotSupportedExceptionFilter.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.NullPointerExceptionFiltro.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.ObjectNotFoundExceptionFiltro.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.ParamRequiredExceptionFilter.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.ParamUsedExceptionFilter.class);
        resources.add(com.gmail.torandersonq.excepcion.filtro.WebApplicationExceptionFilter.class);
        resources.add(org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider.class);
        resources.add(org.codehaus.jackson.jaxrs.JacksonJsonProvider.class);
        resources.add(org.codehaus.jackson.jaxrs.JsonMappingExceptionMapper.class);
        resources.add(org.codehaus.jackson.jaxrs.JsonParseExceptionMapper.class);
        resources.add(org.netbeans.rest.application.config.Cors.class);
    }
    
}
