/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modulos;

import controlador.modulos.ControlProveedor;
import javax.swing.JLabel;

/**
 *
 * @author francisco
 */
public class PanelProveedor extends javax.swing.JPanel {

    /**
     * Creates new form PanelProveedor
     */
    public PanelProveedor() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtField_Codigo = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTxtField_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtField_Telefono = new javax.swing.JTextField();
        jButton_Agregar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jLabel_Alerta_Codigo = new javax.swing.JLabel();
        jLabel_Alerta_Nombre = new javax.swing.JLabel();
        jLabel_Alerta_Telefono = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 245, 245));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Registro proveedores");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Código:");

        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435270426_search.png"))); // NOI18N
        jButton_Buscar.setActionCommand("Buscar");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel6.setText("Telefóno:");

        jTxtField_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtField_TelefonoActionPerformed(evt);
            }
        });

        jButton_Agregar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Agregar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435273275_user_add.png"))); // NOI18N
        jButton_Agregar.setText("Agregar");
        jButton_Agregar.setEnabled(false);

        jButton_Modificar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Modificar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435273287_user_warning.png"))); // NOI18N
        jButton_Modificar.setText("Modificar");
        jButton_Modificar.setEnabled(false);

        jButton_Eliminar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Eliminar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435273281_user_delete.png"))); // NOI18N
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.setEnabled(false);

        jButton_Cancelar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Cancelar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir2.png"))); // NOI18N
        jButton_Cancelar.setText("Cancelar");

        jLabel_Alerta_Codigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Codigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Codigo.setText("*");

        jLabel_Alerta_Nombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Nombre.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Nombre.setText("*");

        jLabel_Alerta_Telefono.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Telefono.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Telefono.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButton_Agregar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Modificar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel4)
                                        .addGap(20, 20, 20)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtField_Codigo)
                                    .addComponent(jTxtField_Nombre)
                                    .addComponent(jTxtField_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Cancelar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_Alerta_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Alerta_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Alerta_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(jButton_Buscar)))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTxtField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Buscar)
                    .addComponent(jLabel_Alerta_Codigo))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtField_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Telefono))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Agregar)
                    .addComponent(jButton_Modificar)
                    .addComponent(jButton_Eliminar)
                    .addComponent(jButton_Cancelar))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtField_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtField_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtField_TelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Alerta_Codigo;
    private javax.swing.JLabel jLabel_Alerta_Nombre;
    private javax.swing.JLabel jLabel_Alerta_Telefono;
    private javax.swing.JTextField jTxtField_Codigo;
    private javax.swing.JTextField jTxtField_Nombre;
    private javax.swing.JTextField jTxtField_Telefono;
    // End of variables declaration//GEN-END:variables

    public static final String BTN_BUSCAR = "Buscar";
    public static final String BTN_AGREGAR = "Agregar";
    public static final String BTN_MODIFICAR = "Modificar";
    public static final String BTN_ELIMINAR = "Eliminar";
    public static final String BTN_CANCELAR = "Cancelar";

    public void escuchar(ControlProveedor cp) {
        this.jButton_Buscar.addActionListener(cp);
        this.jButton_Agregar.addActionListener(cp);
        this.jButton_Modificar.addActionListener(cp);
        this.jButton_Eliminar.addActionListener(cp);
        this.jButton_Cancelar.addActionListener(cp);
    }

    public String getJtxtField_Codigo() {
        return jTxtField_Codigo.getText().trim();
    }

    public void setJtxtField_Codigo(String codigo) {
        this.jTxtField_Codigo.setText(codigo.trim());
    }

    public String getJtxtField_Nombre() {
        return jTxtField_Nombre.getText();
    }

    public void setJtxtField_Nombre(String nombre) {
        this.jTxtField_Nombre.setText(nombre);
    }

    public String getJtxtField_Telefono() {
        return jTxtField_Telefono.getText();
    }

    public void setJtxtField_Telefono(String numTelefono) {
        this.jTxtField_Telefono.setText(numTelefono);
    }

    public void activaBotones(boolean esActivo) {
        this.jTxtField_Codigo.setEditable(!esActivo);
        this.jButton_Modificar.setEnabled(esActivo);
        this.jButton_Eliminar.setEnabled(esActivo);
    }
    
    public void activarBontonAgregar (boolean estado) {
        this.jButton_Agregar.setEnabled(estado);
    }

    public void limpiaDatos() {
        this.jTxtField_Codigo.setText("");
        this.jTxtField_Nombre.setText("");
        this.jTxtField_Telefono.setText("");
    }
    
    /////////////////////////////////////////////////////////////////////////////////

    public void setjLabel_Alerta_Codigo(String jLabel_Alerta_Codigo) {
        this.jLabel_Alerta_Codigo.setText(jLabel_Alerta_Codigo);
    }

    public void setjLabel_Alerta_Nombre(String jLabel_Alerta_Nombre) {
        this.jLabel_Alerta_Nombre.setText(jLabel_Alerta_Nombre);
    }

    public void setjLabel_Alerta_Telefono(String jLabel_Alerta_Telefono) {
        this.jLabel_Alerta_Telefono.setText(jLabel_Alerta_Telefono);
    }

    public String getjLabel_Alerta_Codigo() {
        return jLabel_Alerta_Codigo.getText();
    }

    public String getjLabel_Alerta_Nombre() {
        return jLabel_Alerta_Nombre.getText();
    }

    public String getjLabel_Alerta_Telefono() {
        return jLabel_Alerta_Telefono.getText();
    }
    
    public boolean getEstadoAgregar () {
        return this.jButton_Agregar.isEnabled();
    }
    
    public boolean getEstadoModificar () {
        return this.jButton_Modificar.isEnabled();
    }
    
}
