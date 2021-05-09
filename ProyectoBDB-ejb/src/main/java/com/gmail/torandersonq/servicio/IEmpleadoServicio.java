/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.servicio;

import com.gmail.torandersonq.excepcion.ObjectNotFoundException;
import com.gmail.torandersonq.pojo.Empleado;
import javax.ejb.Local;

/**
 *
 * @author Ander
 */

@Local
public interface IEmpleadoServicio {
    
    public void insertarEmpleado(Empleado empleado);
    
    public void eliminarEmpleado(int id) throws ObjectNotFoundException;
}
