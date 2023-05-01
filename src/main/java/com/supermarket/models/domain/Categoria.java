package com.supermarket.models.domain;

/**
 *
 * @author Werner Obdulio Emmanuel Tuj Chacom
 * @date 13/09/2022
 * @time 09:46:13
 * 
 * Código técnico: IN5BV
 * Grupo: 2/2
 *
 **/
public class Categoria {
    private int id;
    private String categoria;
    
    public Categoria() {
        
    }
    
    public Categoria(int id) {
        this.id = id;
    }
    
    public Categoria (String categoria) {
        this.categoria = categoria;
    }

    public Categoria(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Categorias{" + "id=" + id + ", categoria=" + categoria + '}';
    }
    
}
