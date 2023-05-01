package com.supermarket.models.dao;

/**
 *
 * @author jmuy9
 */
import com.supermarket.db.Conexion;
import com.supermarket.models.domain.Rol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.models.idao.IRolDao;

public class RolDaoImpl implements IRolDao {

    private static final String SQL_SELECT = "SELECT id, rol FROM roles";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Rol roles = null;
    private List<Rol> listadeRoles = new ArrayList<>();

    @Override
    public List<Rol> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                roles = new Rol(
                        rs.getInt("id"),
                        rs.getString("rol")
                );
                listadeRoles.add(roles);
                System.out.println(roles.toString());

            }

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los estudiantes");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                
                if(pstmt != null){
                    pstmt.close();
                }
            }catch(SQLException e){
                e.printStackTrace(System.out);
            }
        }

        return listadeRoles;
    }

    @Override
    public int add(Rol roles
    ) {
        return 0;
    }

    @Override
    public int delete(Rol roles
    ) {
        return 0;
    }

    @Override
    public int update(Rol roles
    ) {
        return 0;
    }

}
