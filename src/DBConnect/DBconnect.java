/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

/**
 *
 * @author Isuru SanDamal
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class DBconnect {
    public static Connection DBconnect() throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306/db";
        String username = "root";
        String password = "root";
        
        System.out.println("Connecting database....");
        Connection connection = null;
        try{
            System.out.println("Connecting database....");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("-------Connected");
            return connection;
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void DBClose(Connection conn) throws SQLException{
        
            conn.close();
            System.out.println("Database Closed....");
        
    }
    public static void main(String[] args) throws SQLException {
        
        DBClose(DBconnect());
    }
}
