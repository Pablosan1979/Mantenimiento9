
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class InternalFramePersonalMant extends javax.swing.JInternalFrame {

//    Conexion con = new Conexion();
//    Connection conn = con.getConexion();
//    ResultSet rs;
//    PreparedStatement ps;
    
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
    
    
    
    
    
    
    public InternalFramePersonalMant() {
        initComponents();
        txtId.setVisible(false);
    }

    
    
    
    private void limpiarCajas() {

        txtCodigo.setText(null);
        txtIdentificacion.setText(null);
        txtNombres.setText(null);
        txtApellidos.setText(null);
        txtCargo.setText(null);
        cbxSexo.setSelectedIndex(0);
        


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
        txtIdentificacion = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Personal Mantenimiento");

        jLabel1.setText("Codigo empleado");

        jLabel2.setText("Numero de Identificacion");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Cargo");

        jLabel6.setText("Sexo");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino", "Otro", " " }));

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

        txtId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtIdentificacion)
                            .addComponent(txtNombres)
                            .addComponent(txtApellidos)
                            .addComponent(txtCargo)
                            .addComponent(cbxSexo, 0, 147, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
   
        Connection con = null;

        try {

            con = getConexion();
            ps = con.prepareStatement("SELECT * FROM personal_mant WHERE codigo_empleado =?");
            ps.setString(1, txtCodigo.getText());

            rs = ps.executeQuery();

            if (rs.next()) {

                txtId.setText(rs.getString("id"));
                txtCodigo.setText(rs.getString("codigo_empleado"));
                txtIdentificacion.setText(rs.getString("id"));
                txtNombres.setText(rs.getString("nombres"));
                txtApellidos.setText(rs.getString("apellidos"));
                txtCargo.setText(rs.getString("cargo"));
                cbxSexo.setSelectedItem(rs.getString("sexo"));
                

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
            ps = con.prepareStatement("INSERT INTO personal_mant(codigo_empleado,id,nombres,apellidos,cargo,sexo) VALUES(?,?,?,?,?,?)");
            ps.setString(1, txtCodigo.getText());
            ps.setString(2, txtIdentificacion.getText());
            ps.setString(3, txtNombres.getText());
            ps.setString(4, txtApellidos.getText());
            ps.setString(5, txtCargo.getText());
            ps.setString(6, cbxSexo.getSelectedItem().toString());

            

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
        
        
        
        
        
        
        
        
        
//     try {
//            PreparedStatement guardar
//                    = conn.prepareStatement("INSERT INTO  personal_mant ( codigo_empleado, id, nombres, apellidos,cargo, sexo ) VALUES (?,?,?,?,?,?)");
//
//            guardar.setString(1, txtCodigo.getText());
//            guardar.setString(2, txtIdentificacion.getText());
//            guardar.setString(3, txtNombres.getText());
//            guardar.setString(4, txtApellidos.getText());
//            guardar.setString(5, txtCargo.getText());
//            guardar.setString(6, cbxSexo.getSelectedItem().toString());
//            
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
           ps = con.prepareStatement("UPDATE personal_mant  SET codigo_empleado=?,nombres=?,apellidos=?,cargo=?,sexo=? WHERE id=?");
           ps.setString(1, txtCodigo.getText());
           ps.setString(2, txtNombres.getText());
           ps.setString(3, txtApellidos.getText());
           ps.setString(4, txtCargo.getText());
           ps.setString(5, cbxSexo.getSelectedItem().toString()); 
           ps.setString(6, txtId.getText());           
                   
           
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
            ps = con.prepareStatement("DELETE FROM personal_mant WHERE codigo_empleado=?");
           
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
        
        
        
        
        
        
//      try {
//            PreparedStatement eliminar
//                    = conn.prepareStatement("DELETE FROM personal_mant  WHERE codigo_empleado=?");
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

    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtCargo;
    public javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    public javax.swing.JTextField txtIdentificacion;
    public javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
