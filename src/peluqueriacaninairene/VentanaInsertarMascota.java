/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluqueriacaninairene;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author irene
 */
public class VentanaInsertarMascota extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInsertarMascota
     */
    public VentanaInsertarMascota() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqNombreMas = new javax.swing.JLabel();
        etiqRaza = new javax.swing.JLabel();
        etiqPiens = new javax.swing.JLabel();
        campoTextoNomMas = new javax.swing.JTextField();
        campoTextoRaza = new javax.swing.JTextField();
        campoTextoPienso = new javax.swing.JTextField();
        etiqPienso = new javax.swing.JLabel();
        botonRegistrarMascota = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRAR NUEVA MASCOTA");

        etiqNombreMas.setText("Nombre mascota: ");

        etiqRaza.setText("Raza:");

        etiqPiens.setText("Pienso preferido*:");

        campoTextoRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoRazaActionPerformed(evt);
            }
        });

        etiqPienso.setText("*(Vegano, para perros activos, pequeños, etc)");

        botonRegistrarMascota.setText("REGISTRAR MASCOTA");
        botonRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarMascotaActionPerformed(evt);
            }
        });

        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRegistrarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiqPienso)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(etiqNombreMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(etiqRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(etiqPiens, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(campoTextoPienso, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoTextoNomMas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoTextoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqNombreMas)
                    .addComponent(campoTextoNomMas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqRaza)
                    .addComponent(campoTextoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqPiens)
                    .addComponent(campoTextoPienso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqPienso)
                .addGap(31, 31, 31)
                .addComponent(botonRegistrarMascota)
                .addGap(18, 18, 18)
                .addComponent(botonSalir)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTextoRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoRazaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarMascotaActionPerformed
        insertarMascota();
    }//GEN-LAST:event_botonRegistrarMascotaActionPerformed

   
    
    public void insertarMascota(){
        
        Connection connection;
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_final_irene?&user=root&password=papalumala31"
                           + "&useLegacyDatetimeCode=false&serverTimezone=UTC");  
            ps=connection.prepareStatement("INSERT INTO razasperros VALUES(?, ?, ?)");
       
            ps.setString(1, campoTextoNomMas.getText());
            ps.setString(2, campoTextoRaza.getText());
            ps.setString(3, campoTextoPienso.getText());
          
            ps.executeUpdate();
            rs=null;
            JOptionPane.showMessageDialog(null, "Se registró correctamente a su mascota. ¡Ya puede disfrutar de sus regalos!", "WARNING MESSAGE", JOptionPane.WARNING_MESSAGE);      
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString(), "WARNING MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    
    }
    
    
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInsertarMascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarMascota;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField campoTextoNomMas;
    private javax.swing.JTextField campoTextoPienso;
    private javax.swing.JTextField campoTextoRaza;
    private javax.swing.JLabel etiqNombreMas;
    private javax.swing.JLabel etiqPiens;
    private javax.swing.JLabel etiqPienso;
    private javax.swing.JLabel etiqRaza;
    // End of variables declaration//GEN-END:variables
}
