package com.dais.monografia.Controller;

import com.dais.monografia.entity.pagoDeServicio.Servicio;
import com.dais.monografia.entity.pagoDeServicio.TransaccionPago;
import com.dais.monografia.entity.recargaCelular.ClienteCelular;
import com.dais.monografia.entity.recargaCelular.TransaccionRecarga;
import com.dais.monografia.entity.transferenciaEntreMisCuentas.CuentaCliente;
import com.dais.monografia.entity.transferenciaEntreMisCuentas.TransaccionTransferencia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.dais.monografia.data.Data.*;

@RestController
public class BancoAppController {

    @RequestMapping(value="/servicios", method= RequestMethod.GET)
    public List<Servicio> getServicios(){
        return servicios;
    }

    @RequestMapping(value="/transaccionesPagoServicio", method= RequestMethod.GET)
    public List<TransaccionPago> getTransaccionesPagoServicio(){
        return transaccionesPagos;
    }

    @RequestMapping(value="/clientesCelular", method= RequestMethod.GET)
    public List<ClienteCelular> getClienteCelular(){
        return clienteCelulares;
    }

    @RequestMapping(value="/transaccionesRecargas", method= RequestMethod.GET)
    public List<TransaccionRecarga> getTransaccionRecarga(){
        return transaccionesRecarga;
    }

    @RequestMapping(value="/cuentasClientes", method= RequestMethod.GET)
    public List<CuentaCliente> getCuentaCliente(){
        return cuentaClientes;
    }

    @RequestMapping(value="/transaccionesTransferencia", method= RequestMethod.GET)
    public List<TransaccionTransferencia> getTransaccionesTransferencia(){
        return transaccionTransferencias;
    }
}
