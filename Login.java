package JavaProject;
import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        setTitle("Login");
        initComponents();
        setLocation(600,250);
        setResizable(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jButton_submit_ = new javax.swing.JButton();
        jButton_Newuser_ = new javax.swing.JButton();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jTextField_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 163, 225));

        jButton_submit_.setBackground(new java.awt.Color(255, 13, 29));
        jButton_submit_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_submit_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_submit_.setText("Submit");
        jButton_submit_.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(1, 1, 1)));
        jButton_submit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_submit_MouseClicked(evt);
            }
        });
        jButton_submit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_submit_ActionPerformed(evt);
            }
        });

        jButton_Newuser_.setBackground(new java.awt.Color(0, 0, 255));
        jButton_Newuser_.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Newuser_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Newuser_.setText("New User?");
        jButton_Newuser_.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(2, 2, 2)));
        jButton_Newuser_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Newuser_MouseClicked(evt);
            }
        });
        jButton_Newuser_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Newuser_ActionPerformed(evt);
            }
        });

        jPasswordField_pass.setBackground(new java.awt.Color(138, 209, 255));
        jPasswordField_pass.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPasswordField_pass.setForeground(new java.awt.Color(0, 0, 255));
        jPasswordField_pass.setText("jPasswordField1");
        jPasswordField_pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPasswordField_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passActionPerformed(evt);
            }
        });

        jTextField_Email.setBackground(new java.awt.Color(138, 209, 255));
        jTextField_Email.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField_Email.setForeground(new java.awt.Color(0, 0, 204));
        jTextField_Email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Login ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton_submit_, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Newuser_, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_Email)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_submit_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Newuser_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_submit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_submit_ActionPerformed

    }//GEN-LAST:event_jButton_submit_ActionPerformed

    private void jButton_Newuser_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Newuser_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Newuser_ActionPerformed

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jButton_Newuser_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Newuser_MouseClicked
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_jButton_Newuser_MouseClicked

    private void jButton_submit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_submit_MouseClicked

        PreparedStatement ps;
        ResultSet rs;
        String em = jTextField_Email.getText();
        String pass=String.valueOf(jPasswordField_pass.getPassword());
        
        if(em.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Enter email id");
        }     
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter your password");
        }
        String query = "SELECT * FROM `userdetails` WHERE `email` =? AND `password` =?";
         
        try {
            
            if(!em.equals("")&&!pass.equals("")){
                
                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, em);
                ps.setString(2, pass);
                rs=ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Sucessfully completed");

                    //Reset Login and Password Text Field.
                    jTextField_Email.setText("");
                    jPasswordField_pass.setText("");   
                    this.dispose();
                    new Topics().setVisible(true);
                } else {
                JOptionPane.showMessageDialog(null, "User id or Password incorrect");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton_submit_MouseClicked

    private void jPasswordField_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passActionPerformed

    public static void main(String args[]) {
        new Login().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Newuser_;
    private javax.swing.JButton jButton_submit_;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_Email;
    // End of variables declaration//GEN-END:variables
}
