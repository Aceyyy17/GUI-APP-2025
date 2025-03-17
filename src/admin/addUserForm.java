/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.BasicStroke;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 *
 * @author PC11
 */
public class addUserForm extends javax.swing.JFrame {

    /**
     * Creates new form addUserForm
     */
    public addUserForm() {
        initComponents();
    }
    
    public static String email, uname;
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM  tbl_user WHERE u_username =   '" + un.getText() + "'  OR u_email = '" + eml.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                
                 email = resultSet.getString("u_email");
                 if(email.equals(eml.getText())){
                 JOptionPane.showConfirmDialog(null, "Email is already used!");
                 eml.setText("");
                 }
                 uname = resultSet.getString("u_username");
                 if(uname.equals(un.getText())){
                 JOptionPane.showConfirmDialog(null, "Username is already used!");
                 un.setText("");
                 }
                 return true;
            }else{
                return false;
        }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
             
    }
    
    Color hover = new Color(255,102,0);
    Color defbutton = new Color(153,153,255);
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
        panel.setBackground(hover);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
    }
    
    void buttonDefaultColor(JPanel panel){
        panel.setBackground(defbutton);
        panel.setBorder(empty);
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
        jPanel2 = new javax.swing.JPanel();
        logoBack = new javax.swing.JLabel();
        logofront = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        un = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        eml = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        ut = new javax.swing.JComboBox<>();
        us = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        addUser = new javax.swing.JButton();
        updateUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/logoback-Photoroom.png"))); // NOI18N
        jPanel2.add(logoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        logofront.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logofront.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/logo-Photoroom.png"))); // NOI18N
        jPanel2.add(logofront, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 320, 400));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/gradient color.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 320, 500));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        un.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        un.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "UserName", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel3.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 300, 50));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRATION FORM");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 270, 30));

        fn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 300, 50));

        ln.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, 50));

        eml.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eml.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eml.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        eml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emlActionPerformed(evt);
            }
        });
        jPanel3.add(eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 300, 50));

        ps.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel3.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 300, 50));

        ut.setBackground(new java.awt.Color(0, 153, 204));
        ut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        ut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Account type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        ut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                utMouseClicked(evt);
            }
        });
        jPanel3.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 300, 40));

        us.setBackground(new java.awt.Color(0, 153, 204));
        us.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        us.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "User Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        us.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usMouseClicked(evt);
            }
        });
        jPanel3.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 40));
        us.getAccessibleContext().setAccessibleName("");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        uid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        uid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uid.setText("ID: ");
        jPanel3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 20));

        addUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addUser.setText("ADD");
        addUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserMouseClicked(evt);
            }
        });
        jPanel3.add(addUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 90, 30));

        updateUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateUser.setText("UPDATE");
        updateUser.setEnabled(false);
        updateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateUserMouseClicked(evt);
            }
        });
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });
        jPanel3.add(updateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 410, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed

    }//GEN-LAST:event_fnActionPerformed

    private void utMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_utMouseClicked

    }//GEN-LAST:event_utMouseClicked

    private void usMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        usersForm uf = new usersForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void emlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emlActionPerformed

    private void addUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserMouseClicked
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || eml.getText().isEmpty() || un.getText().isEmpty() || ps.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(ps.getText().length() < 8) {

            JOptionPane.showMessageDialog(null, "Password too short. Please enter at least 8 characters above!");
            ps.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate is exist");
        }
        else{
            dbConnector dbc = new dbConnector();
            if( dbc.insertData(" INSERT INTO tbl_user ( u_fname, u_lname, u_email, u_username, u_password, u_type, u_status) "
                + "VALUES ('"+fn.getText()+"', '"+ln.getText()+"', '"+eml.getText()+"', '"+un.getText()+"', '"+ps.getText()+"', '"+ut.getSelectedItem()+"', '"+us.getSelectedItem()+"') "))
        {
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Connection Failed!");
        }
        }
    }//GEN-LAST:event_addUserMouseClicked

    private void updateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserMouseClicked
       if(fn.getText().isEmpty() || ln.getText().isEmpty() || eml.getText().isEmpty() || un.getText().isEmpty() || ps.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(ps.getText().length() < 8) {

            JOptionPane.showMessageDialog(null, "Password too short. Please enter at least 8 characters above!");
            ps.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate is exist");
        }
        else{
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE tbl_user SET u_fname = '"+fn.getText()+"', u_lname = '"+ln.getText()+"', u_email = '"+eml.getText()+"', u_username = '"+un.getText()+"', "
                + "u_password = '"+ps.getText()+"', u_type = '"+ut.getSelectedItem()+"', "
                        + " u_status = '"+us.getSelectedItem()+"' WHERE u_id = '"+uid.getText()+"' ");
        }
       
       usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_updateUserMouseClicked

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateUserActionPerformed

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
            java.util.logging.Logger.getLogger(addUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addUser;
    public javax.swing.JTextField eml;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ln;
    private javax.swing.JLabel logoBack;
    private javax.swing.JLabel logofront;
    public javax.swing.JPasswordField ps;
    public javax.swing.JLabel uid;
    public javax.swing.JTextField un;
    public javax.swing.JButton updateUser;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
