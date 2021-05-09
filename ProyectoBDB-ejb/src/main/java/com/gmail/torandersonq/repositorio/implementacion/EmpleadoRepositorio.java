/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.repositorio.implementacion;

import com.gmail.torandersonq.entidad.Empleado;
import com.gmail.torandersonq.repositorio.IEmpleadoRepositorio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ander
 */

@Stateless
public class EmpleadoRepositorio implements IEmpleadoRepositorio{
    
    @PersistenceContext(unitName = "com.edu.unicundi_ProyectoBDB-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager entidad;

    @Override
    public List<Empleado> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado listarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Empleado empleado) {
        this.entidad.persist(entidad);
    }

    @Override
    public void editar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
