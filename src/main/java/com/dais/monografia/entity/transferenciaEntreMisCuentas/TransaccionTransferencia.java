package com.dais.monografia.entity.transferenciaEntreMisCuentas;

import java.io.Serializable;

public class TransaccionTransferencia  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private CuentaCliente cuentaSalidaDinero;
    private CuentaCliente cuentaDestino;
    private String moneda;
    private Double monto;
    private String comentario;

    public TransaccionTransferencia(Integer id, CuentaCliente cuentaSalidaDinero, CuentaCliente cuentaDestino, String moneda, Double monto, String comentario) {
        this.id = id;
        this.cuentaSalidaDinero = cuentaSalidaDinero;
        this.cuentaDestino = cuentaDestino;
        this.moneda = moneda;
        this.monto = monto;
        this.comentario = comentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CuentaCliente getCuentaSalidaDinero() {
        return cuentaSalidaDinero;
    }

    public void setCuentaSalidaDinero(CuentaCliente cuentaSalidaDinero) {
        this.cuentaSalidaDinero = cuentaSalidaDinero;
    }

    public CuentaCliente getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaCliente cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
