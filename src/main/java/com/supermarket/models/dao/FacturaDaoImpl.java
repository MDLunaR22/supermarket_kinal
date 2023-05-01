package com.supermarket.models.dao;

/**
 *
 * @author Marvin David Luna Ramirez
 * Codigo Tecnico: IN5BV
 *
 */

import com.supermarket.db.Conexion;
import com.supermarket.models.idao.IFacturaDao;
import com.supermarket.models.domain.Factura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


public class FacturaDaoImpl implements IFacturaDao {
    
    private static final String SQL_SELECT = "SELECT no_factura, serie, fecha, empleado_id, cliente_id, venta_articulo_id FROM facturas;";
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Factura facturas = null;
    private List<Factura> listaFacturas = new ArrayList<>();

    @Override
    public List<Factura> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                facturas = new Factura(
                        rs.getInt("no_factura"),
                        rs.getString("serie"),
                        rs.getDate("fecha").toLocalDate(),
                        rs.getString("empleado_id"),
                        rs.getString("cliente_id"),
                        rs.getInt("venta_articulo_id")
                );
                listaFacturas.add(facturas);
                System.out.println(facturas.toString());
            }
            
            
        } catch (SQLException e) {
            System.err.println("SE PRODUJO UN ERROR AL INTENTAR LISTAR LOS ESTUDIANTES");
            e.printStackTrace(System.out);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);

        }
        return listaFacturas;
        
    }  

    @Override
    public int add(Factura factura) {
        return 0;
    }

    @Override
    public int update(Factura factura) {
        return 0;
    }

    @Override
    public int delete(Factura factura) {
        return 0;
    }
    
}
