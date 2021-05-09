/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.repositorio;

import com.gmail.torandersonq.entidad.Empleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ander
 */

@Local
public interface IEmpleadoRepositorio {
    
    public List<Empleado> listar();
    
    public Empleado listarPorId(Integer id);
    
    public void guardar(Empleado empleado);
    
    public void editar(Empleado empleado);
    
    public void eliminar(Empleado empleado);
    
}
