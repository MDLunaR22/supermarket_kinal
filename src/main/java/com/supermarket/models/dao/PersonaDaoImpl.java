package com.supermarket.models.dao;

import com.supermarket.db.Conexion;
import com.supermarket.models.domain.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.models.idao.IPersonaDao;

/**
 *
 * @author Walter Gabriel Reyes Peralta
 * @date 4/09/2022
 * @time 11:57:57
 *
 * IN5BV
 */
public class PersonaDaoImpl implements IPersonaDao {

    private static final String SQL_SELECT = "SELECT id, primer_nombre, segundo_nombre, tercer_nombre, primer_apellido, segundo_apellido, correo, telefono, direccion FROM personas";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Persona persona = null;
    private List<Persona> listaPersonas = new ArrayList<>();
    
    @Override
    public List<Persona> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                persona = new Persona(
                        rs.getInt("id"), 
                        rs.getString("primer_nombre"), 
                        rs.getString("segundo_nombre"), 
                        rs.getString("tercer_nombre"), 
                        rs.getString("primer_apellido"), 
                        rs.getString("segundo_apellido"), 
                        rs.getString("correo"), 
                        rs.getString("telefono"), 
                        rs.getString("direccion"));                
                listaPersonas.add(persona);
                System.out.println(persona.toString());
            }
        } catch (SQLException e) {
            System.err.println("SE PRODUJO UN ERROR AL INTENTAR LISTAR LOS PERSONAS");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaPersonas;
    }
    
    @Override
    public int add(Persona persona) {
        return 0;
    }
    
    @Override
    public int update(Persona persona) {
        return 0;
    }
    
    @Override
    public int delete(Persona persona) {
        return 0;
    }
}
