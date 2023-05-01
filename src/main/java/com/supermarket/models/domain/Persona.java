package com.supermarket.models.domain;

/**
 *
 * @author Walter Gabriel Reyes Peralta
 * @date 4/09/2022
 * @time 12:39:11
 *
 * IN5BV
 */
public class Persona {

    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String tercerNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private String telefono;
    private String direccion;

    public Persona() {

    }

    public Persona(int id) {
        this.id = id;
    }

    public Persona(String primerNombre, String segundoNombre, String tercerNombre, String primerApellido, String segundoApellido, String correo, String telefono, String direccion) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.tercerNombre = tercerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Persona(int id, String primerNombre, String segundoNombre, String tercerNombre, String primerApellido, String segundoApellido, String correo, String telefono, String direccion) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.tercerNombre = tercerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getTercerNombre() {
        return tercerNombre;
    }

    public void setTercerNombre(String tercerNombre) {
        this.tercerNombre = tercerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", tercerNombre=" + tercerNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", correo=" + correo + ", direccion=" + direccion + '}';
    }

}
