/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Ander
 */

@Entity
@Table(name = "empleado")
@NamedQueries({
    @NamedQuery(name = "Empleado.listarTodo", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.listarSoloEmpleado", query = "SELECT e.id, e.funcion, e.nombreCompleto FROM Empleado e"), 
    @NamedQuery(name = "Empleado.cantidadTotal", query = "SELECT COUNT(e) FROM Empleado e")
})
public class Empleado implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @NotNull(message = "Funcion requerido")
    @Size(max = 25)
    @Column(name = "funcion", length = 25, nullable = false)
    private String funcion;
    
    @NotNull(message = "Nombre requerido")
    @Size(max = 35)
    @Column(name = "nombreCompleto", length = 35, nullable = false)
    private String nombreCompleto;
    

    public Empleado() {
    }

    public Empleado(Integer id, String funcion, String nombreCompleto) {
        this.id = id;
        this.funcion = funcion;
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    
}
