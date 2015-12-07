/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.File;
import javax.swing.JFileChooser;
import Logica.LeeFichero;
import Logica.Punto1;
import Logica.Zona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Inventario
 */
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    LeeFichero ficheros;
    ArrayList<Zona> Terrenos;

    public PrincipalView() {
        initComponents();
        ficheros = new LeeFichero();
        Terrenos = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBcargarArchivo = new javax.swing.JButton();
        jBpunto1 = new javax.swing.JButton();
        jBpunto2 = new javax.swing.JButton();
        Jltitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBcargarArchivo.setBackground(new java.awt.Color(204, 204, 255));
        jBcargarArchivo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jBcargarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fileico.png"))); // NOI18N
        jBcargarArchivo.setText("Cargar Archivo");
        jBcargarArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcargarArchivoActionPerformed(evt);
            }
        });

        jBpunto1.setText("Analizador punto1");
        jBpunto1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jBpunto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpunto1ActionPerformed(evt);
            }
        });

        jBpunto2.setText("Analizador punto2");
        jBpunto2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jBpunto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpunto2ActionPerformed(evt);
            }
        });

        Jltitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jltitle.setText("Taller Funadamentos de analizis de Algorithmos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBpunto2)
                                .addGap(18, 18, 18)
                                .addComponent(jBpunto1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBcargarArchivo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Jltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBcargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBpunto1)
                    .addComponent(jBpunto2))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcargarArchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(this);
        File addres = file.getSelectedFile();

        if (addres != null) {
            ficheros.setAddresFile(addres);
            Terrenos = ficheros.getTerreno();
        } else {
            JOptionPane.showMessageDialog(this," No selecciono fichero... ", "Error archivo",0);
        }
    }//GEN-LAST:event_jBcargarArchivoActionPerformed

    private void jBpunto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpunto1ActionPerformed
        // TODO add your handling code here:
        Punto1 point = new Punto1(Terrenos);
              
        for (int i = 1; i < Terrenos.size(); i++) {
            point.calculo(2, i);
        }
        point.print();
    
    }//GEN-LAST:event_jBpunto1ActionPerformed

    private void jBpunto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpunto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBpunto2ActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jltitle;
    private javax.swing.JButton jBcargarArchivo;
    private javax.swing.JButton jBpunto1;
    private javax.swing.JButton jBpunto2;
    // End of variables declaration//GEN-END:variables
}
