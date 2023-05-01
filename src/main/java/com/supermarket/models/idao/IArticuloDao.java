
package com.supermarket.models.idao;

import com.supermarket.models.domain.Articulo;
import java.util.List;

/**
 *
 * @author amarv
 */
public interface IArticuloDao {
    
        //Listar todos los estudiantes 
    public List <Articulo> getAll();
    
    //Agrgar un nuevo registro
    public int add(Articulo articulos);
        
        //Modificar un registro 
        public int update(Articulo articulos);
        
      //Eliminar un Registro 
        public int delete(Articulo articulos);
}
