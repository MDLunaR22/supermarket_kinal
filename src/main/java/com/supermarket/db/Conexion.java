package com.supermarket.db;

/**
 *
 * @author Marvin David Luna Ramirez
 * @date 6/09/2022
 * @time 09:37:10
 * Codigo Tecnico: IN5BV
 * Grupo: 2 (lunes)
 *
 */

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static final String HOST = "localhost";
    private static final String PORT = "3306";
    private static final String DB = "db_supermarket_kinal";
    private static final String USER = "kinal";
    private static final String PASS = "admin";
    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB +"?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    private static BasicDataSource instanceBDS;
    
    public static Connection getConnection() throws SQLException{
        return getInstanceDS().getConnection();
    }
    
    public static DataSource getInstanceDS(){
        if(instanceBDS == null){
            instanceBDS = new BasicDataSource();
            instanceBDS.setUrl(URL);
            instanceBDS.setUsername(USER);
            instanceBDS.setPassword(PASS);
            instanceBDS.setInitialSize(25);
        }
        return instanceBDS;
    }
    
     public static void close(ResultSet rs){
        try{
            
            if(rs != null){
                rs.close();
            }
        }catch(SQLException e){
            System.err.println("SE PRODUJO UN ERROR AL INTENTAR CERRAR EL OBJETO \"ResultSet\"");
            e.printStackTrace(System.out);
        }
    }
    
    
    public static void close(PreparedStatement pstmt){
        try{
            
            if(pstmt != null){
                pstmt.close();
                
            }
        }catch(SQLException e){
            System.err.println("SE PRODUJO UN ERROR AL INTENTAR CERRAR EL OBJETO \"PreparedStatement\"");
            e.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection con){
        try{
            
            if(con != null){
                con.close();
            }
        }catch(SQLException e){
            System.err.println("SE PRODUJO UN ERROR AL INTENTAR CERRAR EL OBJETO \"Connection\"");
            e.printStackTrace(System.out);
        }
    }
    
}
