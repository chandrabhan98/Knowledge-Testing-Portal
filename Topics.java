package JavaProject;

public class Topics extends javax.swing.JFrame {
    static int topic=1;
    public Topics() {
        initComponents();
        setLocation(600,250);
        setResizable(false);
        setTitle(" Welcome to Knowledge Testing Portal");
        //initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_reasoning_ = new javax.swing.JButton();
        jButton_english_ = new javax.swing.JButton();
        jButton_GK_ = new javax.swing.JButton();
        jButton_computer_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 163, 225));

        jButton_reasoning_.setBackground(new java.awt.Color(0, 255, 0));
        jButton_reasoning_.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_reasoning_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_reasoning_.setText("REASONING");
        jButton_reasoning_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_reasoning_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_reasoning_MouseClicked(evt);
            }
        });
        jButton_reasoning_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_reasoning_ActionPerformed(evt);
            }
        });

        jButton_english_.setBackground(new java.awt.Color(255, 0, 153));
        jButton_english_.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_english_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_english_.setText("ENGLISH");
        jButton_english_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_english_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_english_MouseClicked(evt);
            }
        });
        jButton_english_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_english_ActionPerformed(evt);
            }
        });

        jButton_GK_.setBackground(new java.awt.Color(102, 0, 102));
        jButton_GK_.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_GK_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GK_.setText("GENERAL KNOWLEDGE");
        jButton_GK_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_GK_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_GK_MouseClicked(evt);
            }
        });
        jButton_GK_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GK_ActionPerformed(evt);
            }
        });

        jButton_computer_.setBackground(new java.awt.Color(0, 0, 255));
        jButton_computer_.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_computer_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_computer_.setText("COMPUTER");
        jButton_computer_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_computer_.setFocusTraversalPolicyProvider(true);
        jButton_computer_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_computer_MouseClicked(evt);
            }
        });
        jButton_computer_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_computer_ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   KNOWLEDGE TESTING PORTAL");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_reasoning_, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_computer_, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_english_, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_GK_, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton_computer_, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton_reasoning_, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton_english_, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_GK_, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_reasoning_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_reasoning_ActionPerformed

        topic=2;
        this.dispose();
        Questions q2=new Questions();
        q2.setVisible(true);         
    }//GEN-LAST:event_jButton_reasoning_ActionPerformed

    private void jButton_english_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_english_ActionPerformed

        topic=3;
        this.dispose();
        Questions q3=new Questions();
        q3.setVisible(true);
    }//GEN-LAST:event_jButton_english_ActionPerformed
    private void jButton_GK_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GK_ActionPerformed
        
        topic=4;
        this.dispose();
        Questions q4=new Questions();
        q4.setVisible(true);
        
    }//GEN-LAST:event_jButton_GK_ActionPerformed
    private void jButton_computer_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_computer_ActionPerformed
     
      topic=1;
      this.dispose();
      Questions q1=new Questions();
      q1.setVisible(true);
        
    }//GEN-LAST:event_jButton_computer_ActionPerformed
    private void jButton_computer_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_computer_MouseClicked
   
    }//GEN-LAST:event_jButton_computer_MouseClicked
    private void jButton_reasoning_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_reasoning_MouseClicked

    }//GEN-LAST:event_jButton_reasoning_MouseClicked

    private void jButton_english_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_english_MouseClicked
   
    }//GEN-LAST:event_jButton_english_MouseClicked

    private void jButton_GK_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GK_MouseClicked

    }//GEN-LAST:event_jButton_GK_MouseClicked

    public static void main(String args[]) {
        new Topics().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GK_;
    public javax.swing.JButton jButton_computer_;
    private javax.swing.JButton jButton_english_;
    private javax.swing.JButton jButton_reasoning_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
