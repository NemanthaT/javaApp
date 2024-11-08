package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//import com.mysql.jdbc.Connection;

public class DBconnect {
    public static void main(String[] args) {
        
        try {
            // Use the updated MySQL driver class name
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Update the URL format
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stmgtsis", "root", "");

            // Connection successful message
            JOptionPane.showMessageDialog(null, "Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace to console
            JOptionPane.showMessageDialog(null, "Connection failed: " + e.getMessage());
        }
    }
}
