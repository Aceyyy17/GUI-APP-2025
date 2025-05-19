/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
    
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path){
      File file = new File(path);
      String fileName = file.getName();
      
      Path filePath = Paths.get("src/userimages", fileName);
      boolean fileExist = Files.exists(filePath);
    
      if(fileExist){
      return 1;
      }else {
      return 0;
      }
    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
    
    public static String email, uname;
    
    public boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        
        if (!isValidEmail(eml.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid email format! Please enter a valid email.");
            eml.setText("");
            return true;
        }
        
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

    public boolean updateCheck(){
        dbConnector dbc = new dbConnector();
        
        if (!isValidEmail(eml.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid email format! Please enter a valid email.");
            eml.setText("");
            return true;
        }
        try{
            String query = "SELECT * FROM  tbl_user WHERE (u_username =   '" + un.getText() + "'  OR u_email = '" + eml.getText() + "') AND u_id != '"+uid.getText()+"'";
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
        remove = new javax.swing.JButton();
        select = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        un = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        eml = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        us = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        addUser = new javax.swing.JButton();
        updateUser = new javax.swing.JButton();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        ps = new javax.swing.JPasswordField();
        userId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        remove.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        remove.setText("REMOVE");
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 100, 30));

        select.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        select.setText("SELECT");
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel2.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 100, 30));

        jPanel4.setLayout(null);
        jPanel4.add(image);
        image.setBounds(10, 10, 220, 250);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 240, 270));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/gradient color.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 320, 500));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        un.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        un.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "UserName", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel3.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 300, 50));

        fn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 300, 50));

        ln.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, 50));

        eml.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eml.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eml.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        eml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emlActionPerformed(evt);
            }
        });
        jPanel3.add(eml, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 300, 50));

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
        jPanel3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 30, 20));

        addUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addUser.setText("ADD");
        addUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserMouseClicked(evt);
            }
        });
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
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
        jPanel3.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 294, -1, 30));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainApp/eye.png"))); // NOI18N
        jPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 294, -1, 30));

        ps.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        ps.setEnabled(false);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        jPanel3.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 300, 50));

        userId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userId.setText("User ID:");
        jPanel3.add(userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 20));

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
        
    }//GEN-LAST:event_addUserMouseClicked

    private void updateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserMouseClicked
    
    }//GEN-LAST:event_updateUserMouseClicked

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
            if(fn.getText().isEmpty() || ln.getText().isEmpty() || eml.getText().isEmpty() || un.getText().isEmpty() || ps.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "All fields are required!");
            }else if(ps.getText().length() < 8) {

                JOptionPane.showMessageDialog(null, "Password too short. Please enter at least 8 characters above!");
                ps.setText("");
            }else if(updateCheck()){
                System.out.println("Duplicate is exist");
            }
            else{

            dbConnector dbc = new dbConnector();
            dbc.updateData("UPDATE tbl_user SET u_fname = '"+fn.getText()+"', u_lname = '"+ln.getText()+"', u_email = '"+eml.getText()+"', u_username = '"+un.getText()+"', "
                            + "u_password = '"+ps.getText()+"', u_type = '"+ut.getSelectedItem()+"', "
                            + " u_status = '"+us.getSelectedItem()+"', u_image = '"+destination+"'  WHERE u_id = '"+uid.getText()+"'");
            
            if(destination.isEmpty()){
            File existingFile = new File(oldpath);
            if(existingFile.exists()){
            existingFile.delete();
            }
            }else{
            if(!(oldpath.equals(path))){
            imageUpdater(oldpath,path);
            }
            }
            
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
            }
    }//GEN-LAST:event_updateUserActionPerformed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        show.setVisible(false);
        hide.setVisible(true);
        ps.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        show.setVisible(true);
        hide.setVisible(false);
        ps.setEchoChar((char) 0);
    }//GEN-LAST:event_hideMousePressed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_removeMouseClicked

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMouseClicked

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
       JFileChooser fileChooser = new JFileChooser();
                 int returnValue = fileChooser.showOpenDialog(null);
                 if(returnValue == JFileChooser.APPROVE_OPTION){
                     try{
                     selectedFile = fileChooser.getSelectedFile();
                     destination = "src/userimages/" + selectedFile.getName();
                     path = selectedFile.getAbsolutePath();
                     
                     if(FileExistenceChecker(path) == 1 ){
                         JOptionPane.showConfirmDialog(null, "File Already Exist, Rename or Choose another!");
                          destination = "";
                          path= "";
                     }else{
                           image.setIcon(ResizeImage(path, null, image));
                           select.setEnabled(false);
                           remove.setEnabled(true);
                          
                     }
                     }catch (Exception ex){
                         System.out.println("File Error!");
                     }
                 }
    }//GEN-LAST:event_selectActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
      remove.setEnabled(false);
      select.setEnabled(true);
      image.setIcon(null);
      destination ="";
      path = "";
    }//GEN-LAST:event_removeActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
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
            if( dbc.insertData(" INSERT INTO tbl_user ( u_fname, u_lname, u_email, u_username, u_password, u_type, u_status, u_image) "
                + "VALUES ('"+fn.getText()+"', '"+ln.getText()+"', '"+eml.getText()+"', '"+un.getText()+"', '"+ps.getText()+"', '"+ut.getSelectedItem()+"', '"+us.getSelectedItem()+"', '"+destination+"') "))
        {
            try{
            Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            usersForm uf = new usersForm();
            uf.setVisible(true);
            this.dispose();
            
            }catch(IOException ex){
                System.out.println("Insert Image Error: "+ ex);
            }
            
        } else{
            JOptionPane.showMessageDialog(null, "Connection Failed!");
        }
        }
    }//GEN-LAST:event_addUserActionPerformed

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
    private javax.swing.JLabel hide;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField ln;
    public javax.swing.JPasswordField ps;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    private javax.swing.JLabel show;
    public javax.swing.JLabel uid;
    public javax.swing.JTextField un;
    public javax.swing.JButton updateUser;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JLabel userId;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
