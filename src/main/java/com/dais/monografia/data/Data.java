package com.dais.monografia.data;

import com.dais.monografia.entity.pagoDeServicio.Servicio;
import com.dais.monografia.entity.pagoDeServicio.TransaccionPago;
import com.dais.monografia.entity.recargaCelular.ClienteCelular;
import com.dais.monografia.entity.recargaCelular.TransaccionRecarga;
import com.dais.monografia.entity.transferenciaEntreMisCuentas.CuentaCliente;
import com.dais.monografia.entity.transferenciaEntreMisCuentas.TransaccionTransferencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {


    public static List<Servicio> servicios = new ArrayList<>(){
        {
            add(new Servicio(1,"Servicio de Luz","Luz del sur",
                    "SL001","Servicio consumido en el mes de Diciembre",145.00));
            add(new Servicio(2,"Servicio de Agua","Luz del sur",
                    "SA001","Servicio consumido en el mes de Noviembre",89.40));

        }
    };

    public static List<TransaccionPago> transaccionesPagos = new ArrayList<>(){
        {
            add(new TransaccionPago(1,"TRXN001",servicios.get(0),1));
            add(new TransaccionPago(2,"TRXN003", servicios.get(1),1));
        }
    };

    public static List<ClienteCelular> clienteCelulares = new ArrayList<>(){
        {
            add(new ClienteCelular(1,"Ramirez","Flores","Felipe","924113223"));
            add(new ClienteCelular(2,"Ñahui","Lopez","Ariadna","954785633"));
        }
    };

    public static List<TransaccionRecarga> transaccionesRecarga = new ArrayList<>(){
        {
            add(new TransaccionRecarga(1,5.00,"soles",new Date(),"Movistar",clienteCelulares.get(0)));
            add(new TransaccionRecarga(1,60.00,"soles",new Date(),"Claro",clienteCelulares.get(1)));
        }
    };


    public static List<CuentaCliente> cuentaClientes = new ArrayList<>(){
        {
            add(new CuentaCliente(1,"cuenta de ahorro","soles",1000.30,new Date()));
            add(new CuentaCliente(1,"cuenta de soles","soles",340.21,new Date()));
        }
    };

    public static List<TransaccionTransferencia> transaccionTransferencias = new ArrayList<>(){
        {
            add(new TransaccionTransferencia(1,cuentaClientes.get(1),cuentaClientes.get(0),"soles",1023.42,"Monto depositado"));
        }
    };
}
