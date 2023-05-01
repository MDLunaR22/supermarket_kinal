package com.supermarket.models.idao;


import java.util.List;
import com.supermarket.models.domain.Persona;
/**
 *
 * @author Usuario
 */
public interface IPersonaDao {
    //Listar todos los registros
    
    public List<Persona> getAll();
    
    //Agregar un nuevo registro
    
    public int add(Persona persona);
    
    //Modificar un registro
    
    public int update(Persona persona);
    
    //Eliminar un registro
    
    public int delete(Persona persona);
}
