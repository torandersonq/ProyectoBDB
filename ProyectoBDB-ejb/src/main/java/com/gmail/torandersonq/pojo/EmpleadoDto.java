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
    
    
    private int id;
    
    private String nombreCompleto;
    
    private String funcion;

    public EmpleadoDto() {
    }

    public EmpleadoDto(int id, String nombreCompleto, String funcion) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.funcion = funcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

}
