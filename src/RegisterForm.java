import java.sql.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author marko
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Image1 = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Login_in = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jPasswordField_re_type = new javax.swing.JPasswordField();
        jTextField_first_name = new javax.swing.JTextField();
        jTextField_last_name = new javax.swing.JTextField();
        jTextField_username = new javax.swing.JTextField();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Image1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel_Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/krojac.jpg"))); // NOI18N
        jLabel_Image1.setText("jLabel1");
        jLabel_Image1.setOpaque(true);

        jLabel_Title.setBackground(new java.awt.Color(51, 51, 255));
        jLabel_Title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Title.setText("Register ");

        jLabel_Login_in.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Login_in.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Login_in.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Login_in.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Login_in.setText("Click here to Login ");
        jLabel_Login_in.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Login_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Login_inMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("First Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Re-type-password:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");

        jPasswordField_password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_passwordFocusLost(evt);
            }
        });

        jPasswordField_re_type.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_re_type.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_re_typeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_re_typeFocusLost(evt);
            }
        });

        jTextField_first_name.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_first_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_first_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_first_nameFocusLost(evt);
            }
        });

        jTextField_last_name.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_last_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_last_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_last_nameFocusLost(evt);
            }
        });

        jTextField_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });

        jButton_Cancel.setBackground(new java.awt.Color(153, 255, 255));
        jButton_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(51, 51, 255));
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jButton_Register.setBackground(new java.awt.Color(153, 255, 255));
        jButton_Register.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_Register.setForeground(new java.awt.Color(51, 51, 255));
        jButton_Register.setText("Register");
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPasswordField_password)
                                            .addComponent(jPasswordField_re_type, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(jTextField_first_name)
                                            .addComponent(jTextField_last_name)
                                            .addComponent(jTextField_username)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Login_in, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Image1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_re_type, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Login_in, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_Login_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Login_inMouseClicked
        Login_Window rgf = new Login_Window();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_Login_inMouseClicked

    private void jTextField_first_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_first_nameFocusGained
        if(jTextField_first_name.getText().trim().equals("First name"))
        {
            jTextField_first_name.setText("");
            //change the text field color to red ili sta god
            jTextField_first_name.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField_first_nameFocusGained

    private void jTextField_first_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_first_nameFocusLost
        if(jTextField_first_name.getText().trim().equals("")|| 
              jTextField_first_name.getText().trim().equals("First name")  )
        {
            jTextField_first_name.setText("First name");
            jTextField_first_name.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_first_nameFocusLost

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
    String fname = jTextField_first_name.getText();
    String lname = jTextField_last_name.getText();
    String uname = jTextField_username.getText();
    String pass = String.valueOf(jPasswordField_password.getPassword());
    String re_pass = String.valueOf(jPasswordField_re_type.getPassword());
    
    if (uname.equals ("")){
        JOptionPane.showMessageDialog(null, "Enter username");
    }
    else if (pass.equals ("")){
        JOptionPane.showMessageDialog(null, "Enter password");
    }
    else if (!pass.equals (re_pass)){
        JOptionPane.showMessageDialog(null, "Re type password again");
    }
    else if (fname.equals ("")){
        JOptionPane.showMessageDialog(null, "Enter First name");
    }
    else if (lname.equals ("")){
        JOptionPane.showMessageDialog(null, "Enter Last name");
    }
    else {
    PreparedStatement ps;
    String query = "INSERT INTO `registered-users`( `u_fname`, `u_lname`, `u_name`, `password`) VALUES (?,?,?,?)";
    
        try {
            ps = Connect_db.getTheconnection().prepareStatement(query);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, uname);
            ps.setString(4, pass);
            
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "New user added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jTextField_last_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_last_nameFocusGained
        if(jTextField_last_name.getText().trim().equals("Last name"))
        {
            jTextField_last_name.setText("");
            //change the text field color to red ili sta god
            jTextField_last_name.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField_last_nameFocusGained

    private void jTextField_last_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_last_nameFocusLost
        if(jTextField_last_name.getText().trim().equals("")|| 
              jTextField_last_name.getText().trim().equals("Last name")  )
        {
            jTextField_last_name.setText("Last name");
            jTextField_last_name.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_last_nameFocusLost

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        if(jTextField_username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_username.setText("");
            //change the text field color to red ili sta god
            jTextField_username.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
       if(jTextField_username.getText().trim().equals("")|| 
              jTextField_username.getText().trim().toLowerCase().equals("username")  )
        {
            jTextField_username.setText("username");
            jTextField_username.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jPasswordField_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passwordFocusGained
        String password = String.valueOf(jPasswordField_password.getPassword());
        if(password.trim().toLowerCase().equals("password"))
        {
            //same as with username
            jPasswordField_password.setText("");
            jPasswordField_password.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jPasswordField_passwordFocusGained

    private void jPasswordField_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passwordFocusLost
         String password = String.valueOf(jPasswordField_password.getPassword());
        if(password.trim().equals("")|| 
              password.trim().toLowerCase().equals("password")  )
        {
            jPasswordField_password.setText("password");
            jPasswordField_password.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField_passwordFocusLost

    private void jPasswordField_re_typeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_re_typeFocusGained
        String password = String.valueOf(jPasswordField_re_type.getPassword());
        if(password.trim().toLowerCase().equals("password"))
        {
            //same as with username
            jPasswordField_re_type.setText("");
            jPasswordField_re_type.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jPasswordField_re_typeFocusGained

    private void jPasswordField_re_typeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_re_typeFocusLost
        String password = String.valueOf(jPasswordField_re_type.getPassword());
        if(password.trim().equals("")|| 
              password.trim().toLowerCase().equals("password")  )
        {
            jPasswordField_re_type.setText("password");
            jPasswordField_re_type.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField_re_typeFocusLost

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Image1;
    private javax.swing.JLabel jLabel_Login_in;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JPasswordField jPasswordField_re_type;
    private javax.swing.JTextField jTextField_first_name;
    private javax.swing.JTextField jTextField_last_name;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
