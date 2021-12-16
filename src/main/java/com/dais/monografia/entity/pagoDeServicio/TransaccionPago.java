package com.dais.monografia.entity.pagoDeServicio;

import java.io.Serializable;

public class TransaccionPago  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String codigoTransaccion;
    private Servicio servicio;
    private Integer cantidad;

    public TransaccionPago(Integer id, String codigoTransaccion, Servicio servicio, Integer cantidad) {
        this.id = id;
        this.codigoTransaccion = codigoTransaccion;
        this.servicio = servicio;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
