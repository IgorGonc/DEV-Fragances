/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author giancarlomarques
 */
public class TelaLogin extends javax.swing.JFrame {
    /**
     * Creates new form TelaAdmin
     */
    public TelaLogin() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnEntrarAdmin = new javax.swing.JToggleButton();
        txtSenha = new javax.swing.JPasswordField();
        btnRetornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(219, 182, 238));
        jPanel1.setForeground(new java.awt.Color(27, 0, 75));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 600));

        jPanel2.setBackground(new java.awt.Color(219, 182, 238));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite suas credencias");

        btnEntrarAdmin.setText("Entrar");
        btnEntrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarAdminActionPerformed(evt);
            }
        });
        btnEntrarAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarAdminKeyPressed(evt);
            }
        });

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(txtSenha))))
                .addContainerGap(175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnEntrarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        btnRetornar.setText("Retornar ao Menu");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnRetornar)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarAdminActionPerformed

        String login = txtLogin.getText();
        String senha = txtSenha.getText();
        if (txtLogin.getText().equals("admin") && new String(txtSenha.getText()).equals("admin")) {
            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            dispose();
            viewAdmin telaAdm = new viewAdmin();
            telaAdm.setVisible(true);
        } else if (txtLogin.getText().equalsIgnoreCase("") || txtSenha.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Campos em brancos");

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
            txtLogin.setText("");
            txtSenha.setText("");

        }


    }//GEN-LAST:event_btnEntrarAdminActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        TelaInicio aretornar = new TelaInicio();
        dispose();
        aretornar.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnEntrarAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarAdminKeyPressed
        // TODO add your handling code here:

        // enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String login = txtLogin.getText();
            String senha = txtSenha.getText();
            System.out.println(senha);
            if (txtLogin.getText().equals("admin") && new String(txtSenha.getText()).equals("admin")) {
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
                dispose();
                viewAdmin telaAdm = new viewAdmin();
                telaAdm.setVisible(true);
            } else if (txtLogin.getText().equalsIgnoreCase("") || txtSenha.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Campos em brancos");

            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
                dispose(); // Fecha o JFrame atual
            }
        }
    }//GEN-LAST:event_btnEntrarAdminKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        // TODO add your handling code here:
        // enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String login = txtLogin.getText();
            String senha = txtSenha.getText();
            System.out.println(senha);
            if (txtLogin.getText().equals("admin") && new String(txtSenha.getText()).equals("admin")) {
                JOptionPane.showMessageDialog(null, "Logado com sucesso!");
                dispose();
                viewAdmin telaAdm = new viewAdmin();
                telaAdm.setVisible(true);
            } else if (txtLogin.getText().equalsIgnoreCase("") || txtSenha.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Campos em brancos");

            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
                dispose(); // Fecha o JFrame atual
            }
        }


    }//GEN-LAST:event_txtSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEntrarAdmin;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
