package com.supermarket.models.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Werner Obdulio Emmanuel Tuj Chacom
 * @date 13/09/2022
 * @time 22:49:23
 * 
 * Código técnico: IN5BV
 * Grupo: 2/2
 *
 **/

public class VentaArticulo {
    private int id;
    private double precio;
    private int cantidad;
    private double total;
    private int articuloId;

    public VentaArticulo() {
    }

    public VentaArticulo(int id) {
        this.id = id;
    }

    public VentaArticulo(double precio, int cantidad, double total, int articuloId) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.articuloId = articuloId;
    }

    public VentaArticulo(int id, double precio, int cantidad, double total, int articuloId) {
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = total;
        this.articuloId = articuloId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getArticuloId() {
        return articuloId;
    }

    public void setArticuloId(int articuloId) {
        this.articuloId = articuloId;
    }

    @Override
    public String toString() {
        return "VentaArticulos{" + "id=" + id + ", precio=" + precio + ", cantidad=" + cantidad + ", total=" + total + ", articuloId=" + articuloId + '}';
    }
}
