package com.dais.monografia.entity.recargaCelular;

import java.io.Serializable;

public class ClienteCelular implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String apellidoMaternoCliente;
    private String apellidPaternoCliente;
    private String nombreCliente;
    private String nroCelular;

    public ClienteCelular(Integer id, String apellidoMaternoCliente, String apellidPaternoCliente, String nombreCliente, String nroCelular) {
        this.id = id;
        this.apellidoMaternoCliente = apellidoMaternoCliente;
        this.apellidPaternoCliente = apellidPaternoCliente;
        this.nombreCliente = nombreCliente;
        this.nroCelular = nroCelular;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellidoMaternoCliente() {
        return apellidoMaternoCliente;
    }

    public void setApellidoMaternoCliente(String apellidoMaternoCliente) {
        this.apellidoMaternoCliente = apellidoMaternoCliente;
    }

    public String getApellidPaternoCliente() {
        return apellidPaternoCliente;
    }

    public void setApellidPaternoCliente(String apellidPaternoCliente) {
        this.apellidPaternoCliente = apellidPaternoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNroCelular() {
        return nroCelular;
    }

    public void setNroCelular(String nroCelular) {
        this.nroCelular = nroCelular;
    }
}
