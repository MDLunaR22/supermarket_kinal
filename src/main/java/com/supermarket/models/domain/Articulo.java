/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.supermarket.models.domain;

/**
 *
 * @author USUARIO
 */
public class Articulo {

    private String descripcion;
    private int id;
    private double valor_unitario;
    private int stock;
    private double total_compra;
    private int provedor_id;
    private int categoria_id;

    public Articulo() {
    }

    public Articulo(String descripcion) {
        this.descripcion = descripcion;
    }

    public Articulo(int id, int stock, int categoria_id, int provedor_id) {
        this.id = id;
        this.categoria_id = categoria_id;
        this.provedor_id = provedor_id;

    }

    public Articulo(double valor_unitario, double total_compra) {
        this.valor_unitario = valor_unitario;
        this.total_compra = total_compra;
    }

    public Articulo(String descripcion, int id, double valor_unitario, int stock, double total_compra, int provedor_id, double aDouble1, int categoria_id, int aInt3, double aDouble2, int aInt4) {
        this.descripcion = descripcion;
        this.id = id;
        this.stock = stock;
        this.categoria_id = categoria_id;
        this.provedor_id = provedor_id;
        this.valor_unitario = valor_unitario;
        this.total_compra = total_compra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int personaId) {
        this.id = personaId;
    }

    public int getStok() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getArticulosID() {
        return provedor_id;
    }

    public void setArticulosID(int provedor_id) {
        this.id = provedor_id;
    }

    public int getCategoriaID() {
        return categoria_id;
    }

    public void setCategoriaID(int categoria_id) {
        this.id = categoria_id;

    }

    public double getValorUnitario() {
        return valor_unitario;
    }

    public void setValorUnitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public double getTotalCompra() {
        return total_compra;
    }

    public void setTotalCompra(double total_compra) {
        this.total_compra = total_compra;
    }

    @Override
    public String toString() {
        return "Articulos{" + "Descripcion: " + descripcion + ", Id= "
                + id + ", Valor por Unidad=" + valor_unitario + ", Productos en el stock "
                + stock + ", Total de compra" + total_compra + ", Proveedor" + provedor_id + ", Categoria de producto" + categoria_id + "}";
    }

}
