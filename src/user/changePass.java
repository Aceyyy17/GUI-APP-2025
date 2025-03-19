/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;


import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mainApp.loginForm;
import mainApp.patientForm;

/**
 *
 * @author PC11
 */
public class changePass extends javax.swing.JFrame {

    /**
     * Creates new form userDashBoard
     */
    public changePass() {
        initComponents();
    }
    
    Color navColor = new Color(153,153,255);
    Color headerColor = new Color(255,102,0);
    Color bodyColor = new Color(0,153,204);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        oldpass = new javax.swing.JPasswordField();
        nwhide = new javax.swing.JLabel();
        nwshow = new javax.swing.JLabel();
        newpass = new javax.swing.JPasswordField();
        conhide = new javax.swing.JLabel();
        conshow = new javax.swing.JLabel();
        conpass = new javax.swing.JPasswordField();
        save = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        acc_fname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        iddis = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/hidden.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        jPanel8.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 36, -1, -1));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/eye.png"))); // NOI18N
        jPanel8.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 36, -1, -1));

        oldpass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        oldpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oldpass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Current Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel8.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 50));

        nwhide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nwhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/hidden.png"))); // NOI18N
        nwhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nwhideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nwhideMouseReleased(evt);
            }
        });
        jPanel8.add(nwhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 134, -1, 30));

        nwshow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nwshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/eye.png"))); // NOI18N
        jPanel8.add(nwshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 134, -1, 30));

        newpass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        newpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "New Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel8.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 300, 50));

        conhide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/hidden.png"))); // NOI18N
        conhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conhideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                conhideMouseReleased(evt);
            }
        });
        jPanel8.add(conhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 196, -1, -1));

        conshow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/eye.png"))); // NOI18N
        jPanel8.add(conshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 196, -1, -1));

        conpass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        conpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        conpass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel8.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 300, 50));

        save.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("SAVE");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        jPanel8.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 66, -1));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 710, 240));

        jPanel9.setBackground(new java.awt.Color(0, 153, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalPages/user.png"))); // NOI18N
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 120));

        acc_lname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_lname.setText("USER");
        jPanel10.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 20));

        acc_fname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_fname.setText("USER");
        jPanel10.add(acc_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 20));

        jPanel9.add(jPanel10);
        jPanel10.setBounds(440, 0, 140, 160);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("CHANGE PASSWORD");
        jPanel9.add(jLabel1);
        jLabel1.setBounds(50, 70, 240, 31);

        iddis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iddis.setText("ID: ");
        jPanel9.add(iddis);
        iddis.setBounds(580, 140, 80, 20);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BACK");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel6);
        jLabel6.setBounds(640, 0, 70, 31);

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session ses = Session.getInstance();
       iddis.setText("USER ID: "+ses.getUid());
    }//GEN-LAST:event_formWindowActivated

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
    
        try {
    dbConnector dbc = new dbConnector();
    Session ses = Session.getInstance();
    
    String query = "SELECT * FROM tbl_user WHERE u_id = '" + ses.getUid() + "'";
    ResultSet rs = dbc.getData(query);
    
    if (rs.next()) {
            String olddbpass = rs.getString("u_password");
            String oldhash = passwordHasher.hashPassword(oldpass.getText()); 
        
        if (olddbpass.equals(oldhash)) {
            String newPassString = new String(newpass.getPassword());
            String conPassString = new String(conpass.getPassword());
            
            if (!newPassString.equals(conPassString)) {
                JOptionPane.showMessageDialog(this, "Your Password Do not Match!");
            } else {
            String npass = passwordHasher.hashPassword(newPassString);
            dbc.updateData("UPDATE tbl_user SET u_password = '" + npass + "'");

            JOptionPane.showMessageDialog(null, "Password Updated Successfully!");

            loginForm lf = new loginForm();
            lf.setVisible(true);
            this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Old Password is Incorrect!");
        }
    }
} catch (SQLException | NoSuchAlgorithmException ex) {
    System.out.println("" + ex);
}

    
    
    
    }//GEN-LAST:event_saveMouseClicked

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
      accountDetails accd = new accountDetails();   
      accd.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        oldpass.setEchoChar((char) 0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        show.setVisible(false);
        hide.setVisible(true);
        oldpass.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void nwhideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nwhideMousePressed
       nwshow.setVisible(false);
       nwhide.setVisible(true);
       newpass.setEchoChar((char) 0);
    }//GEN-LAST:event_nwhideMousePressed

    private void nwhideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nwhideMouseReleased
        nwshow.setVisible(false);
        nwhide.setVisible(true);
        newpass.setEchoChar('*');
    }//GEN-LAST:event_nwhideMouseReleased

    private void conhideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conhideMousePressed
        conshow.setVisible(false);
        conhide.setVisible(true);
        conpass.setEchoChar((char) 0);
    }//GEN-LAST:event_conhideMousePressed

    private void conhideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conhideMouseReleased
        conshow.setVisible(false);
        conhide.setVisible(true);
        conpass.setEchoChar('*');
    }//GEN-LAST:event_conhideMouseReleased

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
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_fname;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel conhide;
    private javax.swing.JPasswordField conpass;
    private javax.swing.JLabel conshow;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel iddis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JLabel nwhide;
    private javax.swing.JLabel nwshow;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JLabel save;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
