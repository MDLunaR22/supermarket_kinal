
package com.supermarket.models.dao;

/**
 *
 * @author Marvin Moises Mazariegos Toyom
 * @date 6/09/2022
 * @time 22:15:12
 */

import com.supermarket.db.Conexion;
import com.supermarket.models.domain.Empleado;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.models.idao.IEmpleadoDao;



public class EmpleadoDaoImpL implements IEmpleadoDao {
    
    private static final String SQL_SELECT = "SELECT dpi, persona_id, usuario_id, rol_id from empleados";
    private Connection con = null;
    private PreparedStatement  pstmt= null;
    private ResultSet rs = null;
    private Empleado empleados = null;
    private List<Empleado> listadeEmpleados = new ArrayList<>();
    
    @Override
    public List<Empleado> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();            
            while(rs.next()){
                empleados = new Empleado(
                        rs.getString("dpi"),
                        rs.getInt("persona_id"),
                        rs.getString("usuario_id"), rs.getInt("rol_id")
                );
                listadeEmpleados.add(empleados);
                System.out.println(empleados.toString());
            }
            
            //...
        } catch (SQLException e){
            System.err.println("Se produjo un error al intentar listar los empleados");
            e.printStackTrace(System.out);
        } catch (Exception e){
            e.printStackTrace(System.out);
        } finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        
        return listadeEmpleados;
    }



   @Override
    public int add(Empleado empleados) {
        return 0;
    }



   @Override
    public int delete(Empleado empleados) {
        return 0;
    }



   @Override
    public int update(Empleado empleados) {
        return 0;
    }
    
}

