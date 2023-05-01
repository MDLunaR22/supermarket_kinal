package com.supermarket.models.domain;

/**
 *
 * @author Marvin Moises Mazariegos Toyom
 * @date 7/09/2022
 * @time 01:18:21
 */
public class Proveedor {

    private int id;
    private String nombre;
    private String nombreContacto;
    private String numeroContacto;

    public Proveedor() {
    }

    public Proveedor(int id) {
        this.id = id;
    }

    public Proveedor(String nombre, String nombreContacto, String numeroContacto) {
        this.nombre = nombre;
        this.nombreContacto = nombreContacto;
        this.numeroContacto = numeroContacto;

    }

    public Proveedor(int id, String nombre, String nombreContacto, String numeroContacto) {
        this.id = id;
        this.nombre = nombre;
        this.nombreContacto = nombreContacto;
        this.numeroContacto = numeroContacto;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", nombre=" + nombre + ", nombreContacto=" + nombreContacto + ", numeroContacto=" + numeroContacto + '}';
    }

}
