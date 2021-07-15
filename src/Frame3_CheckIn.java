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
import java.text.SimpleDateFormat;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Frame3_CheckIn extends javax.swing.JFrame {
    roomNumber rN = new roomNumber();
    connection con = new connection();
    Connection C = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    
    public Frame3_CheckIn() {
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
        checkIn_b = new javax.swing.JButton();
        back_b = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contact_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastName_tf = new javax.swing.JTextField();
        checkIn_d = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        roomType_cb = new javax.swing.JComboBox<>();
        firstName_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkIn_b.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        checkIn_b.setText("Check In");
        checkIn_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIn_bActionPerformed(evt);
            }
        });
        jPanel1.add(checkIn_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, -1, -1));

        back_b.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back_b.setText("BACK");
        back_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_bActionPerformed(evt);
            }
        });
        jPanel1.add(back_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Check In");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Room Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        contact_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(contact_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 650, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Check in Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        lastName_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(lastName_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 650, -1));

        checkIn_d.setDateFormatString("yyyy-MM-dd");
        checkIn_d.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(checkIn_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 260, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Contact");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        roomType_cb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        roomType_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Single", "Double", "Family" }));
        jPanel1.add(roomType_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        firstName_tf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel1.add(firstName_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 650, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("First Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_bActionPerformed
        Frame2_Home home = new Frame2_Home();
        home.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_back_bActionPerformed

    private void checkIn_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIn_bActionPerformed
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd"); //always use this format "yyyy-MM-dd"
        
        String date  =formatDate.format(checkIn_d.getDate());
        String fname = firstName_tf.getText();
        String lname = lastName_tf.getText();
        String contact = contact_tf.getText();
        String rType = String.valueOf(roomType_cb.getSelectedItem());
        String roomCode = "";
        
        
        
        try {
            con.connectDB();
            C = DriverManager.getConnection(con.url,con.user,con.password);
           
           
        //Creating room number
            String query1 = "SELECT COUNT(`Room Type`) FROM `costumers` WHERE `Room Type`='"+rType+"'";
            stm = C.prepareStatement(query1);
            rs = stm.executeQuery();
        //getting the number of rooms occupied
            String count ="";
            
            if(rs.next()){
                count = rs.getString("COUNT(`Room Type`)");
            }
            rN.setRType(rType);
            rN.setAddNum();
            rN.Letter();
            rN.setCount(Integer.parseInt(count));
            rN.getCurrentRoomNum();
        //Generating roomCode   
            String roomLetter = rN.letter;
            String roomNumber = String.valueOf(rN.getCurrentRoomNum());
            roomCode = roomLetter + roomNumber;
            
            
            
        //Setting the data
            String query = "INSERT INTO `costumers`(`Date`, `First Name`, `Last Name`, `Contact`, `Room Type`,`Room Number`)"
                    + " VALUES (?,?,?,?,?,?)";
            stm = C.prepareStatement(query);
            
            stm.setString(1, date);
            stm.setString(2, fname);
            stm.setString(3, lname);
            stm.setString(4, contact);
            stm.setString(5, rType);
            stm.setString(6, roomCode);
            int i = stm.executeUpdate();
            
            if (i > 0){
                JOptionPane.showMessageDialog(null, "Checked In");
            }
                     
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_checkIn_bActionPerformed

    
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
            java.util.logging.Logger.getLogger(Frame3_CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3_CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3_CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3_CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3_CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_b;
    private javax.swing.JButton checkIn_b;
    private com.toedter.calendar.JDateChooser checkIn_d;
    private javax.swing.JTextField contact_tf;
    private javax.swing.JTextField firstName_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName_tf;
    private javax.swing.JComboBox<String> roomType_cb;
    // End of variables declaration//GEN-END:variables
}
