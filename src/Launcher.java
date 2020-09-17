
import java.awt.Color;
import presentacion.Vista;

public class Launcher {

    public static void main(String[] args) {
        //Crear nueva vista y caracteristicas
        Vista vista = new Vista();
        vista.setBounds(20, 40, 800, 600);
        vista.getContentPane().setBackground(Color.LIGHT_GRAY);
        //Lanzar vista
        vista.setVisible(true);
    }
    
}
