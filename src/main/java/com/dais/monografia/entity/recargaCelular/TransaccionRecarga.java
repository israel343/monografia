package com.dais.monografia.entity.recargaCelular;

import java.io.Serializable;
import java.util.Date;

public class TransaccionRecarga implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Double montoRecarga;
    private String moneda;
    private Date fechaRecarga;
    private String empresa;
    private ClienteCelular clienteCelular;

    public TransaccionRecarga(Integer id, Double montoRecarga, String moneda, Date fechaRecarga, String empresa, ClienteCelular clienteCelular) {
        this.id = id;
        this.montoRecarga = montoRecarga;
        this.moneda = moneda;
        this.fechaRecarga = fechaRecarga;
        this.empresa = empresa;
        this.clienteCelular = clienteCelular;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMontoRecarga() {
        return montoRecarga;
    }

    public void setMontoRecarga(Double montoRecarga) {
        this.montoRecarga = montoRecarga;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Date getFechaRecarga() {
        return fechaRecarga;
    }

    public void setFechaRecarga(Date fechaRecarga) {
        this.fechaRecarga = fechaRecarga;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ClienteCelular getClienteCelular() {
        return clienteCelular;
    }

    public void setClienteCelular(ClienteCelular clienteCelular) {
        this.clienteCelular = clienteCelular;
    }
}
