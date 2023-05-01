
package com.supermarket.models.idao;

/**
 *
 * @author jmuy9
 */

import com.supermarket.models.domain.Usuario;
import java.util.List;

public interface IUsuarioDao {
    public List<Usuario> getAll();
    
    //Agregar nuevo registro
    
    public int add(Usuario usuarios);
    
    //Eliminar nuevo registro
    public int delete(Usuario usuarios);
    
    //Modificar nuevo registro
    public int update(Usuario usuarios);
}
