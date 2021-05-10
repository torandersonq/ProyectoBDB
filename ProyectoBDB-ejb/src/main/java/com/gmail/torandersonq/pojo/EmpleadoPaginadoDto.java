/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.pojo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Ander
 */
public class EmpleadoPaginadoDto implements Serializable{
    
    private Integer cantidad;
    
    private List<EmpleadoDto> contenido;

    public EmpleadoPaginadoDto() {
    }

    public EmpleadoPaginadoDto(Integer cantidad, List<EmpleadoDto> contenido) {
        this.cantidad = cantidad;
        this.contenido = contenido;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public List<EmpleadoDto> getContenido() {
        return contenido;
    }

    public void setContenido(List<EmpleadoDto> contenido) {
        this.contenido = contenido;
    }
    
    
}
