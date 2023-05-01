package com.supermarket.models.idao;

import com.supermarket.models.domain.Proveedor;

import java.util.List;

/**
 *
 * @author amarv
 */
public interface IProveedorDao {

    //Listar todos los estudiantes 
    public List<Proveedor> getAll();

    //Agrgar un nuevo registro
    public int add(Proveedor proveedores);

    //Modificar un registro 
    public int update(Proveedor proveedores);

    //Eliminar un Registro 
    public int delete(Proveedor proveedores);
}
