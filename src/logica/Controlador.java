package logica;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.FigurasEnum;

public class Controlador extends Canvas implements MouseListener, MouseMotionListener {

    private List<Point> points;
    private Path2D lienzo;
    private int dx, dy, x, y;
    private Point puntoInicial, puntoFinal;
    private Color[] colores ;
    private FigurasEnum figuraActual;
    public Color color;
    public int grosorLinea;

    public Controlador() {
        this.color = Color.black;
        this.setBackground(Color.white);
        this.lienzo = new Path2D.Float();
        this.grosorLinea = 1;
        this.puntoInicial = new Point();
        this.puntoFinal = new Point();
        this.figuraActual = FigurasEnum.LAPIZ;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D draw = (Graphics2D) g;
        draw.setColor(Color.white);
        draw.fillRect(0, 0, this.getWidth(), this.getHeight());
        //draw.setStroke(new BasicStroke(this.grosorLinea));
        draw.setColor(this.color);
        draw.draw(this.lienzo);
    }
    
    @Override
    // Se invoca después de presionar y soltar un botón del mouse en un mismo punto.
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    //Se invocauna vez cada vez que se presiona un botón del mouse.
    public void mousePressed(MouseEvent e) {
        
        this.puntoInicial = e.getPoint();

        if (this.figuraActual == FigurasEnum.LAPIZ) {
            this.lienzo.moveTo(e.getX(), e.getY());
        }
    }

    @Override
    //Se invoca cada vez que se suelta un botón del mouse
    public void mouseReleased(MouseEvent e) {

        this.dx = (int) (e.getPoint().getX() - this.puntoInicial.getX());
        this.dy = (int) (e.getPoint().getY() - this.puntoInicial.getY());

        System.out.println("punto inicial: " + this.puntoInicial.getX() + ", " + (int) this.puntoInicial.getY());
        System.out.println("punto final: " + this.puntoFinal.getX() + ", " + (int) this.puntoFinal.getY());
        System.out.println("dx: " + dx);
        System.out.println("dy: " + dx);

        if (this.figuraActual == FigurasEnum.CIRCULO) {
            if (dx < 0 || dy < 0) {                
                this.lienzo.append(new Ellipse2D.Double((int) this.puntoFinal.getX(), (int) this.puntoFinal.getY(), Math.abs(dx), Math.abs(dy)), false);
            } else {
                this.lienzo.append(new Ellipse2D.Double((int) this.puntoInicial.getX(), (int) this.puntoInicial.getY(), Math.abs(dx), Math.abs(dy)), false);
            }
        } else if (this.figuraActual == FigurasEnum.RECTANGULO) {
            if (dx < 0 || dy < 0) {
                this.lienzo.append(new Rectangle2D.Double(this.puntoFinal.getX(), (int) this.puntoFinal.getY(), Math.abs(dx), Math.abs(dy)), false);
            } else {
                this.lienzo.append(new Rectangle2D.Double(this.puntoInicial.getX(), (int) this.puntoInicial.getY(), Math.abs(dx), Math.abs(dy)), false);
            }
        } else if (this.figuraActual == FigurasEnum.RECTA) {
            this.lienzo.append(new Line2D.Double(this.puntoInicial.getX(), this.puntoInicial.getY(), this.puntoFinal.getX(), this.puntoFinal.getY()), false);
        }
        repaint();
    }

    @Override
    //Se invoca cuando el puntero entra del lienzo.
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    //Se invoca cuando el puntero sale del lienzo.
    public void mouseExited(MouseEvent e) {

    }

    @Override
    //Se invoca cada vez que el mouse se mueve mientras se presiona un botón del mouse.
    public void mouseDragged(MouseEvent e) {
        
        this.puntoFinal = e.getPoint();
        this.x = e.getX();
        this.y = e.getY();
        this.dx = (int) (e.getPoint().getX() - this.puntoInicial.getX());
        this.dy = (int) (e.getPoint().getY() - this.puntoInicial.getY());

        if (this.figuraActual == FigurasEnum.LAPIZ) {
            this.lienzo.lineTo(this.x, this.y);
        } else if (this.figuraActual == FigurasEnum.CIRCULO) {
            if (dx < 0 || dy < 0) {
                this.getGraphics().drawOval((int) this.puntoFinal.getX(), (int) this.puntoFinal.getY(), Math.abs(dx), Math.abs(dy)); 
                pausa();
            } else {
                this.getGraphics().drawOval((int) this.puntoInicial.getX(), (int) this.puntoInicial.getY(), Math.abs(dx), Math.abs(dy));
                pausa();
            }
        } else if (this.figuraActual == FigurasEnum.RECTANGULO) {
            if (dx < 0 || dy < 0) {
                this.getGraphics().drawRect((int) this.puntoFinal.getX(), (int) this.puntoFinal.getY(), Math.abs(dx), Math.abs(dy));
                pausa();
            } else {
                this.getGraphics().drawRect((int) this.puntoInicial.getX(), (int) this.puntoInicial.getY(), Math.abs(dx), Math.abs(dy));
                pausa();
            }
        } else if (this.figuraActual == FigurasEnum.RECTA) {
            this.getGraphics().drawLine((int) this.puntoInicial.getX(), (int) this.puntoInicial.getY(), (int) this.puntoFinal.getX(), (int) this.puntoFinal.getY());
            pausa();
        }
        repaint();
    }

    @Override
    // Se invoca cada vez que se mueve el mouse y no se presiona un botón del mouse.
    public void mouseMoved(MouseEvent e) {
    }

    // Limpia todo el lienzo
    public void Limpiar_Pant() {
        this.lienzo.reset();
        repaint();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getGrosorLinea() {
        return grosorLinea;
    }

    public void setGrosorLinea(int grosorLinea) {
        this.grosorLinea = grosorLinea;
    }

    public Color[] getColores() {
        return colores;
    }

    public void setColores(Color[] colores) {
        this.colores = colores;
    }

    public FigurasEnum getFiguraActual() {
        return figuraActual;
    }

    public void setFiguraActual(FigurasEnum figuraActual) {
        this.figuraActual = figuraActual;
    }
    
    public void pausa(){
        //Pausa visualizar trazo en tiempo real 
        try {
            Thread.sleep(5);
            repaint();
        }catch (InterruptedException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

}
