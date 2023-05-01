package com.supermarket.models.domain;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 6/09/2022
 * @time 09:38:57
 * Codigo Tecnico: IN5BV
 * Grupo: 2 (lunes)
 *
 */

import java.time.LocalDate;

public class Factura {
    private int numeroFactura;
    private String serie;
    private LocalDate fecha;
    private String empleadoId;
    private String clienteId;
    private int ventaArticuloId;
    
    public Factura(){
        
    }
    
    public Factura(int numeroFactura){
        this.numeroFactura = numeroFactura;
    }
    
    public Factura(String serie, LocalDate fecha, String empleadoId, String clienteId, int ventaArticuloId){
        this.serie = serie;
        this.fecha = fecha;
        this.empleadoId = empleadoId;
        this.clienteId = clienteId;
        this.ventaArticuloId = ventaArticuloId;
    }

    public Factura(int numeroFactura, String serie, LocalDate fecha, String empleadoId, String clienteId, int ventaArticuloId) {
        this.numeroFactura = numeroFactura;
        this.serie = serie;
        this.fecha = fecha;
        this.empleadoId = empleadoId;
        this.clienteId = clienteId;
        this.ventaArticuloId = ventaArticuloId;
    }

    public int getNumeroFacturas() {
        return numeroFactura;
    }

    public void setNumeroFacturas(int numeroFacturas) {
        this.numeroFactura = numeroFacturas;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(String empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public int getVentaArticuloId() {
        return ventaArticuloId;
    }

    public void setVentaArticuloId(int ventaArticuloId) {
        this.ventaArticuloId = ventaArticuloId;
    }

    @Override
    public String toString() {
        return "Factura:" + "numeroFacturas=" + numeroFactura + ", serie=" + serie + ", fecha=" + fecha + ", empleadoId=" + empleadoId + ", clienteId=" + clienteId + ", ventaArticuloId=" + ventaArticuloId;
    }
}
