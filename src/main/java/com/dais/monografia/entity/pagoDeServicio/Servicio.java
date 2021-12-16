package com.dais.monografia.entity.pagoDeServicio;

import java.io.Serializable;

public class Servicio  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nombreServicio;
    private String empresa;
    private String codigoServicio;
    private String descripcionServicio;
    private Double costoServicio;

    public Servicio(Integer id, String nombreServicio, String empresa, String codigoServicio, String descripcionServicio, Double costoServicio) {
        this.id = id;
        this.nombreServicio = nombreServicio;
        this.empresa = empresa;
        this.codigoServicio = codigoServicio;
        this.descripcionServicio = descripcionServicio;
        this.costoServicio = costoServicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public Double getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(Double costoServicio) {
        this.costoServicio = costoServicio;
    }
}
