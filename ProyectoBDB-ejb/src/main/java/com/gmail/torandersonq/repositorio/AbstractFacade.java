/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.repositorio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Ander
 */
public abstract class AbstractFacade<T,V> {
    
    private Class<T> entityClass;
    
    public AbstractFacade(Class<T> entityClass){
        this.entityClass = entityClass;
    }
    
    protected abstract EntityManager getEntityManager();
    
    /*public List<T> listar(){
      javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
      cq.select(cq.from(entityClass));
      return getEntityManager().createQuery(cq).getResultList();
    }*/
    
    public List<T> listarPaginado(int pagina, int tamano){
        CriteriaQuery query = getEntityManager().getCriteriaBuilder().createQuery();
        query.select(query.from(entityClass));
        Query q = getEntityManager().createQuery(query);
        
        q.setFirstResult((pagina - 1) * tamano);
        q.setMaxResults(tamano);
        return q.getResultList();   
    }
    
    public T listarPorId(V id){
        return getEntityManager().find(entityClass, id);
    }
    
    public void guardar(T entidad){
        getEntityManager().persist(entidad);
    }
    
    public void editar(T entidad){
        getEntityManager().merge(entidad);
    }
    
    public void eliminar(T entidad){
        getEntityManager().remove(entidad);
    }
}
