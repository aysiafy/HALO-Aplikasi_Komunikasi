/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi;

import javax.swing.JOptionPane;

/**
 *
 * @author Aysia
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Registrasi
     */
    User usr = new User();
    public Register() {
        initComponents();
        //        Besar windows saat running
        setSize(365, 480);
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
        tf_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        tf_ulangPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 150));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(249, 243, 238));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HALO!");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Andalan anda dalam berkomunikasi.");

        tf_nama.setToolTipText("Masukan nama lengkap anda");

        jLabel3.setText("Nama");

        jLabel4.setText("Username");

        tf_username.setToolTipText("Masukan nama lengkap anda");

        jLabel5.setText("Password");

        jLabel6.setText("Ketik Ulang Password");

        jButton1.setText("Daftar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(224, 182, 213));
        jLabel7.setText("Masuk");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setText("Sudah punya akun?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(tf_username, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(tf_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(tf_password)
                                    .addComponent(tf_ulangPassword)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_ulangPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 360, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nama = tf_nama.getText().toString();
        String username = tf_username.getText().toLowerCase().trim();
        String password = tf_password.getText().toString().trim();
        String ulangPassword = tf_password.getText().toString().trim();
        
        if(!password.equals(ulangPassword)){
            JOptionPane.showMessageDialog(null,"Password tidak cocok");
        } else if (password.equals("")||username.equals("")||ulangPassword.equals("")||nama.equals("")){
            JOptionPane.showMessageDialog(null, "Isi seluruh kolom");
        } else if (password.length() < 6){
            JOptionPane.showMessageDialog(null, "Password setidaknya harus 6 digit");
        } else {
            usr.nama = nama;
            usr.username = username;
            usr.password = password;
            if(usr.cekDaftar()==1){
                tf_nama.setText("");
                tf_username.setText("");
                tf_password.setText("");
                tf_ulangPassword.setText("");
                JOptionPane.showMessageDialog(null,"Berhasil daftar, silahkan pergi ke halaman login");
            } else {
                JOptionPane.showMessageDialog(null,"Username sudah pernah dibuat");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setVisible(false);
        Login frm = new Login();
        frm.setVisible(true);
        frm.pack();
        frm.setLocationRelativeTo(null);
        frm.setLocation(500, 150);
        frm.setSize(376, 450);
        frm.setResizable(false);
        frm.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JPasswordField tf_ulangPassword;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
