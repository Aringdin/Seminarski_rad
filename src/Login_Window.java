
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author marko
 */
public class Login_Window extends javax.swing.JFrame {

    /**
     * Creates new form Login_Window
     */
    public Login_Window() {
        initComponents();
        
        //centrirati form
        this.setLocationRelativeTo(null);
        
        // Dodati slike
        jLabel_Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/krojac.jpg")));
        jLabel_username_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.jpg")));
        jLabel_password_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.jpg")));
        
        
        //too add border
        Border title_border = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.RED);
        jLabel_Title.setBorder(title_border);
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
        jLabel_Image1 = new javax.swing.JLabel();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_username_icon = new javax.swing.JLabel();
        jLabel_password_icon = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_passoword = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Image1.setBackground(new java.awt.Color(255, 102, 51));
        jLabel_Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/krojac.jpg"))); // NOI18N
        jLabel_Image1.setText("jLabel1");
        jLabel_Image1.setOpaque(true);

        jLabel_Title.setBackground(new java.awt.Color(51, 51, 255));
        jLabel_Title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_Title.setText("LOGIN");

        jLabel_username_icon.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_username_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_username_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.jpg"))); // NOI18N
        jLabel_username_icon.setOpaque(true);

        jLabel_password_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.jpg"))); // NOI18N

        jTextField_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_username.setText("username");
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });

        jPasswordField_passoword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField_passoword.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_passoword.setText("password");
        jPasswordField_passoword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_passowordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_passowordFocusLost(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(153, 255, 255));
        jButton_login.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(51, 51, 255));
        jButton_login.setText("Log in");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
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

        jLabelRegister.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRegister.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(51, 51, 255));
        jLabelRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegister.setText("Click here to create a new account");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_password_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_username_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_username)
                                    .addComponent(jPasswordField_passoword, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                            .addComponent(jLabelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Image1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_username)
                    .addComponent(jLabel_username_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_password_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_passoword, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        //remove the text from the text field on focus fained
        // if the text field text = "username"
        if(jTextField_username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_username.setText("");
            //change the text field color to red ili sta god
            jTextField_username.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        // if the text field is empty or set it to 'username'
        if(jTextField_username.getText().trim().equals("")|| 
              jTextField_username.getText().trim().toLowerCase().equals("username")  )
        {
            jTextField_username.setText("username");
            jTextField_username.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jPasswordField_passowordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passowordFocusGained
        // To clear password field, when focused on by clicking on it(code za to)
        //get password
        String password = String.valueOf(jPasswordField_passoword.getPassword());
        if(password.trim().toLowerCase().equals("password"))
        {
            //same as with username
            jPasswordField_passoword.setText("");
            jPasswordField_passoword.setForeground(Color.BLACK);
        }
        
    }//GEN-LAST:event_jPasswordField_passowordFocusGained

    private void jPasswordField_passowordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_passowordFocusLost
        //to return passoword or whatever was in the box to normal after declicking or removing it from focus(code za to)
        String password = String.valueOf(jPasswordField_passoword.getPassword());
        if(password.trim().equals("")|| 
              password.trim().toLowerCase().equals("password")  )
        {
            jPasswordField_passoword.setText("password");
            jPasswordField_passoword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jPasswordField_passowordFocusLost

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
       String u_name = jTextField_username.getText();
       String password = String.valueOf(jPasswordField_passoword.getPassword());
       
       PreparedStatement ps;
       ResultSet rs;
               
       String selectuery ="SELECT * FROM `registered-users` WHERE `u_name`= ? AND `password` = ?; ";
       
       //check the fields value
       if(u_name.trim().toLowerCase().equals("username")|| 
              password.trim().toLowerCase().equals("password") )
       {
           JOptionPane.showMessageDialog(null, "Ukucaj svoje korisnicko ime i svoju lozinku", "Polje je prazno",2);
       }
       else {
           try{
           ps = Connect_db.getTheconnection().prepareStatement(selectuery);
           ps.setString(1, u_name);
           ps.setString(2, password);
           
           rs = ps.executeQuery();
           
           if(rs.next()){
               //show the main window
               Main_Window mainform = new Main_Window();
               mainform.setVisible(true);
               mainform.pack();
               mainform.setExtendedState(JFrame.MAXIMIZED_BOTH);  // to open in full screen
               //to close login window
               this.dispose();
           }
           else {
               JOptionPane.showMessageDialog(null, "nevazeca lozinka ili korisnicko ime", "Pogresni podaci", 2);
           }
           } catch (SQLException ex) {
            Logger.getLogger(Connect_db.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

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
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabel_Image1;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_password_icon;
    private javax.swing.JLabel jLabel_username_icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_passoword;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}