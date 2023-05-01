package com.supermarket.models.idao;

import com.supermarket.models.domain.Categoria;

import java.util.List;

/**
 *
 * @author amarv
 */
public interface ICategoriaDao {

    //Listar todos los estudiantes 
    public List<Categoria> getAll();

    //Agrgar un nuevo registro
    public int add(Categoria categorias);

    //Modificar un registro 
    public int update(Categoria categorias);

    //Eliminar un Registro 
    public int delete(Categoria categorias);
    
    public Categoria get(Categoria categoria);
}
