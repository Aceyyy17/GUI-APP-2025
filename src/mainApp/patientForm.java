/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainApp;

import user.userPage;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import user.userDashBoard;
import user.userDashBoard;

/**
 *
 * @author PC11
 */
public class patientForm extends javax.swing.JFrame {

    /**
     * Creates new form patientForm
     */
    public patientForm() {
        initComponents();
        
    p_id.setOpaque(false);
    p_id.setBackground(new Color(0,0,0,0));
    }
    
    Color navColor = new Color(153,153,255);
    Color headerColor = new Color(153,153,255);
    Color bodyColor = new Color(102,102,255);
    
    public String gender;

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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p_id = new javax.swing.JTextField();
        p_age = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        p_fname = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        p_status = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        p_lname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        p_address = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        p_email = new javax.swing.JTextField();
        p_pnumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("PATIENT FORM");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 170, 31);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BACK");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(632, 0, 60, 50);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        p_id.setBackground(new java.awt.Color(255, 102, 0));
        p_id.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idActionPerformed(evt);
            }
        });
        jPanel1.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 230, 30));

        p_age.setBackground(new java.awt.Color(255, 102, 0));
        p_age.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_ageActionPerformed(evt);
            }
        });
        jPanel1.add(p_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 230, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Status:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Patient ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 110, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("First Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 110, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Last Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 110, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Age:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 110, 30));

        female.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        female.setText("FEMALE");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 90, 30));

        p_fname.setBackground(new java.awt.Color(255, 102, 0));
        p_fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_fnameActionPerformed(evt);
            }
        });
        jPanel1.add(p_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 230, 30));

        male.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 90, 30));

        p_status.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed" }));
        jPanel1.add(p_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 230, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Gender:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 110, 30));

        p_lname.setBackground(new java.awt.Color(255, 102, 0));
        p_lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_lnameActionPerformed(evt);
            }
        });
        jPanel1.add(p_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 230, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Address:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 110, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Phone Number:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 110, 30));

        p_address.setBackground(new java.awt.Color(255, 102, 0));
        p_address.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_addressActionPerformed(evt);
            }
        });
        jPanel1.add(p_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 230, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Email:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 110, 30));

        p_email.setBackground(new java.awt.Color(255, 102, 0));
        p_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_emailActionPerformed(evt);
            }
        });
        jPanel1.add(p_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 230, 30));

        p_pnumber.setBackground(new java.awt.Color(255, 102, 0));
        p_pnumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        p_pnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p_pnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        p_pnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_pnumberActionPerformed(evt);
            }
        });
        jPanel1.add(p_pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_idActionPerformed

    private void p_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_ageActionPerformed

    private void p_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_fnameActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void p_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_lnameActionPerformed

    private void p_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_addressActionPerformed

    private void p_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_emailActionPerformed

    private void p_pnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_pnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_pnumberActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        userDashBoard udb = new userDashBoard();
        udb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        userPage up = new userPage();
        up.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(patientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JRadioButton male;
    public javax.swing.JTextField p_address;
    public javax.swing.JTextField p_age;
    public javax.swing.JTextField p_email;
    public javax.swing.JTextField p_fname;
    public javax.swing.JTextField p_id;
    public javax.swing.JTextField p_lname;
    public javax.swing.JTextField p_pnumber;
    public javax.swing.JComboBox<String> p_status;
    // End of variables declaration//GEN-END:variables
}
