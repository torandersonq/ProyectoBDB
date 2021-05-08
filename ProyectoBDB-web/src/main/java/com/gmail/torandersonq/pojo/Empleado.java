
package com.gmail.torandersonq.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Ander
 */

public class Empleado implements Serializable{
    
    
    private int id;
    
    @NotNull(message = "Nombre Completo Requerido")
    @Column(name = "nombreCompleto", length = 25, nullable = false)
    private String nombreCompleto;
    
    @NotNull(message = "Funcion Requerida")
    @Column(name = "funcion", length = 25, nullable = false)
    private String funcion;

    public Empleado() {
    }

    public Empleado(int id, String nombreCompleto, String funcion) {
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
