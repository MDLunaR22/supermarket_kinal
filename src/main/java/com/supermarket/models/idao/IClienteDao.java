package com.supermarket.models.idao;

import com.supermarket.models.domain.Cliente;

import java.util.List;

/**
 *
 * @author amarv
 */
public interface IClienteDao {
    
        //Listar todos los estudiantes 
    public List <Cliente> getAll();
    
    //Agrgar un nuevo registro
    public int add(Cliente clientes);
        
        //Modificar un registro 
        public int update(Cliente clientes);
        
      //Eliminar un Registro 
        public int delete(Cliente clientes);
}
