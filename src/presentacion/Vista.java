
package presentacion;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import logica.FigurasEnum;

public class Vista extends javax.swing.JFrame {

    private Controlador controlador;
    private final Modelo modelo;

    public Vista(Modelo modelo) { 
        this.modelo = modelo;
        controlador = getControl();
        initComponents();
        iniciarEventos();
        //titulo e icono aplicacion
        ImageIcon img = new ImageIcon(this.getClass().getResource("/imagenes/logo_paleta.png"));
        this.setIconImage(img.getImage());     
        this.setTitle("Paint / Informatica 1 / Taller 1");
    }
    
    public Controlador getControl() {
        if(controlador == null){
            controlador = new Controlador(this);
        }
        return controlador;
    }
    
    private void iniciarEventos(){
        getControl().setBounds(95, 90, 677, 401);
        jLabel_Select.setOpaque(true);
        
        getControl().addMouseListener(new MouseListener() {
           
            @Override
            // Se invoca después de presionar y soltar un botón del mouse en un mismo punto.
            public void mouseClicked(MouseEvent e) {
                 
            }

            @Override
            //Se invocauna vez cada vez que se presiona un botón del mouse. 
            public void mousePressed(MouseEvent e) {
                getControl().mousePressed(e);
            }

            @Override
            //Se invoca cada vez que se suelta un botón del mouse
            public void mouseReleased(MouseEvent e) {
                getControl().mouseReleased(e);
            }

            @Override
            //Se invoca cuando el puntero entra del lienzo.
            public void mouseEntered(MouseEvent e) {

            }
            
             @Override
            //Se invoca cuando el puntero sale del lienzo.
            public void mouseExited(MouseEvent e) {

            }

        });
        
        getControl().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            //Se invoca una vez cada vez que el mouse se mueve mientras se presiona un botón del mouse.
            public void mouseDragged(MouseEvent e) {
                getControl().mouseDragged(e);
            }
        });
        this.add(getControl());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_White = new javax.swing.JButton();
        jButton_Black = new javax.swing.JButton();
        jButton_Light_Gray = new javax.swing.JButton();
        jButton_Dark_Gray = new javax.swing.JButton();
        jButton_Red = new javax.swing.JButton();
        jButton_Pink = new javax.swing.JButton();
        jButton_Orange = new javax.swing.JButton();
        jButton_Yellow = new javax.swing.JButton();
        jButton_Green = new javax.swing.JButton();
        jButton_Magenta = new javax.swing.JButton();
        jButton_Cyan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton_Brown = new javax.swing.JButton();
        jButton_Gold = new javax.swing.JButton();
        jButton_Blue = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_Select = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnDibujar = new javax.swing.JButton();
        btnCuadrado = new javax.swing.JButton();
        btnRecta = new javax.swing.JButton();
        btnCirculo = new javax.swing.JButton();
        btnLimpiar_Pant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton_White.setBackground(new java.awt.Color(255, 255, 255));
        jButton_White.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_WhiteActionPerformed(evt);
            }
        });

        jButton_Black.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BlackActionPerformed(evt);
            }
        });

        jButton_Light_Gray.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Light_Gray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Light_GrayActionPerformed(evt);
            }
        });

        jButton_Dark_Gray.setBackground(new java.awt.Color(102, 102, 102));
        jButton_Dark_Gray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Dark_GrayActionPerformed(evt);
            }
        });

        jButton_Red.setBackground(java.awt.Color.red);
        jButton_Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RedActionPerformed(evt);
            }
        });

        jButton_Pink.setBackground(new java.awt.Color(255, 204, 204));
        jButton_Pink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PinkActionPerformed(evt);
            }
        });

        jButton_Orange.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OrangeActionPerformed(evt);
            }
        });

        jButton_Yellow.setBackground(new java.awt.Color(255, 255, 51));
        jButton_Yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_YellowActionPerformed(evt);
            }
        });

        jButton_Green.setBackground(new java.awt.Color(51, 255, 0));
        jButton_Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GreenActionPerformed(evt);
            }
        });

        jButton_Magenta.setBackground(new java.awt.Color(255, 51, 255));
        jButton_Magenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MagentaActionPerformed(evt);
            }
        });

        jButton_Cyan.setBackground(new java.awt.Color(51, 255, 255));
        jButton_Cyan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CyanActionPerformed(evt);
            }
        });

        jLabel3.setText("Color");

        jButton_Brown.setBackground(new java.awt.Color(102, 0, 0));
        jButton_Brown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BrownActionPerformed(evt);
            }
        });

        jButton_Gold.setBackground(new java.awt.Color(204, 153, 0));
        jButton_Gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GoldActionPerformed(evt);
            }
        });

        jButton_Blue.setBackground(new java.awt.Color(0, 0, 255));
        jButton_Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BlueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_White, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Black, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Light_Gray, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Dark_Gray, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Red, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Pink, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Orange, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Green, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Magenta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Cyan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Blue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Brown, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Gold, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Black, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_White, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Dark_Gray, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Light_Gray, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Gold, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Brown, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Pink, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Red, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Yellow, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Orange, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Magenta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Green, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Cyan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Blue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Select");

        jLabel_Select.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setForeground(new java.awt.Color(255, 255, 255));
        jSlider1.setMaximum(10);
        jSlider1.setMinimum(1);
        jSlider1.setToolTipText("Grosor ");
        jSlider1.setValue(1);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel2.setText("Tamaño");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grosor.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnDibujar.setBackground(new java.awt.Color(255, 255, 255));
        btnDibujar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        btnDibujar.setToolTipText("Dibujo Libre");
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarActionPerformed(evt);
            }
        });

        btnCuadrado.setBackground(new java.awt.Color(255, 255, 255));
        btnCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangulo.png"))); // NOI18N
        btnCuadrado.setToolTipText("Cuadrado");
        btnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadradoActionPerformed(evt);
            }
        });

        btnRecta.setBackground(new java.awt.Color(255, 255, 255));
        btnRecta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recta.png"))); // NOI18N
        btnRecta.setToolTipText("Recta");
        btnRecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectaActionPerformed(evt);
            }
        });

        btnCirculo.setBackground(new java.awt.Color(255, 255, 255));
        btnCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png"))); // NOI18N
        btnCirculo.setToolTipText("Circuilo");
        btnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirculoActionPerformed(evt);
            }
        });

        btnLimpiar_Pant.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar_Pant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnLimpiar_Pant.setToolTipText("Limpiar Pantalla ");
        btnLimpiar_Pant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar_PantActionPerformed(evt);
            }
        });

        jLabel1.setText("Herramientas");

        btnBorrar.setBackground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrador.png"))); // NOI18N
        btnBorrar.setToolTipText("Borrador");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDibujar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCirculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar_Pant, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBorrar)
                    .addComponent(btnDibujar)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnRecta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCirculo)
                        .addComponent(btnCuadrado)
                        .addComponent(btnLimpiar_Pant)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        jMenuItem7.setText("Abrir");
        jMenu1.add(jMenuItem7);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jMenuItem2.setText("Guardar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.jpg"))); // NOI18N
        jMenuItem3.setText("Abrir");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jMenuItem4.setText("Cerrar");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acción");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deshacer.jpg"))); // NOI18N
        jMenuItem5.setText("Deshacer");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rehacer.jpg"))); // NOI18N
        jMenuItem6.setText("Rehacer");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarActionPerformed
        modelo.getSistema().getDibujo().setFiguraActual(FigurasEnum.LAPIZ);
    }//GEN-LAST:event_btnDibujarActionPerformed

    private void btnLimpiar_PantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar_PantActionPerformed
        getControl().Limpiar_Pant();
    }//GEN-LAST:event_btnLimpiar_PantActionPerformed

    private void btnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirculoActionPerformed
        modelo.getSistema().getDibujo().setFiguraActual(FigurasEnum.CIRCULO);
    }//GEN-LAST:event_btnCirculoActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        modelo.getSistema().getDibujo().setGrosorLinea(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void btnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadradoActionPerformed
        modelo.getSistema().getDibujo().setFiguraActual(FigurasEnum.RECTANGULO);
    }//GEN-LAST:event_btnCuadradoActionPerformed

    private void jButton_WhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WhiteActionPerformed
        jLabel_Select.setBackground(Color.WHITE);
        modelo.getSistema().getDibujo().setColor(Color.WHITE);
    }//GEN-LAST:event_jButton_WhiteActionPerformed

    private void jButton_BrownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BrownActionPerformed
        jLabel_Select.setBackground(new Color(102,0,0));
        modelo.getSistema().getDibujo().setColor(new Color(102,0,0));
    }//GEN-LAST:event_jButton_BrownActionPerformed

    private void jButton_BlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BlackActionPerformed
        jLabel_Select.setBackground(Color.BLACK);
        modelo.getSistema().getDibujo().setColor(Color.BLACK);
    }//GEN-LAST:event_jButton_BlackActionPerformed

    private void jButton_Light_GrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Light_GrayActionPerformed
        jLabel_Select.setBackground(Color.LIGHT_GRAY);
        modelo.getSistema().getDibujo().setColor(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton_Light_GrayActionPerformed

    private void jButton_Dark_GrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Dark_GrayActionPerformed
        jLabel_Select.setBackground(Color.DARK_GRAY);
        modelo.getSistema().getDibujo().setColor(Color.DARK_GRAY);
    }//GEN-LAST:event_jButton_Dark_GrayActionPerformed

    private void jButton_GoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GoldActionPerformed
        jLabel_Select.setBackground(new Color(204,153,0));
        modelo.getSistema().getDibujo().setColor(new Color(204,153,0));
    }//GEN-LAST:event_jButton_GoldActionPerformed

    private void jButton_RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RedActionPerformed
        jLabel_Select.setBackground(Color.RED);
        modelo.getSistema().getDibujo().setColor(Color.RED);
    }//GEN-LAST:event_jButton_RedActionPerformed

    private void jButton_PinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PinkActionPerformed
        jLabel_Select.setBackground(Color.PINK);
        modelo.getSistema().getDibujo().setColor(Color.PINK);
    }//GEN-LAST:event_jButton_PinkActionPerformed

    private void jButton_OrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OrangeActionPerformed
        jLabel_Select.setBackground(Color.ORANGE);
        modelo.getSistema().getDibujo().setColor(Color.ORANGE);
    }//GEN-LAST:event_jButton_OrangeActionPerformed

    private void jButton_YellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_YellowActionPerformed
        jLabel_Select.setBackground(Color.YELLOW);
        modelo.getSistema().getDibujo().setColor(Color.YELLOW);
    }//GEN-LAST:event_jButton_YellowActionPerformed

    private void jButton_GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GreenActionPerformed
        jLabel_Select.setBackground(Color.GREEN);
        modelo.getSistema().getDibujo().setColor(Color.GREEN);
    }//GEN-LAST:event_jButton_GreenActionPerformed

    private void jButton_MagentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MagentaActionPerformed
        jLabel_Select.setBackground(Color.MAGENTA);
        modelo.getSistema().getDibujo().setColor(Color.MAGENTA);
    }//GEN-LAST:event_jButton_MagentaActionPerformed

    private void jButton_CyanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CyanActionPerformed
        jLabel_Select.setBackground(Color.CYAN);
        modelo.getSistema().getDibujo().setColor(Color.CYAN);
    }//GEN-LAST:event_jButton_CyanActionPerformed

    private void jButton_BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BlueActionPerformed
        jLabel_Select.setBackground(Color.BLUE);
        modelo.getSistema().getDibujo().setColor(Color.BLUE);
    }//GEN-LAST:event_jButton_BlueActionPerformed

    private void btnRectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectaActionPerformed
        modelo.getSistema().getDibujo().setFiguraActual(FigurasEnum.RECTA);
    }//GEN-LAST:event_btnRectaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCirculo;
    private javax.swing.JButton btnCuadrado;
    private javax.swing.JButton btnDibujar;
    private javax.swing.JButton btnLimpiar_Pant;
    private javax.swing.JButton btnRecta;
    public javax.swing.JButton jButton_Black;
    public javax.swing.JButton jButton_Blue;
    public javax.swing.JButton jButton_Brown;
    public javax.swing.JButton jButton_Cyan;
    public javax.swing.JButton jButton_Dark_Gray;
    public javax.swing.JButton jButton_Gold;
    public javax.swing.JButton jButton_Green;
    public javax.swing.JButton jButton_Light_Gray;
    public javax.swing.JButton jButton_Magenta;
    public javax.swing.JButton jButton_Orange;
    public javax.swing.JButton jButton_Pink;
    public javax.swing.JButton jButton_Red;
    public javax.swing.JButton jButton_White;
    public javax.swing.JButton jButton_Yellow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel_Select;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

    public Modelo getModelo() {
        return modelo;
    }
}
