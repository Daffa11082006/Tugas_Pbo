/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CINETIX;

import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author Arta
 */
public class RegistFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegistFrame
     */
    public RegistFrame() {
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

        Title = new javax.swing.JLabel();
        registNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        tampilPassword = new javax.swing.JCheckBox();
        labelAkun = new javax.swing.JLabel();
        tombolOke = new javax.swing.JButton();
        inputPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 51, 0));
        Title.setText("CineTix");
        getContentPane().add(Title);
        Title.setBounds(270, 40, 90, 32);

        registNama.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registNama.setForeground(new java.awt.Color(255, 204, 204));
        registNama.setText("Buat Username Anda");
        getContentPane().add(registNama);
        registNama.setBounds(60, 120, 140, 20);

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });
        getContentPane().add(inputNama);
        inputNama.setBounds(59, 148, 370, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Buat Password Anda");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(59, 194, 135, 20);

        labelPassword.setBackground(new java.awt.Color(255, 255, 255));
        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 51, 0));
        labelPassword.setText("Password  Maximal 10 karakter");
        getContentPane().add(labelPassword);
        labelPassword.setBounds(59, 248, 200, 16);

        tampilPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tampilPassword.setForeground(new java.awt.Color(255, 51, 0));
        tampilPassword.setText("Perlihatkan Password");
        tampilPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(tampilPassword);
        tampilPassword.setBounds(59, 270, 214, 20);

        labelAkun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAkun.setForeground(new java.awt.Color(255, 0, 0));
        labelAkun.setText("Sudah Punya Akun? Login");
        labelAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAkunMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAkunMouseEntered(evt);
            }
        });
        getContentPane().add(labelAkun);
        labelAkun.setBounds(85, 325, 180, 16);

        tombolOke.setBackground(new java.awt.Color(0, 0, 0));
        tombolOke.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tombolOke.setForeground(new java.awt.Color(255, 51, 0));
        tombolOke.setText("OKE");
        tombolOke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolOkeActionPerformed(evt);
            }
        });
        getContentPane().add(tombolOke);
        tombolOke.setBounds(500, 430, 137, 32);

        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(inputPassword);
        inputPassword.setBounds(60, 220, 370, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CINETIX/Netflix-Background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 940, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void tombolOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolOkeActionPerformed
             // TODO add your handling code here:
             String username = inputNama.getText();
    String password = new String(inputPassword.getPassword());
    
     if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username dan Password tidak boleh kosong!");
        return;
    } else

    if (password.length() >= 10) {
        JOptionPane.showMessageDialog(this, "Password maksimal 10 karakter.");
        return;
    } else {
        
    }
     new LoginFrame().setVisible(true);
    }//GEN-LAST:event_tombolOkeActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void tampilPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilPasswordActionPerformed
        // TODO add your handling code here:
         if (tampilPassword.isSelected()) {
        inputPassword.setEchoChar((char) 0); 
    } else {
        inputPassword.setEchoChar('*'); 
        
    }
    }//GEN-LAST:event_tampilPasswordActionPerformed

    private void labelAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAkunMouseClicked
        // TODO add your handling code here:
               this.dispose();
         new LoginFrame().setVisible(true);
    }//GEN-LAST:event_labelAkunMouseClicked

    private void labelAkunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAkunMouseEntered
        // TODO add your handling code here:
                labelAkun.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelAkunMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    

    java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
              new RegistFrame().setVisible(true);
    }
        
   
    });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JTextField inputNama;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelAkun;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel registNama;
    private javax.swing.JCheckBox tampilPassword;
    private javax.swing.JButton tombolOke;
    // End of variables declaration//GEN-END:variables
}
