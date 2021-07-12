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
import java.sql.Statement;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Frame4_ViewCostumers extends javax.swing.JFrame {
    connection con = new connection();
    
    Connection C = null;
    PreparedStatement stm = null;
    ResultSet rs = null;

    String date; 
    String fName =""; 
    String lName = ""; 
    String contact; 
    String rType ;
    String rNum ;
    String fullName = fName + " " + lName; 
               
    int i=0;
    
    public void getData(){
        con.connectDB();
        try {
            C = DriverManager.getConnection(con.url,con.user,con.password);
            String query = "SELECT * FROM `costumers`";
            stm = C.prepareStatement(query);
            rs = stm.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Frame4_ViewCostumers() {
        initComponents();
        getData();
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
        checkOut_b = new javax.swing.JButton();
        back_b = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roomType_tf = new javax.swing.JTextField();
        name_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        roomNumber_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        checkIn_d = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        contact_tf = new javax.swing.JTextField();
        update_b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkOut_b.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        checkOut_b.setText("CHECK OUT");
        checkOut_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOut_bActionPerformed(evt);
            }
        });
        jPanel1.add(checkOut_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, -1, -1));

        back_b.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back_b.setText("BACK");
        back_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_bActionPerformed(evt);
            }
        });
        jPanel1.add(back_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Costumers");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "First Name", "Last Name", "Contact", "Room Type", "Room Number"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 910, 230));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("ROOM TYPE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        roomType_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(roomType_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 500, -1));

        name_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(name_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 500, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("CONTACT");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        roomNumber_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(roomNumber_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 500, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("ROOM NUMBER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        checkIn_d.setEditable(false);
        checkIn_d.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(checkIn_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 500, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("CHECKED IN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        contact_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(contact_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 500, -1));

        update_b.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        update_b.setText("UPDATE");
        update_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bActionPerformed(evt);
            }
        });
        jPanel1.add(update_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_bActionPerformed
       Frame2_Home home = new Frame2_Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_bActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        Frame6_CheckOut CO = new Frame6_CheckOut();
        
        try {
            int row = table1.getSelectedRow();
             date = table1.getModel().getValueAt(row, 0).toString();
             fName = table1.getModel().getValueAt(row, 1).toString();
             lName = table1.getModel().getValueAt(row, 2).toString();
             contact = table1.getModel().getValueAt(row, 3).toString();
             rType = table1.getModel().getValueAt(row, 4).toString();
             rNum = table1.getModel().getValueAt(row, 5).toString();
             
             fullName = fName + " " + lName;
            
            checkIn_d.setText(date);
            name_tf.setText(fullName);
            roomType_tf.setText(rType);
            roomNumber_tf.setText(rNum);
            contact_tf.setText(contact);
            i++;
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_table1MouseClicked

    private void checkOut_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOut_bActionPerformed
        
        if (i > 0) {
            Frame6_CheckOut checkOut = new Frame6_CheckOut();
            Frame6_CheckOut setVariables = new Frame6_CheckOut( date,  fullName, contact, rNum, rType);
            checkOut.setVisible(true);
            setVariables.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select Costumer to Check Out");
        }
    }//GEN-LAST:event_checkOut_bActionPerformed

    private void update_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bActionPerformed
        
        
        
        try {
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_update_bActionPerformed

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
            java.util.logging.Logger.getLogger(Frame4_ViewCostumers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame4_ViewCostumers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame4_ViewCostumers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame4_ViewCostumers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame4_ViewCostumers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_b;
    private javax.swing.JTextField checkIn_d;
    private javax.swing.JButton checkOut_b;
    private javax.swing.JTextField contact_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField roomNumber_tf;
    private javax.swing.JTextField roomType_tf;
    private javax.swing.JTable table1;
    private javax.swing.JButton update_b;
    // End of variables declaration//GEN-END:variables
}
