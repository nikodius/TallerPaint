package logica;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Path2D;


public class Dibujo {
    
    private Color color;
    private Color colorFondo;
    private int grosorLinea;
    private Point puntoInicial, puntoFinal;
    private FigurasEnum figuraActual;
    
    public Dibujo() {
        this.color = Color.black;
        this.colorFondo = Color.white;
        this.grosorLinea = 1;
        this.figuraActual = FigurasEnum.LAPIZ;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }
    
    public int getGrosorLinea() {
        return grosorLinea;
    }

    public void setGrosorLinea(int grosorLinea) {
        this.grosorLinea = grosorLinea;
    }

    public Point getPuntoInicial() {
        return puntoInicial;
    }

    public void setPuntoInicial(Point puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

    public Point getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(Point puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public FigurasEnum getFiguraActual() {
        return figuraActual;
    }

    public void setFiguraActual(FigurasEnum figuraActual) {
        this.figuraActual = figuraActual;
    }
    
}
