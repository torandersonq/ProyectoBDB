/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.pojo;

import java.io.Serializable;

/**
 *
 * @author Ander
 */
public class EmpleadoDto implements Serializable{
     
    private Integer id;
    
    private String funcion;
    
    private String nombreCompleto;

    public EmpleadoDto() {
    }

    public EmpleadoDto(Integer id, String funcion, String nombreCompleto) {
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
