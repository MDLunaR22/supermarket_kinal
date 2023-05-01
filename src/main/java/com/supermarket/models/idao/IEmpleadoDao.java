
package com.supermarket.models.idao;

import com.supermarket.models.domain.Empleado;

import java.util.List;

/**
 *
 * @author amarv
 */
public interface IEmpleadoDao {
    
        //Listar todos los estudiantes 
    public List <Empleado> getAll();
    
    //Agrgar un nuevo registro
    public int add(Empleado empleados);
        
        //Modificar un registro 
        public int update(Empleado empleados);
        
      //Eliminar un Registro 
        public int delete(Empleado empleados);
}
