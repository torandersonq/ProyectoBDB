package com.gmail.torandersonq.controlador;

import com.gmail.torandersonq.entidad.Empleado;
import com.gmail.torandersonq.excepcion.ObjectNotFoundException;
import com.gmail.torandersonq.excepcion.ParamRequiredException;
import com.gmail.torandersonq.pojo.EmpleadoDto;
import com.gmail.torandersonq.pojo.EmpleadoPaginadoDto;
import com.gmail.torandersonq.servicio.IEmpleadoServicio;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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

    @EJB
    public IEmpleadoServicio servicio;

    @Path("/pruebaRetornarString") // Entrada URL servicio: pruebaRetornarString
    @GET // Retorna
    @Produces(MediaType.APPLICATION_JSON) // Devuelve un JSON
    public Response pruebaRetornarString() {
        String nombre = "Anderson Torres";
        return Response.status(Response.Status.OK).entity(nombre).build();
    }

    @Path("/listar")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listar() {
        List<EmpleadoDto> listaEmpleado = servicio.listar();
        return Response.status(Response.Status.OK).entity(listaEmpleado).build();
    }

    @Path("/retornarPaginado/{pagina}/{tamano}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response retornarPaginado(@PathParam("pagina") Integer pagina, @PathParam("tamano") Integer tamano) {
        EmpleadoPaginadoDto lista = servicio.listarPaginado(pagina, tamano);
        return Response.status(Response.Status.OK).entity(lista).build();
    }

    @Path("/retornarPorId/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response retornarPorId(@PathParam("id") Integer id) throws ObjectNotFoundException {
        EmpleadoDto empleado = servicio.listarPorId(id);
        return Response.status(Response.Status.OK).entity(empleado).build();
    }

    @Path("/guardar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response guardar(@Valid Empleado empleado) throws ParamRequiredException {
        servicio.guardar(empleado);
        return Response.status(Response.Status.CREATED).build();
    }

    @Path("/editar")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editar(@Valid Empleado empleado) throws ParamRequiredException, ObjectNotFoundException {
        servicio.editar(empleado);
        return Response.status(Response.Status.OK).build();
    }

    @Path("/eliminar/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminar(@PathParam("id") Integer id) throws ObjectNotFoundException {
        servicio.eliminar(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
