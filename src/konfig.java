/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class konfig {
    
    private static Connection MYSQLconfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/tb2010010243";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLconfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("koneksi ke Database Gagal ");
        }
        
        return MYSQLconfig;
        
    }
    
}
