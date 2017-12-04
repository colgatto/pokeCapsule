/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokecapsule;

/**
 *
 * @author colgatto
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Home() {
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

        txtWallet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDiamGet = new javax.swing.JTextField();
        btnRun = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDiamEarned = new javax.swing.JLabel();
        lbl10open = new javax.swing.JLabel();
        lblFinalWallet = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblDiamSpend = new javax.swing.JLabel();
        btnRunAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtWallet.setText("0");
        txtWallet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWalletKeyTyped(evt);
            }
        });

        jLabel1.setText("Wallet Diamonds:");

        jLabel2.setText("Diamonds gets from 10x:");

        txtDiamGet.setText("0");
        txtDiamGet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiamGetKeyTyped(evt);
            }
        });

        btnRun.setText("Run Once");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        jLabel3.setText("10x open:");

        jLabel4.setText("Diamond earned:");

        jLabel5.setText("Final wallet:");

        lblDiamEarned.setText("0");

        lbl10open.setText("0");

        lblFinalWallet.setText("0");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel6.setText("Diamonds spend:");

        lblDiamSpend.setText("0");

        btnRunAll.setText("Run All");
        btnRunAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDiamSpend)
                                    .addComponent(lblFinalWallet)
                                    .addComponent(lbl10open)
                                    .addComponent(txtDiamGet, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDiamEarned)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRunAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWallet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiamGet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiamSpend)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDiamEarned))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl10open))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblFinalWallet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRun)
                    .addComponent(btnRunAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        int wallet = 0;
        if(firstRun){
            wallet = txtWallet.getText().equals("") ? 0 : Integer.parseInt(txtWallet.getText());
            firstRun = false;
        }else {
            wallet = lblFinalWallet.getText().equals("") ? 0 : Integer.parseInt(lblFinalWallet.getText());
        }
        int getFor10x = txtDiamGet.getText().equals("") ? 0 : Integer.parseInt(txtDiamGet.getText());
        int open = lbl10open.getText().equals("") ? 0 : Integer.parseInt(lbl10open.getText());
        int diamEarned = lblDiamEarned.getText().equals("") ? 0 : Integer.parseInt(lblDiamEarned.getText());
        int spend = lblDiamSpend.getText().equals("") ? 0 : Integer.parseInt(lblDiamSpend.getText());
        if(wallet >= capsuleValue){
            wallet-=capsuleValue;
            wallet+=getFor10x;
            diamEarned+=getFor10x;
            spend+=capsuleValue;
            open++;
        }
        lblFinalWallet.setText(Integer.toString(wallet));
        lbl10open.setText(Integer.toString(open));
        lblDiamEarned.setText(Integer.toString(diamEarned));
        lblDiamSpend.setText(Integer.toString(spend));
    }//GEN-LAST:event_btnRunActionPerformed

    private void txtWalletKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWalletKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtWalletKeyTyped

    private void txtDiamGetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiamGetKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_txtDiamGetKeyTyped

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtWallet.setText("0");
        txtDiamGet.setText("0");
        lblFinalWallet.setText("0");
        lbl10open.setText("0");
        lblDiamEarned.setText("0");
        lblDiamSpend.setText("0");
        firstRun = true;
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRunAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunAllActionPerformed
        int wallet = txtWallet.getText().equals("") ? 0 : Integer.parseInt(txtWallet.getText());
        int getFor10x = txtDiamGet.getText().equals("") ? 0 : Integer.parseInt(txtDiamGet.getText());
        int spend = 0;
        int open = 0;
        int diamEarned = 0;
        while(wallet >= capsuleValue){
            wallet-=capsuleValue;
            wallet+=getFor10x;
            diamEarned+=getFor10x;
            spend+=capsuleValue;
            open++;
        }
        lblFinalWallet.setText(Integer.toString(wallet));
        lbl10open.setText(Integer.toString(open));
        lblDiamEarned.setText(Integer.toString(diamEarned));
        lblDiamSpend.setText(Integer.toString(spend));
    }//GEN-LAST:event_btnRunAllActionPerformed

    
    int capsuleValue = 2488;

    boolean firstRun = true;
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnRunAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl10open;
    private javax.swing.JLabel lblDiamEarned;
    private javax.swing.JLabel lblDiamSpend;
    private javax.swing.JLabel lblFinalWallet;
    private javax.swing.JTextField txtDiamGet;
    private javax.swing.JTextField txtWallet;
    // End of variables declaration//GEN-END:variables
}
