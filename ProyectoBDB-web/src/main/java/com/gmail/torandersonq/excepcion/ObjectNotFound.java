/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.torandersonq.excepcion;

/**
 *
 * @author Ander
 */
public class ObjectNotFound extends RuntimeException{

    public ObjectNotFound(String message) {
        super(message);
    }
    
}
