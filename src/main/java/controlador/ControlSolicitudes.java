
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.CrearSolicitudes;
import modelo.Solicitudes;
import vista.InternalFrameSolicitudes;


public class ControlSolicitudes implements ActionListener {
    
    private Solicitudes sol;
    private CrearSolicitudes solc;
    private InternalFrameSolicitudes solfrm;
    
    public ControlSolicitudes(Solicitudes sol,CrearSolicitudes solc,InternalFrameSolicitudes solfrm){
        this.sol = sol;
        this.solc = solc;
        this.solfrm = solfrm;
        this.solfrm.btnGuardar.addActionListener(this);
        this.solfrm.btnModificar.addActionListener(this);
        this.solfrm.btnEliminar.addActionListener(this);
        this.solfrm.btnLimpiar.addActionListener(this);
        this.solfrm.btnBuscar.addActionListener(this);
        
        
    }
    
    public void iniciar() {
        solfrm.setTitle("Solicitudes");
      solfrm.setLocationRelativeTo(null);
    }
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == solfrm.btnGuardar){
           sol.setCodigo(solfrm.txtCodigo.getText());
           sol.setNombre(solfrm.txtMaquina.getText());
           sol.setArea(solfrm.txtArea.getText());
           sol.setFalla(solfrm.txtFalla.getText());
           
           if(solc.registrar(sol)){
               JOptionPane.showMessageDialog(null, "Registro Guardado");
               Limpiar();
           }else{
               JOptionPane.showMessageDialog(null, "Error al Guardar");
               Limpiar();
           }
        }
        
        if(e.getSource()== solfrm.btnModificar){
            sol.setCodigo(solfrm.txtCodigo.getText());
            sol.setNombre(solfrm.txtArea.getText());
            sol.setFalla(solfrm.txtFalla.getText());
            
            if(solc.modificar(sol)){
                JOptionPane.showMessageDialog(null, "Registro modificado");
                Limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                Limpiar();
            }
        }
        
        
        if(e.getSource()== solfrm.btnEliminar){
            
            if(solc.eliminar(sol)){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                Limpiar();
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                Limpiar();
            }
            
            if(e.getSource()==solfrm.btnBuscar){
                sol.setCodigo(solfrm.txtCodigo.getText());
                
                if(solc.buscar(sol)){
                    
                    solfrm.txtCodigo.setText(sol.getCodigo());
                    solfrm.txtMaquina.setText(sol.getNombre());
                    solfrm.txtArea.setText(sol.getArea());
                    solfrm.txtFalla.setText(sol.getFalla());
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No se Encontro Registro");
                    Limpiar();
                }
                
            }
            
            if(e.getSource()== solfrm.btnLimpiar){
                Limpiar();
            }
            
        }
        
    }
    
    public void Limpiar(){
        solfrm.txtCodigo.setText(null);
        solfrm.txtMaquina.setText(null);
        solfrm.txtArea.setText(null);
        solfrm.txtFalla.setText(null);
    }
    
}
