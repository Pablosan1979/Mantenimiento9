package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class InternalFrameAlquiler extends javax.swing.JInternalFrame {

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
            JOptionPane.showMessageDialog(null, e.getMessage() + " " +  " Error al Establecer conexion");
        }
        return con;
    }

    
    
    
    
    
    public InternalFrameAlquiler() {
        initComponents();
        txtId.setVisible(false);
        
    }
    
    
    
    
    
    

    private void limpiarCajas() {

        txtCodigoAlquiler.setText(null);
        txtConceptoAlquiler.setText(null);
        txtFechaAlquiler.setText(null);
        txtFechaDevolucion.setText(null);
        txtProveedor.setText(null);
        txtValorAlquiler.setText(null);

    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoAlquiler = new javax.swing.JTextField();
        txtConceptoAlquiler = new javax.swing.JTextField();
        txtFechaAlquiler = new javax.swing.JTextField();
        txtFechaDevolucion = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtValorAlquiler = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Alquiler");

        jLabel1.setText("Codigo Alquiler");

        jLabel2.setText("Concepto");

        jLabel3.setText("Fecha de Alquiler");

        jLabel4.setText("Fecha Devolucion");

        jLabel5.setText("Proveedor");

        jLabel6.setText("Valor Alquiler");

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
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txtProveedor)
                                    .addComponent(txtValorAlquiler)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txtConceptoAlquiler)
                                    .addComponent(txtFechaAlquiler))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtConceptoAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    
    
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        Connection con = null;

        try {

            con = getConexion();
            ps = con.prepareStatement("SELECT * FROM alquiler WHERE codigo =?");
            ps.setString(1, txtCodigoAlquiler.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                
                txtId.setText(rs.getString("id"));

                txtCodigoAlquiler.setText(rs.getString("codigo"));
                txtConceptoAlquiler.setText(rs.getString("concepto"));
                txtFechaAlquiler.setText(rs.getString("fecha_alquiler"));
                txtFechaDevolucion.setText(rs.getString("fecha_devolucion"));
                txtProveedor.setText(rs.getString("proveedor"));
                txtValorAlquiler.setText(rs.getString("valor"));

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
            ps = con.prepareStatement("INSERT INTO alquiler(codigo,concepto,fecha_alquiler,fecha_devolucion,proveedor, valor) VALUES(?,?,?,?,?,?)");
            ps.setString(1, txtCodigoAlquiler.getText());
            ps.setString(2, txtConceptoAlquiler.getText());
            ps.setString(3, txtFechaAlquiler.getText());
            ps.setString(4, txtFechaDevolucion.getText());
            ps.setString(5, txtProveedor.getText());
            ps.setString(6, txtValorAlquiler.getText());

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardaddo");
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
//                    = conn.prepareStatement("INSERT INTO  alquiler ( codigo_alquiler, concepto, fecha_alquiler, fecha_devolucion, proveedor,valor ) VALUES (?,?,?,?,?,?)");
//
//            guardar.setString(1, txtCodigoAlquiler.getText());
//            guardar.setString(2, txtConceptoAlquiler.getText());
//            guardar.setString(3, txtFechaAlquiler.getText());
//            guardar.setString(4, txtFechaDevolucion.getText());
//            guardar.setString(5, txtProveedor.getText());
//            guardar.setString(6, txtValorAlquiler.getText());
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
           ps = con.prepareStatement("UPDATE alquiler SET codigo=?,concepto=?,fecha_alquiler=?,fecha_devolucion=?,proveedor=?,valor=? WHERE id=?");
           ps.setString(1, txtCodigoAlquiler.getText());
           ps.setString(2, txtConceptoAlquiler.getText());
           ps.setString(3, txtFechaAlquiler.getText());
           ps.setString(4, txtFechaDevolucion.getText());
           ps.setString(5, txtProveedor.getText());
           ps.setString(6, txtValorAlquiler.getText());
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
            ps = con.prepareStatement("DELETE FROM alquiler WHERE codigo=?");

            ps.setString(1, txtCodigoAlquiler.getText());

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
//                    = conn.prepareStatement("DELETE FROM alquiler  WHERE codigo_alquiler=?");
//
//            eliminar.setString(1, txtCodigoAlquiler.getText());
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField txtCodigoAlquiler;
    public javax.swing.JTextField txtConceptoAlquiler;
    public javax.swing.JTextField txtFechaAlquiler;
    public javax.swing.JTextField txtFechaDevolucion;
    private javax.swing.JTextField txtId;
    public javax.swing.JTextField txtProveedor;
    public javax.swing.JTextField txtValorAlquiler;
    // End of variables declaration//GEN-END:variables
}
