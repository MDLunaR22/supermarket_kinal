package com.supermarket.models.dao;

/**
 *
 * @author jmuy9
 */
import com.supermarket.db.Conexion;
import com.supermarket.models.domain.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.supermarket.models.idao.IUsuarioDao;

public class UsuarioDaoImpl implements IUsuarioDao {

    private static final String SQL_SELECT = "SELECT usuario, password FROM usuarios";

    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Usuario usuarios = null;
    private List<Usuario> listadoUsuarios = new ArrayList<>();

    @Override
    public List<Usuario> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                usuarios = new Usuario(
                        rs.getString("usuario"),
                        rs.getString("password")
                );
                listadoUsuarios.add(usuarios);
                System.out.println(usuarios.toString());
            }

        } catch (SQLException e) {
            System.err.println("Se produjo un error al intentar listar los estudiantes");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }

        return listadoUsuarios;
    }

    @Override
    public int add(Usuario usuarios) {
        return 0;
    }

    @Override
    public int delete(Usuario usuarios) {
        return 0;
    }

    @Override
    public int update(Usuario usuarios) {
        return 0;
    }

}
