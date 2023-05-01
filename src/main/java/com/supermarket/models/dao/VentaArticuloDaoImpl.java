package com.supermarket.models.dao;

/**
 *
 * @author Werner Obdulio Emmanuel Tuj Chacom
 * @date 6/09/2022
 * @time 22:15:12
 */

import com.supermarket.db.Conexion;
import com.supermarket.models.domain.VentaArticulo;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.models.idao.IVentaArticuloDao;



public class VentaArticuloDaoImpl implements IVentaArticuloDao {
    
    private static final String SQL_SELECT = "SELECT id, precio, cantidad, total, articulo_id FROM ventas_articulos";
    private static final String SQL_INSERT = "INSERT INTO ventas_articulos (precio, cantidad, total, articulo_id) VALUES (?, ?, ?, ?)";
    private static final String SQL_DELETE = "DELETE FROM ventas_articulos WHERE id = ?";
    private static final String SQL_SELECT_BY_ID = "SELECT id, precio, cantidad, total, articulo_id FROM ventas_articulos WHERE id=?";
    
    private Connection con = null;
    private PreparedStatement  pstmt= null;
    private ResultSet rs = null;
    private VentaArticulo ventaArticulos = null;
    private List <VentaArticulo> listaDeVentaArticulos = new ArrayList<>();
    
    @Override
    public List<VentaArticulo> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                ventaArticulos = new VentaArticulo(
                        rs.getInt("id"),
                        rs.getDouble("precio"),
                        rs.getInt("cantidad"),
                        rs.getDouble("total"),
                        rs.getInt("articulo_id")
                );
                listaDeVentaArticulos.add(ventaArticulos);
            }
            
            //...
        } catch (SQLException e){
            System.err.println("Se produjo un error al intentar listar la venta artículos");
            e.printStackTrace(System.out);
        } catch (Exception e){
            e.printStackTrace(System.out);
        } finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        
        return listaDeVentaArticulos;
    }



   @Override
    public int add(VentaArticulo ventaArticulos) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setDouble(1, ventaArticulos.getPrecio());
            pstmt.setInt(2, ventaArticulos.getCantidad());
            pstmt.setDouble(3, ventaArticulos.getTotal());
            pstmt.setInt(4, ventaArticulos.getArticuloId());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Se produjo un error al intentar insertar el registro" + ventaArticulos.getId());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(con);
            Conexion.close(pstmt);
        }
        return rows;
    }

   @Override
    public int delete(VentaArticulo ventaArticulo) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, ventaArticulo.getId());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Se produjo un error al intentar eliminar el registro con el id " + ventaArticulo.getId());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return rows;
    }

   @Override
    public int update(VentaArticulo empleados) {
        return 0;
    }

    @Override
    public VentaArticulo get(VentaArticulo ventaArticulo) {
       try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, ventaArticulo.getId());
            System.out.println(pstmt.toString());
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                categoria = new Categoria(rs.getInt("id"), rs.getString("categoria"));
                
            }
            
            //...
        } catch (SQLException e){
            System.err.println("se produjo un error al intentar listar un empleado");
            e.printStackTrace(System.out);
        } catch (Exception e){
            e.printStackTrace(System.out);
        } finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return ventaArticulo;
    }
    
}

