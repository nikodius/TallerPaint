package logica;

import java.awt.geom.Path2D;
import java.io.File;
import persistencia.DatosDTO;

/**
 * Clase principal logica para creacion de dibujos, guardar y abrir archivos
 */
public class Sistema {

    private Dibujo dibujo;
    private DatosDTO datos;

    private Path2D lienzo;

    public Sistema() {
        this.dibujo = new Dibujo();
        this.lienzo = new Path2D.Float();
    }

    /**
     * Metodo para abrir dibujo de un archivo guardado
     * @param nombreArchivo
     * @throws Exception 
     */
    public void abrirArchivo(File nombreArchivo) throws Exception {
        //pendiente de implementar 
    }

    /**
     * Metodo para guardar dibujo en un archivo
     * @param nombreArchivo
     * @throws Exception 
     */
    public void guardarArchivo(File nombreArchivo) throws Exception {
        //pendiente de implementar 
    }
    
    public Dibujo getDibujo() {
        return dibujo;
    }

    public void setDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    public DatosDTO getDatos() {
        return datos;
    }

    public void setDatos(DatosDTO datos) {
        this.datos = datos;
    }
    
    public Path2D getLienzo() {
        return lienzo;
    }

    public void setLienzo(Path2D lienzo) {
        this.lienzo = lienzo;
    }

}
