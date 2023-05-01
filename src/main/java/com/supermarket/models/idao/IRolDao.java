package com.supermarket.models.idao;



import com.supermarket.models.domain.Rol;
import java.util.List;

/**
 *
 * @author jmuy9
 */


public interface IRolDao {
   
    public List<Rol> getAll();
    
    //Agregar nuevo registro
    
    public int add(Rol roles);
    
    //Eliminar nuevo registro
    public int delete(Rol roles);
    
    //Modificar nuevo registro
    public int update(Rol roles);
    
}
