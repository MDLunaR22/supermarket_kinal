package com.supermarket.models.idao;

import com.supermarket.models.domain.VentaArticulo;

import java.util.List;

/**
 *
 * @author amarv
 */
public interface IVentaArticuloDao {

    //Listar todos los estudiantes 
    public List<VentaArticulo> getAll();

    //Agrgar un nuevo registro
    public int add(VentaArticulo empleados);

    //Modificar un registro 
    public int update(VentaArticulo empleados);

    //Eliminar un Registro 
    public int delete(VentaArticulo empleados);
    
    public VentaArticulo get(VentaArticulo ventaArticulo);
}
