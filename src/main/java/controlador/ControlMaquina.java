//package controlador;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JOptionPane;
//import modelo.ConsultasMaquina;
//import modelo.Maquina;
//import vista.frmMaquina;
//
//public class ControlMaquina implements ActionListener {
//
//    private Maquina maqq;
//    private ConsultasMaquina maqc;
//    private frmMaquina frmm;
//
//    public ControlMaquina(Maquina maqq, ConsultasMaquina maqc, frmMaquina frmm) {
//        this.maqq = maqq;
//        this.maqc = maqc;
//        this.frmm = frmm;
//        this.frmm.btnGuardar.addActionListener(this);
//        this.frmm.btnModificar.addActionListener(this);
//        this.frmm.btnEliminar.addActionListener(this);
//        this.frmm.btnLimpiar.addActionListener(this);
//        this.frmm.btnBuscar.addActionListener(this);
//
//    }
//
//    public void iniciar() {
//        frmm.setTitle("Maquinas");
//        frmm.setLocationRelativeTo(null);
//        frmm.txtId.setVisible(false);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == frmm.btnGuardar) {
//            maqq.setCodigo(frmm.txtCodigo.getText());
//            maqq.setNombre(frmm.txtNombre.getText());
//            maqq.setColor(frmm.txtColor.getText());
//
//            if (maqc.registrar(maqq)) {
//                JOptionPane.showMessageDialog(null, "Registro guardado");
//                limpiar();
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al Guardar");
//                limpiar();
//            }
//
//        }
//
//        if (e.getSource() == frmm.btnModificar) {
//            maqq.setId(Integer.parseInt(frmm.txtId.getText()));
//            maqq.setCodigo(frmm.txtCodigo.getText());
//            maqq.setNombre(frmm.txtNombre.getText());
//            maqq.setColor(frmm.txtColor.getText());
//
//            if (maqc.modificar(maqq)) {
//                JOptionPane.showMessageDialog(null, "Registro Modificado");
//                limpiar();
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al Modificar");
//                limpiar();
//            }
//
//        }
//
//        if (e.getSource() == frmm.btnEliminar) {
//            maqq.setId(Integer.parseInt(frmm.txtId.getText()));
//
//            if (maqc.eliminar(maqq)) {
//                JOptionPane.showMessageDialog(null, "Registro Eliminado");
//                limpiar();
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al Eliminar");
//                limpiar();
//            }
//
//        }
//
//        if (e.getSource() == frmm.btnBuscar) {
//            maqq.setCodigo(frmm.txtCodigo.getText());
//
//            if (maqc.buscar(maqq)) {
//
//                frmm.txtId.setText(String.valueOf(maqq.getId()));
//                frmm.txtCodigo.setText(maqq.getCodigo());
//                frmm.txtNombre.setText(maqq.getNombre());
//                frmm.txtColor.setText(String.valueOf(maqq.getColor()));
//
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontró Registro");
//                limpiar();
//            }
//
//        }
//
//        if (e.getSource() == frmm.btnLimpiar) {
//            limpiar();
//        }
//
//    }
//
//    public void limpiar() {
//        frmm.txtId.setText(null);
//        frmm.txtCodigo.setText(null);
//        frmm.txtNombre.setText(null);
//        frmm.txtColor.setText(null);
//
//    }
//}
