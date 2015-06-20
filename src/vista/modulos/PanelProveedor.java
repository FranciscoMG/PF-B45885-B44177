/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modulos;

import controlador.modulos.ControlProveedor;

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

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel3.setText("Registro proveedores");

        jLabel4.setText("Código:");

        jButton_Buscar.setText("B");
        jButton_Buscar.setActionCommand("Buscar");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Telefóno:");

        jButton_Agregar.setText("Agregar");

        jButton_Modificar.setText("Modificar");
        jButton_Modificar.setEnabled(false);

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.setEnabled(false);

        jButton_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxtField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtField_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Cancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtField_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Agregar)
                        .addComponent(jButton_Modificar)
                        .addComponent(jButton_Eliminar))
                    .addComponent(jButton_Cancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JTextField jTxtField_Codigo;
    private javax.swing.JTextField jTxtField_Nombre;
    private javax.swing.JTextField jTxtField_Telefono;
    // End of variables declaration//GEN-END:variables

    public static final String BTN_BUSCAR = "Buscar";
    public static final String BTN_AGREGAR = "Agregar";
    public static final String BTN_CANCELAR = "Cancelar";
    public static final String BTN_ELIMINAR = "Eliminar";
    public static final String BTN_MODIFICAR = "Modificar";
    
    public void escuchar(ControlProveedor cp) {
        this.jButton_Agregar.addActionListener(cp);
        this.jButton_Buscar.addActionListener(cp);
        this.jButton_Cancelar.addActionListener(cp);
        this.jButton_Eliminar.addActionListener(cp);
        this.jButton_Modificar.addActionListener(cp);
    }
    
    public String getJtxtField_Codigo() {
        return jTxtField_Codigo.getText().trim();
    }
    
    public void setJtxtField_Codigo(String jtxtField_Codigo) {
        this.jTxtField_Codigo.setText(jtxtField_Codigo.trim());
    }
    
    public String getJtxtField_Nombre() {
        return jTxtField_Nombre.getText();
    }
    
    public void setJtxtField_Nombre(String jtxtField_Nombre) {
        this.jTxtField_Nombre.setText(jtxtField_Nombre);
    }
    
    public String getJtxtField_Telefono() {
        return jTxtField_Telefono.getText();
    }
    
    public void setJtxtField_Telefono(String jtxtField_Telefono) {
        this.jTxtField_Telefono.setText(jtxtField_Telefono);
    }
    
    public void activaBotones(boolean esActivo) {
        this.jButton_Modificar.setEnabled(esActivo);
        this.jButton_Eliminar.setEnabled(esActivo);
    }
    
    public void limpiaDatos() {
        this.jTxtField_Codigo.setText("");
        this.jTxtField_Nombre.setText("");
        this.jTxtField_Telefono.setText("");
    }
}
