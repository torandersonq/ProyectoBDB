/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.servicio.implementacion;

import com.gmail.torandersonq.entidad.Empleado;
import com.gmail.torandersonq.pojo.EmpleadoDto;
import com.gmail.torandersonq.repositorio.IEmpleadoRepositorio;
import com.gmail.torandersonq.servicio.IEmpleadoServicio;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Ander
 */

@Stateless  
public class EmpleadoServicio implements IEmpleadoServicio{

    @EJB
    private IEmpleadoRepositorio repositorio;

    @Override
    public List<EmpleadoDto> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado listarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Empleado empleado) {
        repositorio.guardar(empleado);
    }

    @Override
    public void editar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
