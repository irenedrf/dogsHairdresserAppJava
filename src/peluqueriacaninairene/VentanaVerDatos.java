/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluqueriacaninairene;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author irene
 */
public class VentanaVerDatos extends javax.swing.JFrame {
    Connection con;
    ResultSet rs;
    /**
     * Creates new form VentanaVerDatos
     */
    public VentanaVerDatos() {
        setLocation (400, 300);
        setVisible(true);
        initComponents();
       
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MIS CLIENTES");

        id.setText("BUSCAR POR ID CLIENTE:");

        idCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Resultados de la búsqueda:");

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID cliente", "Nombre", "Apellidos", "DNI", "Dirección", "Ciudad", "Teléfono", "Mascota", "Peluquero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaDatos);

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id)
                                .addGap(32, 32, 32)
                                .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(botonBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSalir)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClienteActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        buscarCliente();
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void buscarCliente(){
        try { 
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_final_irene?&user=root&password=papalumala31"
                           + "&useLegacyDatetimeCode=false&serverTimezone=UTC");        
            
            String sql= "SELECT * FROM datosclientes WHERE idCliente="+idCliente.getText();
            
            Statement stmt = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY); 
            rs = stmt.executeQuery(sql);
            DefaultTableModel tm=(DefaultTableModel)tablaDatos.getModel();
            tm.setRowCount(0);
            
            while (rs.next()){
                Object o[]={rs.getInt("idCliente"), rs.getString("nombreDue"), rs.getString("apellidos"), rs.getString("dni"), rs.getString("direccion"), rs.getString("ciudad"), rs.getString("telefono"), rs.getString("nombreMascota"), rs.getString("peluquero")};
                tm.addRow(o);
            }
            
 		
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR:"+ex.toString(), "WARNING MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    }
    

    
    
    
    public static void main(String args[]) {
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVerDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idCliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
