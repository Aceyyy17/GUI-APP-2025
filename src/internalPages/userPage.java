/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package internalPages;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import mainApp.patientForm;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author PC11
 */
public class userPage extends javax.swing.JInternalFrame {

    /** Creates new form userPage */
    public userPage() {
        initComponents();
        displayData();
        
     this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0 ));
    BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
    bi.setNorthPane(null);
    
    search.setOpaque(false);
    search.setBackground(new Color(0,0,0,0));
    }
    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_patient");
            patient_table.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
    
    
    
    
    Color navColor = new Color(153,153,255);
    Color headerColor = new Color(255,102,0);
    Color bodyColor = new Color(0,153,204);
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        search_button = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patient_table = new javax.swing.JTable();
        refresh = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("PATIENT");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 100, 31);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        delete.setBackground(new java.awt.Color(153, 153, 255));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DELETE");
        delete.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 80, 30));

        edit.setBackground(new java.awt.Color(153, 153, 255));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EDIT");
        edit.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 80, 30));

        add.setBackground(new java.awt.Color(153, 153, 255));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD");
        add.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));

        search.setBackground(new java.awt.Color(255, 102, 0));
        search.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 190, 30));

        search_button.setBackground(new java.awt.Color(153, 153, 255));
        search_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_buttonMouseExited(evt);
            }
        });
        search_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SEARCH");
        search_button.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, 30));

        jScrollPane2.setViewportView(patient_table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 680, 270));

        refresh.setBackground(new java.awt.Color(153, 153, 255));
        refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REFRESH");
        refresh.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
       edit.setBackground(bodyColor);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
       edit.setBackground(navColor);
    }//GEN-LAST:event_editMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(bodyColor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(navColor);
    }//GEN-LAST:event_addMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(bodyColor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
       delete.setBackground(navColor);
    }//GEN-LAST:event_deleteMouseExited

    private void search_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseEntered
       search_button.setBackground(bodyColor);
    }//GEN-LAST:event_search_buttonMouseEntered

    private void search_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseExited
        search_button.setBackground(navColor);
    }//GEN-LAST:event_search_buttonMouseExited

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        
        patientForm pf = new patientForm();
        pf.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_addMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
         refresh.setBackground(bodyColor);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setBackground(navColor);
    }//GEN-LAST:event_refreshMouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
       int rowindex =  patient_table.getSelectedRow();
       if(rowindex < 0){
           JOptionPane.showMessageDialog(null, "Please Select an item");
       }else{
           TableModel model = patient_table.getModel();
           patientForm pf = new patientForm();
           pf.p_id.setText(""+model.getValueAt(rowindex, 0));
           pf.p_fname.setText(""+model.getValueAt(rowindex, 1));
           pf.p_lname.setText(""+model.getValueAt(rowindex, 2));
           pf.p_age.setText(""+model.getValueAt(rowindex, 3));
           pf.p_status.setSelectedItem(model.getValueAt(rowindex, 4));
           pf.p_address.setText(model.getValueAt(rowindex, 5).toString());
           pf.p_pnumber.setText(model.getValueAt(rowindex, 6).toString());
           pf.p_email.setText(model.getValueAt(rowindex, 7).toString());
           pf.gender = model.getValueAt(rowindex, 8).toString();
           pf.setVisible(true);
           JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
           mainFrame.dispose();
       }
    }//GEN-LAST:event_editMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patient_table;
    private javax.swing.JPanel refresh;
    private javax.swing.JTextField search;
    private javax.swing.JPanel search_button;
    // End of variables declaration//GEN-END:variables

}
