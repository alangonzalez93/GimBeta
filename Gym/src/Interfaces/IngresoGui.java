/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import org.edisoncor.gui.panel.PanelImage;


/**
 *
 * @author Nico
 */
public class IngresoGui extends javax.swing.JFrame {

    

    /**
     * Creates new form IngresoGui
     */
    public IngresoGui() throws Exception {
        initComponents();
        /* Component[] array=panelAsistencia.getComponents();
         for(int i=0;i<array.length;i++){
         ((JLabel)array[i]).setText("12/12/2012 "+i);
         }*/
       // Iniciar();
        //start();
    }
        
    public void limpiar(){
        nombre.setText("");
        apellido.setText("");
        fechaUltPago.setText("");
        fechaVence.setText("");
        cantDias.setText("");
        Component[] array=panelAsistencia.getComponents();
        for (Component array1 : array) {
            ((JLabel) array1).setText("");
        }
    }
    
 public void cargarSonido(String nombre) throws Exception {
         File soundFile = new File(getClass().getResource("/Sonidos/"+nombre).toURI());
         AudioInputStream soundIn = AudioSystem.getAudioInputStream(soundFile);
        AudioFormat format = soundIn.getFormat();
         DataLine.Info info = new DataLine.Info(Clip.class, format);

         Clip clip = (Clip)AudioSystem.getLine(info);
         clip.open(soundIn);
         //clip.start();
         clip.loop(1);
         {
        //    Thread.yield();
         }
            //clip.stop();

    }
 
 

    public void noIdentifado(){
        nombre.setText("?????");
        apellido.setText("?????");
        fechaUltPago.setText("?????");
        fechaVence.setText("?????");
        cantDias.setText("??");
        Component[] array=panelAsistencia.getComponents();
        for (Component array1 : array) {
            ((JLabel) array1).setText("");
        }
    }

    public JPanel getPanelAsistencia() {
        return panelAsistencia;
    }

    public JMenuItem getBusquedaManual() {
        return busquedaManual;
    }

    public JMenuItem getLimpiarVentana() {
        return limpiarVentana;
    }
    
    public void setActionListener(ActionListener lis){
        limpiarVentana.addActionListener(lis);
        busquedaManual.addActionListener(lis);
        darDeAlta.addActionListener(lis);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechaUltPago = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaVence = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        cantDias = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoHuella = new javax.swing.JTextArea();
        imHuella = new org.edisoncor.gui.panel.PanelImage();
        panelAsistencia = new javax.swing.JPanel();
        dia1 = new javax.swing.JLabel();
        dia2 = new javax.swing.JLabel();
        dia3 = new javax.swing.JLabel();
        dia4 = new javax.swing.JLabel();
        dia5 = new javax.swing.JLabel();
        dia6 = new javax.swing.JLabel();
        dia7 = new javax.swing.JLabel();
        dia8 = new javax.swing.JLabel();
        dia9 = new javax.swing.JLabel();
        dia10 = new javax.swing.JLabel();
        dia11 = new javax.swing.JLabel();
        dia12 = new javax.swing.JLabel();
        dia13 = new javax.swing.JLabel();
        dia14 = new javax.swing.JLabel();
        dia15 = new javax.swing.JLabel();
        dia16 = new javax.swing.JLabel();
        dia17 = new javax.swing.JLabel();
        dia18 = new javax.swing.JLabel();
        dia19 = new javax.swing.JLabel();
        dia20 = new javax.swing.JLabel();
        dia21 = new javax.swing.JLabel();
        dia22 = new javax.swing.JLabel();
        dia23 = new javax.swing.JLabel();
        dia24 = new javax.swing.JLabel();
        dia25 = new javax.swing.JLabel();
        dia26 = new javax.swing.JLabel();
        dia27 = new javax.swing.JLabel();
        dia28 = new javax.swing.JLabel();
        dia29 = new javax.swing.JLabel();
        dia30 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        busquedaManual = new javax.swing.JMenuItem();
        limpiarVentana = new javax.swing.JMenuItem();
        darDeAlta = new javax.swing.JMenuItem();

        setTitle("Ingreso de socios");
        setBackground(new java.awt.Color(236, 233, 216));
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(236, 233, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del socio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century", 1, 14), java.awt.Color.black)); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        nombre.setForeground(new java.awt.Color(12, 134, 52));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("julito");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 18;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 0, 16);
        jPanel1.add(nombre, gridBagConstraints);

        apellido.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        apellido.setForeground(new java.awt.Color(12, 134, 52));
        apellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apellido.setText("Perez");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 6, 0, 0);
        jPanel1.add(apellido, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Fecha último pago:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 34, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        fechaUltPago.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        fechaUltPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaUltPago.setText("12/11/12");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 111;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 6, 0, 0);
        jPanel1.add(fechaUltPago, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Fecha de vencimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 34, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        fechaVence.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        fechaVence.setForeground(new java.awt.Color(204, 0, 0));
        fechaVence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaVence.setText("12/12/12");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.ipadx = 177;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(fechaVence, gridBagConstraints);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel36.setText("Faltan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 34, 1, 0);
        jPanel1.add(jLabel36, gridBagConstraints);

        cantDias.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cantDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantDias.setText("20");
        cantDias.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        jPanel1.add(cantDias, gridBagConstraints);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel38.setText("Días para el vencimiento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 6, 1, 0);
        jPanel1.add(jLabel38, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(236, 233, 216));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Control de ingreso");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setMaximumSize(new java.awt.Dimension(340, 44));
        jLabel2.setMinimumSize(new java.awt.Dimension(340, 44));
        jLabel2.setPreferredSize(new java.awt.Dimension(340, 44));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Costa Norte logo-centro.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Costa Norte logo-centro.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(236, 233, 216));

        textoHuella.setEditable(false);
        textoHuella.setBackground(new java.awt.Color(236, 233, 216));
        textoHuella.setColumns(20);
        textoHuella.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        textoHuella.setForeground(new java.awt.Color(0, 153, 0));
        textoHuella.setRows(3);
        jScrollPane1.setViewportView(textoHuella);

        javax.swing.GroupLayout imHuellaLayout = new javax.swing.GroupLayout(imHuella);
        imHuella.setLayout(imHuellaLayout);
        imHuellaLayout.setHorizontalGroup(
            imHuellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        imHuellaLayout.setVerticalGroup(
            imHuellaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imHuella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imHuella, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelAsistencia.setBackground(new java.awt.Color(236, 233, 216));
        panelAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Días de asistencia", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 0, 14), java.awt.Color.black)); // NOI18N
        panelAsistencia.setLayout(new java.awt.GridLayout(3, 10, 1, 0));

        dia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia1);

        dia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia2);

        dia3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia3);

        dia4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia4);

        dia5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia5);

        dia6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia6);

        dia7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia7);

        dia8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia8);

        dia9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia9);

        dia10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia10);

        dia11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia11);

        dia12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia12);

        dia13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia13);

        dia14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia14);

        dia15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia15);

        dia16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia16);

        dia17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia17);

        dia18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia18);

        dia19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia19);

        dia20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia20);

        dia21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia21);

        dia22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia22);

        dia23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia23);

        dia24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia24);

        dia25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia25);

        dia26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia26);

        dia27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia27);

        dia28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia28);

        dia29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia29);

        dia30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelAsistencia.add(dia30);

        jMenu1.setText("Archivo");

        busquedaManual.setText("Busqueda manual");
        jMenu1.add(busquedaManual);

        limpiarVentana.setText("Limpiar ventana");
        jMenu1.add(limpiarVentana);

        darDeAlta.setText("Dar de alta");
        darDeAlta.setToolTipText("Dar de alta al socio inactivo y registrar pago");
        darDeAlta.setEnabled(false);
        jMenu1.add(darDeAlta);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelImage1, panelImage2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panelAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new IngresoGui().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(IngresoGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JLabel getApellido() {
        return apellido;
    }

    public JLabel getCantDias() {
        return cantDias;
    }

    public PanelImage getImHuella() {
        return imHuella;
    }

    public JLabel getFechaUltPago() {
        return fechaUltPago;
    }

    public JLabel getFechaVence() {
        return fechaVence;
    }

    public JLabel getNombre() {
        return nombre;
    }

    public JTextArea getTextoHuella() {
        return textoHuella;
    }

    public JMenuItem getDarDeAlta() {
        return darDeAlta;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JMenuItem busquedaManual;
    private javax.swing.JLabel cantDias;
    private javax.swing.JMenuItem darDeAlta;
    private javax.swing.JLabel dia1;
    private javax.swing.JLabel dia10;
    private javax.swing.JLabel dia11;
    private javax.swing.JLabel dia12;
    private javax.swing.JLabel dia13;
    private javax.swing.JLabel dia14;
    private javax.swing.JLabel dia15;
    private javax.swing.JLabel dia16;
    private javax.swing.JLabel dia17;
    private javax.swing.JLabel dia18;
    private javax.swing.JLabel dia19;
    private javax.swing.JLabel dia2;
    private javax.swing.JLabel dia20;
    private javax.swing.JLabel dia21;
    private javax.swing.JLabel dia22;
    private javax.swing.JLabel dia23;
    private javax.swing.JLabel dia24;
    private javax.swing.JLabel dia25;
    private javax.swing.JLabel dia26;
    private javax.swing.JLabel dia27;
    private javax.swing.JLabel dia28;
    private javax.swing.JLabel dia29;
    private javax.swing.JLabel dia3;
    private javax.swing.JLabel dia30;
    private javax.swing.JLabel dia4;
    private javax.swing.JLabel dia5;
    private javax.swing.JLabel dia6;
    private javax.swing.JLabel dia7;
    private javax.swing.JLabel dia8;
    private javax.swing.JLabel dia9;
    private javax.swing.JLabel fechaUltPago;
    private javax.swing.JLabel fechaVence;
    private org.edisoncor.gui.panel.PanelImage imHuella;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem limpiarVentana;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelAsistencia;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private javax.swing.JTextArea textoHuella;
    // End of variables declaration//GEN-END:variables
}
