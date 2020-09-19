
import presentacion.Modelo;

public class Launcher {

    private Modelo modeloApp;
    
    public static void main(String[] args) {
       new Launcher();
    }
    
    public Launcher() {
        modeloApp = new Modelo();
        modeloApp.iniciar();        
    }   
    
}
