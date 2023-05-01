package com.supermarket.models.dao;

/**
 *
 * @author Werner Obdulio Emmanuel Tuj Chacom
 * @date 6/09/2022
 * @time 22:15:12
 */

import com.supermarket.db.Conexion;
import com.supermarket.models.domain.Categoria;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.models.idao.ICategoriaDao;



public class CategoriaDaoImpl implements ICategoriaDao {
    
    private static final String SQL_SELECT = "SELECT id, categoria FROM categorias";
    private static final String SQL_DELETE = "DELETE FROM categorias WHERE id = ?";
    private static final String SQL_INSERT = "INSERT INTO categorias (categoria) VALUES (?)";
    private static final String SQL_SELECT_BY_ID = "SELECT id, categoria FROM categorias WHERE id = ?";
    private static final String SQL_UPDATE = "UPDATE categorias SET categoria = ? WHERE id = ?";
    
    private Connection con = null;
    private PreparedStatement  pstmt= null;
    private ResultSet rs = null;
    private Categoria categorias = null;
    private List<Categoria> listaDeCategorias = new ArrayList<>();
    
    @Override
    public List<Categoria> getAll() {
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();            
            while(rs.next()){
                categorias = new Categoria (
                        rs.getInt("id"), 
                        rs.getString("categoria")
                );
                listaDeCategorias.add(categorias);
            }
            
            //...
        } catch (SQLException e){
            System.err.println("Se produjo un error al intentar listar las categorias");
            e.printStackTrace(System.out);
        } catch (Exception e){
            e.printStackTrace(System.out);
        } finally{
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        
        return listaDeCategorias;
    }



   @Override
    public int add(Categoria categorias) {
        int rows = 0;
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_INSERT);
            pstmt.setString(1, categorias.getCategoria());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Se produjo un error al intentar insertar el registro " + categorias.getId());
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
    public int delete(Categoria categorias) {
        int rows = 0;
        
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, categorias.getId());
            System.out.println(pstmt.toString());
            rows = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Se produjo un error al intentar eliminar el registro con el id " + categorias.getId());
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return rows;
    }
    
    @Override
    public Categoria get(Categoria categoria){
        try{
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setInt(1, categoria.getId());
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
        return categoria;
    }

   @Override
    public int update(Categoria categoria) {
     
    int rows = 0;
    
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_UPDATE);
            pstmt.setInt(1, categoria.getId());
            pstmt.setString(2, categoria.getCategoria());
            
            System.out.print(rows);
            
        } catch (SQLException e) {
            System.err.println("Se produjo un errror al intentar actualizar el siguente registro" + categoria);
            e.printStackTrace(System.out);
        }catch(Exception e) {
          e.printStackTrace(System.out);
        } finally {
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        
      return rows;
    
    }
    
}

