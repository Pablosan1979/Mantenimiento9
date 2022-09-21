
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class InternalFrameProgramacionMant extends javax.swing.JInternalFrame {

//    Conexion con = new Conexion();
//    Connection conn = con.getConexion();
//    ResultSet rs;
//    PreparedStatement ps;
//    
  
    
    public static final String url = "jdbc:mysql://localhost:3306/mantenimiento";
    public static final String user = "root";
    public static final String contraseña = "";
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    
    public static Connection getConexion() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, contraseña);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " " + "Error al Establecer Conexion");
        }
        return con;
    }
    
    
    
    
    
    public InternalFrameProgramacionMant() {
        initComponents();
        txtId.setVisible(false);
    }

   
    
    
    
     private void limpiarCajas() {

        txtCodigo.setText(null);
        txtMaquina.setText(null);
        txtFechaInicio.setText(null);
        txtFechaFin.setText(null);
        txtEjecuta.setText(null);
        cbxTipoMant.setSelectedIndex(0);
        


    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtMaquina = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtFechaFin = new javax.swing.JTextField();
        txtEjecuta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbxTipoMant = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Programacion de Mantenimientos");

        jLabel1.setText("Maquina");

        jLabel2.setText("Fecha de Inicio");

        jLabel3.setText("Fecha Finalizacion");

        jLabel4.setText("Ejecuta");

        jLabel5.setText("Codigo Maquina");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de Mantenimiento");

        cbxTipoMant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Preventivo", "Correctivo", "Otro", " " }));
        cbxTipoMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoMantActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(116, 116, 116))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(30, 30, 30)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxTipoMant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEjecuta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(txtMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(300, 300, 300)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addContainerGap(58, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEjecuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxTipoMant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     
        Connection con = null;

        try {

            con = getConexion();
            ps = con.prepareStatement("SELECT * FROM pro_mant WHERE codigo_maquina =?");
            ps.setString(1, txtCodigo.getText());

            rs = ps.executeQuery();

            if (rs.next()) {

                txtId.setText(rs.getString("id"));
                txtCodigo.setText(rs.getString("codigo_maquina"));
                txtMaquina.setText(rs.getString("maquina"));
                txtFechaInicio.setText(rs.getString("fecha_inicio"));
                txtFechaFin.setText(rs.getString("fecha_fin"));
                txtEjecuta.setText(rs.getString("ejecuta"));
                cbxTipoMant.setSelectedItem(rs.getString("tipo_mant"));
                

            } else {
                JOptionPane.showMessageDialog(null, "Error al Consultar");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error al Buscar");
        }     






    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        
        Connection con = null;

        try {
            con = getConexion();
            ps = con.prepareStatement("INSERT INTO pro_mant(codigo_maquina,maquina,fecha_inicio,fecha_fin,ejecuta,tipo_mant) VALUES(?,?,?,?,?,?)");
            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtMaquina.getText());
            ps.setString(3, txtFechaInicio.getText());
            ps.setString(4, txtFechaFin.getText());
            ps.setString(5, txtEjecuta.getText());
            ps.setString(6, cbxTipoMant.getSelectedItem().toString());

            

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiarCajas();

            }
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
//        try {
//            PreparedStatement guardar
//                    = conn.prepareStatement("INSERT INTO  pro_mant ( codigo_maquina, maquina, fecha_inicio, fecha_fin, ejecuta,tipo_mant ) VALUES (?,?,?,?,?,?)");
//
//            guardar.setString(1, txtCodigo.getText());
//            guardar.setString(2, txtMaquina.getText());
//            guardar.setString(3, txtFechaInicio.getText());
//            guardar.setString(4, txtFechaFin.getText());
//            guardar.setString(5, txtEjecuta.getText());
//            guardar.setString(6, cbxTipoMant.getSelectedItem().toString());
//            
//
//            guardar.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Registro Guardado");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e + " - " + " Error al Guardar");
//        }
        


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      
        
Connection con = null;

        try {
           con = getConexion(); 
           ps = con.prepareStatement("UPDATE pro_mant  SET codigo_maquina=?,maquina=?,fecha_inicio=?,fecha_fin=?,ejecuta=?,tipo_mant=? WHERE id=?");
           ps.setString(1, txtCodigo.getText());
           ps.setString(2, txtMaquina.getText());
           ps.setString(3, txtFechaInicio.getText());
           ps.setString(4, txtFechaFin.getText());
           ps.setString(5, txtEjecuta.getText()); 
           ps.setString(6, cbxTipoMant.getSelectedItem().toString());   
           ps.setString(7, txtId.getText());           

                   
           
           int res = ps.executeUpdate();
           
           if(res>0){
             JOptionPane.showMessageDialog(null, "Registro Modificado");
             limpiarCajas();
           }else{
               JOptionPane.showMessageDialog(null, "Error al Modificar");
               limpiarCajas();

           }
           
           con.close();
        } catch (Exception e) {
            System.err.print(e);
        }





    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        
         Connection con = null;

        try {
            con = getConexion();
            ps = con.prepareStatement("DELETE FROM pro_mant WHERE codigo_maquina=?");
           
            ps.setString(1, txtCodigo.getText());
            

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiarCajas();

            }
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
        
//        try {
//            PreparedStatement eliminar
//                    = conn.prepareStatement("DELETE FROM pro_mant  WHERE codigo_maquina=?");
//
//            eliminar.setString(1, txtCodigo.getText());
//            eliminar.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Registro Eliminado");
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e + " - " + " Error al Eliminar");
//        }
        
        

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       
        limpiarCajas();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbxTipoMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoMantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoMantActionPerformed

    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JComboBox<String> cbxTipoMant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtEjecuta;
    public javax.swing.JTextField txtFechaFin;
    public javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtId;
    public javax.swing.JTextField txtMaquina;
    // End of variables declaration//GEN-END:variables
}
