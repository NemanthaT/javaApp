/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author UserK
 */
public class dBConnector {

        
        public static void main(String[] args) {
            String connectString = "jdbc:mysql://localhost:3306/car?useSSL=false";
            String username = "root";
            String password = "";
            //Database connection
            try{
                Connection connection = DriverManager.getConnection(connectString, username, password);
                System.out.println("Connection successful");
            }
            catch(SQLException e){
                System.out.println(e);
            }
        }
    
}
