/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modulos;

import controlador.modulos.ControlProducto;

/**
 *
 * @author francisco
 */
public class PanelProducto extends javax.swing.JPanel {

    /**
     * Creates new form PanelProducto
     */
    public PanelProducto() {
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
        jtexField_Codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtexField_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtexField_Proveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtexField_Precio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton_Buscar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Agregar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jSpinner_Cantidad = new javax.swing.JSpinner();

        setEnabled(false);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel3.setText("Registro productos");

        jLabel4.setText("Código:");

        jLabel5.setText("Nombre:");

        jtexField_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtexField_NombreActionPerformed(evt);
            }
        });

        jLabel6.setText("Proveedor:");

        jLabel7.setText("Precio:");

        jLabel8.setText("Unidades en invertario:");

        jButton_Buscar.setText("B");

        jButton_Modificar.setText("Modificar");
        jButton_Modificar.setEnabled(false);

        jButton_Agregar.setText("Agregar");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinner_Cantidad)
                                        .addGap(51, 51, 51))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jtexField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jtexField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jtexField_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtexField_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_Buscar)))))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Cancelar)))
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
                    .addComponent(jtexField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtexField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtexField_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtexField_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_Agregar)
                        .addComponent(jButton_Modificar)
                        .addComponent(jButton_Eliminar))
                    .addComponent(jButton_Cancelar))
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtexField_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtexField_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexField_NombreActionPerformed


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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSpinner_Cantidad;
    private javax.swing.JTextField jtexField_Codigo;
    private javax.swing.JTextField jtexField_Nombre;
    private javax.swing.JTextField jtexField_Precio;
    private javax.swing.JTextField jtexField_Proveedor;
    // End of variables declaration//GEN-END:variables

    public static final String BTN_BUSCAR = "";
    public static final String BTN_AGREGAR = "Agregar";
    public static final String BTN_CANCELAR = "Cancelar";
    public static final String BTN_ELIMINAR = "Eliminar";
    public static final String BTN_MODIFICAR = "Modificar";

    public void escuchar(ControlProducto cp) {
        this.jButton_Agregar.addActionListener(cp);
        this.jButton_Buscar.addActionListener(cp);
        this.jButton_Cancelar.addActionListener(cp);
        this.jButton_Eliminar.addActionListener(cp);
        this.jButton_Modificar.addActionListener(cp);
    }

    public String getJtexField_Codigo() {
        return jtexField_Codigo.getText().trim();
    }

    public void setJtexField_Codigo(String jtexField_Codigo) {
        this.jtexField_Codigo.setText(jtexField_Codigo.trim());
    }

    public String getJtexField_Nombre() {
        return jtexField_Nombre.getText();
    }

    public void setJtexField_Nombre(String jtexField_Nombre) {
        this.jtexField_Nombre.setText(jtexField_Nombre);
    }

    public double getJtexField_Precio() {
        return Double.parseDouble(jtexField_Precio.getText().trim());
    }

    public void setJtexField_Precio(double jtexField_Precio) {
        this.jtexField_Precio.setText(String.valueOf(jtexField_Precio));
    }

    public String getJtexField_Proveedor() {
        return jtexField_Proveedor.getText();
    }

    public void setJtexField_Proveedor(String jtexField_Proveedor) {
        this.jtexField_Proveedor.setText(jtexField_Proveedor);
    }

    public int getJSpinner_CantidadCantidad() {
        return Integer.parseInt(jSpinner_Cantidad.getValue().toString().trim());
    }

    public void setJtexField_Unidades_Invetarios(int jSpinner_Cantidad) {
        this.jSpinner_Cantidad.setValue(jSpinner_Cantidad);
    }
}
