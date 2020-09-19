package presentacion;

import java.awt.Color;
import logica.Sistema;

public class Modelo {

    private Vista vista;
    private Sistema sistema;

    public Vista getVentanaPrincipal() {
        if (vista == null) {
            vista = new Vista(this);
        }
        return vista;
    }

    public Sistema getSistema() {
        if (sistema == null) {
            sistema = new Sistema();
        }
        return sistema;
    }

    public void iniciar() {
        Vista ventana = getVentanaPrincipal();
        ventana.setBounds(20, 40, 800, 600);
        ventana.getContentPane().setBackground(Color.LIGHT_GRAY);
        //Lanzar vista
        ventana.setVisible(true);
    }
}
