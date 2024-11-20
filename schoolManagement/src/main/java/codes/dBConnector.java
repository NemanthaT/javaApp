/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author UserK
 */
public class dBConnector {
    
    public static Connection connection(){
    
            String connectString = "jdbc:mysql://localhost:3306/stmgtsis";
            String username = "root";
            String password = "20021213";
            Connection connection = null;
            //Database connection
            try{
                connection = DriverManager.getConnection(connectString, username, password);
                System.out.println("Connection successful");
            }
            catch(SQLException e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,e);
            }
            return connection;
    }

    
}
