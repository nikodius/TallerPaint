package presentacion;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.FigurasEnum;

public class Controlador extends Canvas implements MouseListener, MouseMotionListener {
  
    private final Vista vista; 

    public Controlador(Vista ventana) {
        vista = ventana;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D draw = (Graphics2D) g;
        draw.setColor(Color.white);
        draw.fillRect(0, 0, this.getWidth(), this.getHeight());
        draw.setStroke(new BasicStroke(vista.getModelo().getSistema().getDibujo().getGrosorLinea()));
        draw.setColor(vista.getModelo().getSistema().getDibujo().getColor());
        draw.draw(vista.getModelo().getSistema().getLienzo());
    }
    
    @Override
    // Se invoca después de presionar y soltar un botón del mouse en un mismo punto.
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    //Se invocauna vez cada vez que se presiona un botón del mouse.
    public void mousePressed(MouseEvent e) {
        
        vista.getModelo().getSistema().getDibujo().setPuntoInicial(e.getPoint());

        if (vista.getModelo().getSistema().getDibujo().getFiguraActual() == FigurasEnum.LAPIZ) {
            vista.getModelo().getSistema().getLienzo().moveTo(e.getX(), e.getY());
        }
    }

    @Override
    //Se invoca cada vez que se suelta un botón del mouse
    public void mouseReleased(MouseEvent e) {

        int dx = (int) (e.getPoint().getX() - vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX());
        int dy = (int) (e.getPoint().getY() - vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY());

        System.out.println("punto inicial: " + vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX() + ", " + (int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY());
        System.out.println("punto final: " + vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX() + ", " + (int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY());
        System.out.println("dx: " + dx);
        System.out.println("dy: " + dx);

        if (null != vista.getModelo().getSistema().getDibujo().getFiguraActual()) switch (vista.getModelo().getSistema().getDibujo().getFiguraActual()) {
            case CIRCULO:
                if (dx < 0 || dy < 0) {
                    vista.getModelo().getSistema().getLienzo().append(new Ellipse2D.Double((int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY(), Math.abs(dx), Math.abs(dy)), false);
                } else {
                    vista.getModelo().getSistema().getLienzo().append(new Ellipse2D.Double((int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY(), Math.abs(dx), Math.abs(dy)), false);
                }   break;
            case RECTANGULO:
                if (dx < 0 || dy < 0) {
                    vista.getModelo().getSistema().getLienzo().append(new Rectangle2D.Double(vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY(), Math.abs(dx), Math.abs(dy)), false);
                } else {
                    vista.getModelo().getSistema().getLienzo().append(new Rectangle2D.Double(vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY(), Math.abs(dx), Math.abs(dy)), false);
                }   break;
            case RECTA:
                vista.getModelo().getSistema().getLienzo().append(new Line2D.Double(vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX(), vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY(), vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX(), vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY()), false);
                break;
            default:
                break;
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
        
        vista.getModelo().getSistema().getDibujo().setPuntoFinal(e.getPoint());
        int dx = (int) (vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX() - vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX());
        int dy = (int) (vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY() - vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY());

        if (null != vista.getModelo().getSistema().getDibujo().getFiguraActual()) switch (vista.getModelo().getSistema().getDibujo().getFiguraActual()) {
            case LAPIZ:
                vista.getModelo().getSistema().getLienzo().lineTo(vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX(), vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY());
                break;
            case CIRCULO: 
                if (dx < 0 || dy < 0) {
                    this.getGraphics().drawOval((int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY(), Math.abs(dx), Math.abs(dy));
//                    pausa();
                } else {
                    this.getGraphics().drawOval((int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY(), Math.abs(dx), Math.abs(dy));
//                    pausa();
                }   break;
            case RECTANGULO:
                if (dx < 0 || dy < 0) {
                    this.getGraphics().drawRect((int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY(), Math.abs(dx), Math.abs(dy));
//                    pausa();
                } else {
                    this.getGraphics().drawRect((int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY(), Math.abs(dx), Math.abs(dy));
//                    pausa();
                }   break;
            case RECTA:
                this.getGraphics().drawLine((int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoInicial().getY(), (int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getX(), (int) vista.getModelo().getSistema().getDibujo().getPuntoFinal().getY());
//                pausa();
                break;
            default:
                break;
        }
        repaint();
    }

    @Override
    // Se invoca cada vez que se mueve el mouse y no se presiona un botón del mouse.
    public void mouseMoved(MouseEvent e) {
    }

    // Limpia todo el lienzo
    public void Limpiar_Pant() {
        vista.getModelo().getSistema().getLienzo().reset();
        repaint();
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
