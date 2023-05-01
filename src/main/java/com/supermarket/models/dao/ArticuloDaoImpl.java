package com.supermarket.models.dao;

import com.supermarket.db.Conexion;
import com.supermarket.models.domain.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ArticuloDaoImpl {
    
    private static final String SQL_SELECT = "SELECT from proveedores";
    private Connection con = null;
    private PreparedStatement  pstmt= null;
    private ResultSet rs = null;
    private Articulo articulos = null;
    private List <Articulo> listadeArticulos = new ArrayList<>();
    
    public List<Articulo> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();            
            while(rs.next()){
                articulos = new Articulo(rs.getString("descripcion"),rs.getInt("valor_unitario"), rs.getDouble("total_compra"), rs.getInt("stock"), rs.getDouble("total_compra"), rs.getInt("valor_unitario"), rs.getDouble("total_compra"), rs.getInt("provedor_id"),rs.getInt("valor_unitario"), rs.getDouble("total_compra"), rs.getInt("categora_id"));
                listadeArticulos.add(articulos);
                
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
        
        return listadeArticulos;
    }



 

    public int add(Articulo articulos) {
        return 0;
    }

    public int update(Articulo articulos) {
        return 0;
    }

 
    public int delete(Articulo articulos) {
        return 0;
    }

    
}
