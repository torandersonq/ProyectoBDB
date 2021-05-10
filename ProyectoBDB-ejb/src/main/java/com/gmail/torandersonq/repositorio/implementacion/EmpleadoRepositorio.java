/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.repositorio.implementacion;

import com.gmail.torandersonq.entidad.Empleado;
import com.gmail.torandersonq.repositorio.AbstractFacade;
import com.gmail.torandersonq.repositorio.IEmpleadoRepositorio;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Ander
 */

@Stateless
public class EmpleadoRepositorio extends AbstractFacade<Empleado, Integer> implements IEmpleadoRepositorio{
    
    @PersistenceContext(unitName = "com.edu.unicundi_ProyectoBDB-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager entidad;

    public EmpleadoRepositorio() {
        super(Empleado.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return entidad;
    }

    @Override
    public List<Empleado> listar() {
        TypedQuery<Empleado> listaEmpleado = this.entidad.createNamedQuery("Empleado.listarTodo", Empleado.class);
        return listaEmpleado.getResultList();
    }

    @Override
    public Integer cantidadTotal() {
        this.entidad.getEntityManagerFactory().getCache().evictAll();
        Query query = this.entidad.createNamedQuery("Empleado.cantidadTotal", Integer.class);    
        Integer total = Integer.parseInt(query.getSingleResult().toString());
        return total;
    }
    
}
