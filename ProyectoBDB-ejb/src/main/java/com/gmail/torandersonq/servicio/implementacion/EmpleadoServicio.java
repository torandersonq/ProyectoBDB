/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.servicio.implementacion;

import com.gmail.torandersonq.excepcion.ObjectNotFoundException;
import com.gmail.torandersonq.pojo.Empleado;
import com.gmail.torandersonq.servicio.IEmpleadoServicio;
import javax.ejb.Stateless;

/**
 *
 * @author Ander
 */

@Stateless  
public class EmpleadoServicio implements IEmpleadoServicio{

    @Override
    public void insertarEmpleado(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarEmpleado(int id) throws ObjectNotFoundException {
        System.out.println("Empleado Eliminado");
    }
    
}
