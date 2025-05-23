/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import mainApp.*;

/**
 *
 * @author PC11
 */
public class adminDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashBoard
     */
    public adminDashBoard() {
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

        jPanel8 = new javax.swing.JPanel();
        reports = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        manageUser = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        setttings = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reports.setBackground(new java.awt.Color(255, 102, 0));
        reports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        reports.setPreferredSize(new java.awt.Dimension(160, 160));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsMouseExited(evt);
            }
        });
        reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reports.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 100));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("REPORTS");
        reports.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 20));

        jPanel8.add(reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 140, 140));

        manageUser.setBackground(new java.awt.Color(255, 102, 0));
        manageUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        manageUser.setPreferredSize(new java.awt.Dimension(160, 160));
        manageUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageUserMouseExited(evt);
            }
        });
        manageUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("MANAGE USER");
        manageUser.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 20));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalPages/manage-user.png"))); // NOI18N
        manageUser.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 90));

        jPanel8.add(manageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 140, 140));

        setttings.setBackground(new java.awt.Color(255, 102, 0));
        setttings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setttings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setttingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setttingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setttingsMouseExited(evt);
            }
        });
        setttings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/setting.png"))); // NOI18N
        setttings.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("SETTINGS");
        setttings.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 20));

        jPanel8.add(setttings, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 140, 140));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 700, 240));

        jPanel9.setBackground(new java.awt.Color(0, 153, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/internalPages/user.png"))); // NOI18N
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 120));

        acc_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("ADMIN");
        jPanel10.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 20));

        acc_lname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_lname.setText("ADMIN");
        jPanel10.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 20));

        jPanel9.add(jPanel10);
        jPanel10.setBounds(440, 0, 140, 160);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("ADMIN DASHBOARD");
        jPanel9.add(jLabel1);
        jLabel1.setBounds(30, 60, 240, 31);

        LOGOUT.setBackground(new java.awt.Color(0, 153, 204));
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
        });
        LOGOUT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BACK");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        LOGOUT.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 100, 40));

        jPanel9.add(LOGOUT);
        LOGOUT.setBounds(590, 10, 100, 30);

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 160));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseEntered
        reports.setBackground(navColor);
    }//GEN-LAST:event_reportsMouseEntered

    private void reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseExited
        reports.setBackground(headerColor);
    }//GEN-LAST:event_reportsMouseExited

    private void manageUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserMouseEntered
        manageUser.setBackground(navColor);
    }//GEN-LAST:event_manageUserMouseEntered

    private void manageUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserMouseExited
        manageUser.setBackground(headerColor);
    }//GEN-LAST:event_manageUserMouseExited

    private void setttingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setttingsMouseEntered
        setttings.setBackground(navColor);
    }//GEN-LAST:event_setttingsMouseEntered

    private void setttingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setttingsMouseExited
         setttings.setBackground(headerColor);
    }//GEN-LAST:event_setttingsMouseExited

    private void setttingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setttingsMouseClicked
        
    }//GEN-LAST:event_setttingsMouseClicked

    private void manageUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserMouseClicked
       usersForm uf = new usersForm();
       uf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_manageUserMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session ses = Session.getInstance(); 
        if(ses.getUid() == 0){
            JOptionPane.showMessageDialog(null, "No account, login first!");
            loginForm lf = new loginForm();
            lf.setVisible(true); 
            this.dispose(); 
        }else{
             acc_name.setText(""+ses.getFname());
             acc_lname.setText(""+ses.getLname());
        }
        
       
    }//GEN-LAST:event_formWindowActivated

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked

        
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
        dashBoard dash = new dashBoard();   
        dash.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(adminDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LOGOUT;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel manageUser;
    private javax.swing.JPanel reports;
    private javax.swing.JPanel setttings;
    // End of variables declaration//GEN-END:variables
}
