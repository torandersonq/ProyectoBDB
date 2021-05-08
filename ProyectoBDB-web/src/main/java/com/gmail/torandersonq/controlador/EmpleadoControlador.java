package com.gmail.torandersonq.controlador;

import com.gmail.torandersonq.logica.EmpleadoServicio;
import com.gmail.torandersonq.pojo.Empleado;
import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Ander
 */
@Stateless // No maneja comunicacion abierta
@Path("/empleados") // Entrada URL para objeto: empleados
public class EmpleadoControlador {

    @Path("/pruebaRetornarString") // Entrada URL servicio: pruebaRetornarString
    @GET // Retorna
    @Produces(MediaType.APPLICATION_JSON) // Devuelve un JSON
    public Response pruebaRetornarString() {
        String nombre = "Anderson Torres";
        return Response.status(Response.Status.OK).entity(nombre).build();
    }

    @Path("/retornar") // Entrada URL servicio: retornar
    @GET // Retorna
    @Produces(MediaType.APPLICATION_JSON) // Devuelve un JSON
    public Response retornar() {
        Empleado empleado = new Empleado(1, "Anderson", "Operario");
        return Response.status(Response.Status.OK).entity(empleado).build();
    }

    @Path("/retornar/{id}") // Entrada URL servicio: retornar empleado por parametro
    @GET // Retorna
    @Produces(MediaType.APPLICATION_JSON) // Devuelve un JSON
    public Response retornar(@PathParam("id") int id) {
        Empleado empleado = new Empleado(id, "Anderson", "Operario");
        return Response.status(Response.Status.OK).entity(empleado).build();
    }

    @Path("/insertar") // Entrada URL servicio: insertar empleado
    @POST // Inserta
    @Produces(MediaType.APPLICATION_JSON) // Devuelve un JSON
    public Response insertar(@Valid Empleado empleado) {
        EmpleadoServicio servicio = new EmpleadoServicio();
        servicio.insertarEmpleado(empleado);
        return Response.status(Response.Status.CREATED).build();
    }

    @Path("/eliminar/{id}") // Entrada URL servicio: eliminar empleado por parametro
    @DELETE // Elimina
    @Produces(MediaType.APPLICATION_JSON) // Devuelve un JSON
    public Response eliminar(@PathParam("id") int empleado) {
        EmpleadoServicio servicio = new EmpleadoServicio();
        servicio.eliminarEmpleado(empleado);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
