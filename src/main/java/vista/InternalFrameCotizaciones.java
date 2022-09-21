
package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;




public class InternalFrameCotizaciones extends javax.swing.JInternalFrame {

   
    
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
            JOptionPane.showMessageDialog(null, e.getMessage() +  " " + "Error al Establecer Conexion");
        }
        return con;
    }
    
    
    
    
    
    
    
    public InternalFrameCotizaciones() {
        initComponents();
        txtId.setVisible(false);
    }

    
    
    
    private void limpiarCajas() {

        txtCodigoCotizacion.setText(null);
        txtConcepto.setText(null);
        txtFecha.setText(null);
        txtProveedor.setText(null);
        txtValor.setText(null);
        


    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoCotizacion = new javax.swing.JTextField();
        txtConcepto = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cotizaciones");

        jLabel1.setText("Codigo Cotizacion");

        jLabel2.setText("Concepto");

        jLabel3.setText("Proveedor");

        jLabel4.setText("Fecha cotizacion");

        jLabel5.setText("Valor Cotizacion");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoCotizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txtConcepto)
                    .addComponent(txtProveedor)
                    .addComponent(txtFecha)
                    .addComponent(txtValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
         Connection con = null;

        try {

            con = getConexion();
            ps = con.prepareStatement("SELECT * FROM cotizaciones WHERE codigo_cotizacion =?");
            ps.setString(1, txtCodigoCotizacion.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                
                txtId.setText(rs.getString("id"));
                txtCodigoCotizacion.setText(rs.getString("codigo_cotizacion"));
                txtConcepto.setText(rs.getString("concepto"));
                txtFecha.setText(rs.getString("proveedor"));
                txtProveedor.setText(rs.getString("fecha_cotizacion"));
                txtValor.setText(rs.getString("valor_cotizacion"));
                

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
            ps = con.prepareStatement("INSERT INTO cotizaciones(codigo_cotizacion,concepto,proveedor,fecha_cotizacion,valor_cotizacion) VALUES(?,?,?,?,?)");
            ps.setString(1, txtCodigoCotizacion.getText());
            ps.setString(2, txtConcepto.getText());
            ps.setString(3, txtFecha.getText());
            ps.setString(4, txtProveedor.getText());
            ps.setString(5, txtValor.getText());
            

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
        
        
        
        
        
        
        
        
        
//        try {
//            PreparedStatement guardar
//                    = conn.prepareStatement("INSERT INTO  cotizaciones ( codigo_cotizacion, concepto, proveedor, fecha_cotizacion,valor_cotizacion ) VALUES (?,?,?,?,?)");
//
//            guardar.setString(1, txtCodigoCotizacion.getText());
//            guardar.setString(2, txtConcepto.getText());
//            guardar.setString(3, txtProveedor.getText());
//            guardar.setString(4, txtFecha.getText());
//            guardar.setString(5, txtValor.getText());
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
           ps = con.prepareStatement("UPDATE cotizaciones SET codigo_cotizacion=?,concepto=?,proveedor=?,fecha_cotizacion=?,valor_cotizacion=? WHERE id=?");
           ps.setString(1, txtCodigoCotizacion.getText());
           ps.setString(2, txtConcepto.getText());
           ps.setString(3, txtProveedor.getText());
           ps.setString(4, txtFecha.getText());
           ps.setString(5, txtValor.getText());
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
            ps = con.prepareStatement("DELETE FROM cotizaciones WHERE codigo_cotizacion=?");
           
            ps.setString(1, txtCodigoCotizacion.getText());
            

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
//                    = conn.prepareStatement("DELETE FROM cotizaciones  WHERE codigo_cotizacion=?");
//
//            eliminar.setString(1, txtCodigoCotizacion.getText());
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
    public javax.swing.JTextField txtCodigoCotizacion;
    public javax.swing.JTextField txtConcepto;
    public javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    public javax.swing.JTextField txtProveedor;
    public javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
