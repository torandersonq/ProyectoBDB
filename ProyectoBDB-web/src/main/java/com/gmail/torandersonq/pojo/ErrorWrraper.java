package com.gmail.torandersonq.pojo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Ander
 */
public class ErrorWrraper implements Serializable {

    private String mensaje;
    private String codigo;
    private String nombreCodigo;
    private String informacion;
    private Date fecha;
    private LocalTime hora;

    public ErrorWrraper() {
    }

    public ErrorWrraper(String mensaje, String codigo, String nombreCodigo, String informacion) {
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.nombreCodigo = nombreCodigo;
        this.informacion = informacion;
        this.fecha = Date.from(Instant.now());
        this.hora = LocalTime.now();
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCodigo() {
        return nombreCodigo;
    }

    public void setNombreCodigo(String nombreCodigo) {
        this.nombreCodigo = nombreCodigo;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getFecha() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());

        return date;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

}
