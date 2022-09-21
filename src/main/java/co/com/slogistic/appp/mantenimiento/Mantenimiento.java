
package co.com.slogistic.appp.mantenimiento;

//import controlador.ControlMaquina;
import modelo.ConsultasMaquina;
import modelo.Maquina;
import vista.Home;
import vista.frmMaquina;


public class Mantenimiento {

    public static void main(String[] args) {
        
        Maquina maqq = new Maquina();
        ConsultasMaquina maqc = new ConsultasMaquina();
        frmMaquina frmm = new frmMaquina();
        Home inicio = new Home();
        
//        ControlMaquina ctrl = new ControlMaquina(maqq,maqc,frmm);
//        ctrl.iniciar();
//      frmm.setVisible(true);
        inicio.setVisible(true);
        
        
           
        
    }
}
