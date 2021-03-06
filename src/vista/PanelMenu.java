/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlMenu;

/**
 *
 * @author francisco
 */
public class PanelMenu extends javax.swing.JPanel {

    /**
     * Creates new form PanelMenu
     */
    public PanelMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Registro_Productos = new javax.swing.JButton();
        jButton_Registro_Proveedore = new javax.swing.JButton();
        jButton_Compras = new javax.swing.JButton();
        jButton_Ventas = new javax.swing.JButton();
        jButton_Reporte_Utilidades = new javax.swing.JButton();
        jButton_Inventario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_Salir = new javax.swing.JButton();

        setBackground(new java.awt.Color(214, 247, 238));

        jButton_Registro_Productos.setBackground(new java.awt.Color(248, 245, 203));
        jButton_Registro_Productos.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Registro_Productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435265347_folder_add.png"))); // NOI18N
        jButton_Registro_Productos.setText("Módulo de registro productos");

        jButton_Registro_Proveedore.setBackground(new java.awt.Color(254, 221, 221));
        jButton_Registro_Proveedore.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Registro_Proveedore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435265338_user_add.png"))); // NOI18N
        jButton_Registro_Proveedore.setText("Módulo de registro proveedores");

        jButton_Compras.setBackground(new java.awt.Color(171, 239, 173));
        jButton_Compras.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435265379_shoppingcart_add.png"))); // NOI18N
        jButton_Compras.setText("Modulo de compra");

        jButton_Ventas.setBackground(new java.awt.Color(242, 185, 254));
        jButton_Ventas.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435265367_shoppingcart_checkout.png"))); // NOI18N
        jButton_Ventas.setText("Módulo de ventas");

        jButton_Reporte_Utilidades.setBackground(new java.awt.Color(160, 245, 255));
        jButton_Reporte_Utilidades.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Reporte_Utilidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435265358_calculator.png"))); // NOI18N
        jButton_Reporte_Utilidades.setText("Reporte de utilidades");
        jButton_Reporte_Utilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reporte_UtilidadesActionPerformed(evt);
            }
        });

        jButton_Inventario.setBackground(new java.awt.Color(194, 212, 253));
        jButton_Inventario.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435265386_message.png"))); // NOI18N
        jButton_Inventario.setText("Módulo de inventario");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Minisuper el Alto");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        jButton_Salir.setBackground(new java.awt.Color(254, 230, 230));
        jButton_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir2.png"))); // NOI18N
        jButton_Salir.setText(" Salir ");
        jButton_Salir.setActionCommand("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Registro_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Registro_Proveedore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Compras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Ventas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Inventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Reporte_Utilidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Salir)
                        .addGap(367, 367, 367))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Reporte_Utilidades)
                            .addComponent(jButton_Registro_Productos))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Registro_Proveedore)
                            .addComponent(jButton_Inventario)))
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Compras)
                    .addComponent(jButton_Ventas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton_Salir)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Reporte_UtilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reporte_UtilidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Reporte_UtilidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Compras;
    private javax.swing.JButton jButton_Inventario;
    private javax.swing.JButton jButton_Registro_Productos;
    private javax.swing.JButton jButton_Registro_Proveedore;
    private javax.swing.JButton jButton_Reporte_Utilidades;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_Ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public static final String BTN_COMPRAS = "Modulo de compra";
    public static final String BTN_INVENTARIO = "Módulo de inventario";
    public static final String BTN_REGISTRO_PRODUCTOS = "Módulo de registro productos";
    public static final String BTN_REGISTRO_PROVEEDORES = "Módulo de registro proveedores";
    public static final String BTN_REPORTE_UTILIDADES = "Reporte de utilidades";
    public static final String BTN_VENTAS = "Módulo de ventas";
    public static final String BTN_SALIR = "Salir";
    
    
    public void escuchar (ControlMenu cm) {
        this.jButton_Compras.addActionListener(cm);
        this.jButton_Inventario.addActionListener(cm);
        this.jButton_Registro_Productos.addActionListener(cm);
        this.jButton_Registro_Proveedore.addActionListener(cm);
        this.jButton_Reporte_Utilidades.addActionListener(cm);
        this.jButton_Ventas.addActionListener(cm);
        this.jButton_Salir.addActionListener(cm);
    }


}
