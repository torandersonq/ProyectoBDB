/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.logica;

import com.gmail.torandersonq.excepcion.ObjectNotFound;
import com.gmail.torandersonq.pojo.Empleado;

/**
 *
 * @author Ander
 */

public class EmpleadoServicio {

    public void insertarEmpleado(Empleado empleado){
        
    }
    
    public void eliminarEmpleado(int id) throws ObjectNotFound{
        if(id == 0){
            throw new ObjectNotFound("Empleado no encontrado");
        } else if(id == 1){
            throw new NullPointerException("Nulo");
        } else {
            
        }
    }
}
