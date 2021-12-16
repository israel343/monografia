package com.dais.monografia.entity.transferenciaEntreMisCuentas;

import java.io.Serializable;
import java.util.Date;

public class CuentaCliente  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nombreCuenta;
    private String moneda;
    private Double monto;
    private Date fechaCreacion;

    public CuentaCliente(Integer id, String nombreCuenta, String moneda, Double monto, Date fechaCreacion) {
        this.id = id;
        this.nombreCuenta = nombreCuenta;
        this.moneda = moneda;
        this.monto = monto;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
