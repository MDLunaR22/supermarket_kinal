



package com.supermarket.models.dao;

/**
 *
 * @author Marvin Moises Mazariegos Toyom
 * @date 6/09/2022
 * @time 22:15:12
 */

import com.supermarket.db.Conexion;
import com.supermarket.models.domain.Cliente;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.models.idao.IClienteDao;



public class ClienteDaoImpl implements IClienteDao {
    
    private static final String SQL_SELECT = "SELECT nit, persona_id, usuario_id from clientes";
    private Connection con = null;
    private PreparedStatement  pstmt= null;
    private ResultSet rs = null;
    private Cliente clientes = null;
    private List <Cliente> listadeClientes = new ArrayList<>();
    
     @Override
    public List<Cliente> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();            
            while(rs.next()){
                clientes = new Cliente(
                        rs.getString("nit"),
                        rs.getInt("persona_id"),
                        rs.getString("usuario_id")
                );
                listadeClientes.add(clientes);
                System.out.println(clientes.toString());
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
        
        return listadeClientes;
    }



 

    @Override
    public int add(Cliente clientes) {
        return 0;
    }

    @Override
    public int update(Cliente clientes) {
        return 0;
    }

    @Override
    public int delete(Cliente clientes) {
        return 0;
    }

  
    
}
