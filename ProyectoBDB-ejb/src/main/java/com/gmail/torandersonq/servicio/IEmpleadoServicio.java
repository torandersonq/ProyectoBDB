/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.servicio;

import com.gmail.torandersonq.entidad.Empleado;
import com.gmail.torandersonq.excepcion.ObjectNotFoundException;
import com.gmail.torandersonq.excepcion.ParamRequiredException;
import com.gmail.torandersonq.pojo.EmpleadoDto;
import com.gmail.torandersonq.pojo.EmpleadoPaginadoDto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ander
 */

@Local
public interface IEmpleadoServicio {
    
    public List<EmpleadoDto> listar();
    
    public EmpleadoPaginadoDto listarPaginado(int pagina, int tamano);
    
    public EmpleadoDto listarPorId(Integer id) throws ObjectNotFoundException;
    
    public void guardar(Empleado empleado) throws ParamRequiredException;
    
    public void editar(Empleado empleado) throws ParamRequiredException, ObjectNotFoundException;
    
    public void eliminar(Integer id) throws ObjectNotFoundException;;
}
