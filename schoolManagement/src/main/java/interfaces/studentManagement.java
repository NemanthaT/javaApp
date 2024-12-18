/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;
import codes.dBConnector; //dB connect
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author navindu
 */
public class studentManagement extends javax.swing.JFrame {

    /**
     * Creates new form studentManagement
     */
    Connection connection = null;
    Statement statement = null;
    
    public studentManagement() {
        initComponents();
        connection = dBConnector.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        genderCombo = new javax.swing.JComboBox<>();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        sField = new javax.swing.JTextField();
        sBtn = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        viewAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 590));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Student Name");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 22, 93, -1));

        jLabel2.setText("Age");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 62, 87, -1));

        jLabel3.setText("Gender");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 103, 69, -1));

        jLabel4.setText("Contact");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 575, 47, -1));
        jPanel4.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 19, 229, -1));
        jPanel4.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 59, 229, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 572, -1, -1));

        jLabel5.setText("Address");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 148, 47, -1));

        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        jPanel4.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 142, 229, -1));

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        genderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboActionPerformed(evt);
            }
        });
        jPanel4.add(genderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 100, -1, -1));

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel4.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 19, -1, -1));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel4.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 59, -1, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 100, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 510, 190));

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Student Name", "Age", "Gender", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 850, 240));

        jPanel5.setBackground(new java.awt.Color(102, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 660, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 820, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        jPanel3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sFieldActionPerformed(evt);
            }
        });
        jPanel3.add(sField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 519, -1));

        sBtn.setText("Search");
        sBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        clearAll.setText("Clear All");
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });
        jPanel3.add(clearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 760, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel6.setText("Student Manager");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 200, -1));

        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        closeBtn.setText("X");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 50, 40));

        viewAll.setText("View All");
        viewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllActionPerformed(evt);
            }
        });
        jPanel1.add(viewAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void sFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sFieldActionPerformed

    private void sBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sBtnActionPerformed
        // TODO add your handling code here:
        String name;
        name = sField.getText();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        String sqls = "SELECT * FROM student WHERE Name LIKE \'%" + name + "%\'";
        try{
            model.setRowCount(0);
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqls);
            JOptionPane.showMessageDialog(null,"Result(s) found");
            
            while(result.next()){
                int id = result.getInt("StudentID");
                String nam = result.getString("Name");
                String age = result.getString("Age");
                String Gender = result.getString("Gender");
                String Address = result.getString("Address");

                model.addRow(new Object[]{id, nam, age, Gender,Address});
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_sBtnActionPerformed

    private void genderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        adminDashboard a = new adminDashboard();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void viewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        String sqls = "SELECT * FROM student";
        try{
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqls);
            JOptionPane.showMessageDialog(null,"Result(s) found");

            while(result.next()){
                int id = result.getInt("StudentID");
                String nam = result.getString("Name");
                String age = result.getString("Age");
                String Gender = result.getString("Gender");
                String Address = result.getString("Address");

                model.addRow(new Object[]{id, nam, age, Gender,Address});
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_viewAllActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        int id ;
        String name;
        int age=0;
        String Gender;
        String Address;

        name = nameField.getText();
        age = Integer.parseInt(ageField.getText());
        Gender = (String) genderCombo.getSelectedItem();
        Address = addressField.getText();

        String sqls = "INSERT INTO student (Name,Age, Gender,Address) VALUES (\'"+name+"\', \'"+age+"\', \'"+Gender+"\', \'"+Address+"\')";

        if((!name.isEmpty()) && (age!=0) && (!Gender.isEmpty())&&(!Address.isEmpty())){
            try{
                statement = connection.createStatement();
                statement.executeUpdate(sqls);
                System.out.println("Data inserted successfully");
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
            }
            catch(Exception e){
                System.out.println("Data insertion failed");
                JOptionPane.showMessageDialog(null,e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter all details");
        }
    }//GEN-LAST:event_insertActionPerformed

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        sField.setText("");
        nameField.setText("");
        ageField.setText("");
        addressField.setText("");
        genderCombo.setSelectedItem("Student");
    }//GEN-LAST:event_clearAllActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String name;
        int age=0;
        String Gender;
        String Address;

        name = nameField.getText();
        age = Integer.parseInt(ageField.getText());
        Gender = (String) genderCombo.getSelectedItem();
        Address = addressField.getText();

        if(name!=null){
            String sqls = "UPDATE student SET Age = \'" + age + "\', Gender = \'" + Gender + "\', Address = \'" + Address +"\' WHERE Name LIKE \'" + name + "\'";

            try{
                statement = connection.createStatement();
                statement.executeUpdate(sqls);
                System.out.println("Data updated successfully");
                JOptionPane.showMessageDialog(null,"Updated Successfully");
            }
            catch(Exception e){
                System.out.println("Data insertion failed");
                JOptionPane.showMessageDialog(null,e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter student name");
        }

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String name;

        name = nameField.getText();

        String sqls = "DELETE FROM student WHERE Name LIKE \'" + name + "\'";

        if(name!=null){
            try{
                statement = connection.createStatement();
                statement.executeUpdate(sqls);
                System.out.println("Data deleted successfully");
                JOptionPane.showMessageDialog(null,"Deleted Successfully");
            }
            catch(Exception e){
                System.out.println("Data deletion failed");
                JOptionPane.showMessageDialog(null,e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter course name");
        }
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton clearAll;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton sBtn;
    private javax.swing.JTextField sField;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    private javax.swing.JButton viewAll;
    // End of variables declaration//GEN-END:variables
}
