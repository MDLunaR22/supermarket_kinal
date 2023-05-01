



package com.supermarket.models.dao;

/**
 *
 * @author Marvin Moises Mazariegos Toyom
 * @date 6/09/2022
 * @time 22:15:12
 */

import com.supermarket.db.Conexion;
import com.supermarket.models.domain.Proveedor;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.models.idao.IProveedorDao;



public class ProveedorDaoImpl implements IProveedorDao {
    
    private static final String SQL_SELECT = "SELECT id, nombre, nombre_contacto, numero_contacto from proveedores";
    private Connection con = null;
    private PreparedStatement  pstmt= null;
    private ResultSet rs = null;
    private Proveedor proveedores = null;
    private List <Proveedor> listaProvedores = new ArrayList<>();
    
    public List<Proveedor> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();            
            while(rs.next()){
                proveedores = new Proveedor(
                        rs.getInt("id"), 
                        rs.getString("nombre"), 
                        rs.getString("nombre_contacto"), 
                        rs.getString("numero_contacto")
                );
                listaProvedores.add(proveedores);
                
            }
            
            //...
        } catch (SQLException e){
            System.err.println("Se produjo un error al intentar listar los clientes");
            e.printStackTrace(System.out);
        } catch (Exception e){
            e.printStackTrace(System.out);
        } finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        
        return listaProvedores;
    }



 

    public int add(Proveedor proveedores) {
        return 0;
    }

    public int update(Proveedor proveedores) {
        return 0;
    }

    public int delete(Proveedor proveedores) {
        return 0;
    }

  
    
}
