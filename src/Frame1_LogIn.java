/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velly King Jasper O. Marcellones
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Frame1_LogIn extends javax.swing.JFrame {

    connection con = new connection();
    
    Connection C = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    public Frame1_LogIn() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_tf = new javax.swing.JTextField();
        password_tf = new javax.swing.JPasswordField();
        logIn_b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Log In");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("User Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        user_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(user_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 430, -1));

        password_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(password_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 430, -1));

        logIn_b.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logIn_b.setText("Log In");
        logIn_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logIn_bActionPerformed(evt);
            }
        });
        jPanel1.add(logIn_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logIn_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logIn_bActionPerformed
        Frame2_Home home = new Frame2_Home();
        String user = user_tf.getText();
        String password = String.valueOf(password_tf.getPassword());
        
        try {
            con.connectDB();
            C = DriverManager.getConnection(con.url,con.user,con.password);
            String query = "SELECT `user`, `password` FROM `credentials` WHERE `user`=? AND `password`=?";
            stm = C.prepareStatement(query);
            stm.setString(1, user);
            stm.setString(2, password);
            rs= stm.executeQuery();
            if (rs.next()) {
               home.setVisible(true);
               this.setVisible(false);  
            } else {
                JOptionPane.showMessageDialog(null, "Wrong log in information","Error" ,JOptionPane.ERROR_MESSAGE);
                user_tf.setText("");
                password_tf.setText("");
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_logIn_bActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyTyped

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
            java.util.logging.Logger.getLogger(Frame1_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1_LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logIn_b;
    private javax.swing.JPasswordField password_tf;
    private javax.swing.JTextField user_tf;
    // End of variables declaration//GEN-END:variables
}