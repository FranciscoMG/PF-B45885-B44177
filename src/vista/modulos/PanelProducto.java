/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modulos;

import controlador.modulos.ControlProducto;
import javax.swing.JLabel;

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
        jTxtField_Codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtField_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtField_Proveedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtField_Precio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton_Buscar = new javax.swing.JButton();
        jButton_Modificar = new javax.swing.JButton();
        jButton_Agregar = new javax.swing.JButton();
        jButton_Eliminar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jSpinner_Cantidad = new javax.swing.JSpinner();
        jLabel_Alerta_Codigo = new javax.swing.JLabel();
        jLabel_Alerta_Nombre = new javax.swing.JLabel();
        jLabel_Alerta_Codigo_Provedor = new javax.swing.JLabel();
        jLabel_Alerta_Precio_Unitario = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 252, 231));
        setEnabled(false);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Registro productos");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Código:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel6.setText("Cod. Proveedor:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel7.setText("Precio unitario:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel8.setText("Unidades en invertario:");

        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435270426_search.png"))); // NOI18N
        jButton_Buscar.setActionCommand("Buscar");

        jButton_Modificar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Modificar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435272003_file_edit.png"))); // NOI18N
        jButton_Modificar.setText("Modificar");
        jButton_Modificar.setEnabled(false);

        jButton_Agregar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Agregar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435271997_file_add.png"))); // NOI18N
        jButton_Agregar.setText("Agregar");
        jButton_Agregar.setEnabled(false);

        jButton_Eliminar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Eliminar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435272014_file_delete.png"))); // NOI18N
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.setEnabled(false);

        jButton_Cancelar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Cancelar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435272330_notification_error.png"))); // NOI18N
        jButton_Cancelar.setText("Cancelar");

        jSpinner_Cantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        jSpinner_Cantidad.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner_Cantidad, ""));
        jSpinner_Cantidad.setValue(1);

        jLabel_Alerta_Codigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Codigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Codigo.setText("*");

        jLabel_Alerta_Nombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Nombre.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Nombre.setText("*");

        jLabel_Alerta_Codigo_Provedor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Codigo_Provedor.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Codigo_Provedor.setText("*");

        jLabel_Alerta_Precio_Unitario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Precio_Unitario.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Precio_Unitario.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtField_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinner_Cantidad))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTxtField_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Agregar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Modificar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Eliminar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Cancelar)
                                    .addComponent(jButton_Buscar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel_Alerta_Codigo_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Alerta_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Alerta_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel_Alerta_Precio_Unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTxtField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Alerta_Codigo))
                    .addComponent(jButton_Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtField_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Codigo_Provedor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtField_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Precio_Unitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Agregar)
                    .addComponent(jButton_Modificar)
                    .addComponent(jButton_Eliminar)
                    .addComponent(jButton_Cancelar))
                .addGap(60, 60, 60))
        );

        getAccessibleContext().setAccessibleDescription("");
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Alerta_Codigo;
    private javax.swing.JLabel jLabel_Alerta_Codigo_Provedor;
    private javax.swing.JLabel jLabel_Alerta_Nombre;
    private javax.swing.JLabel jLabel_Alerta_Precio_Unitario;
    private javax.swing.JSpinner jSpinner_Cantidad;
    private javax.swing.JTextField jTxtField_Codigo;
    private javax.swing.JTextField jTxtField_Nombre;
    private javax.swing.JTextField jTxtField_Precio;
    private javax.swing.JTextField jTxtField_Proveedor;
    // End of variables declaration//GEN-END:variables

    public static final String BTN_BUSCAR = "Buscar";
    public static final String BTN_AGREGAR = "Agregar";
    public static final String BTN_MODIFICAR = "Modificar";
    public static final String BTN_ELIMINAR = "Eliminar";
    public static final String BTN_CANCELAR = "Cancelar";

    public void escuchar(ControlProducto cp) {
        this.jButton_Buscar.addActionListener(cp);
        this.jButton_Agregar.addActionListener(cp);
        this.jButton_Modificar.addActionListener(cp);
        this.jButton_Eliminar.addActionListener(cp);
        this.jButton_Cancelar.addActionListener(cp);
    }

    public String getJTxtField_Codigo() {
        return jTxtField_Codigo.getText().trim();
    }

    public void setJTxtField_Codigo(String codigo) {
        this.jTxtField_Codigo.setText(codigo.trim());
    }

    public String getJTxtField_Nombre() {
        return jTxtField_Nombre.getText();
    }

    public void setJTxtField_Nombre(String nombre) {
        this.jTxtField_Nombre.setText(nombre);
    }

    public String getJTxtField_Precio() {
        return (jTxtField_Precio.getText().trim());
    }

    public void setJTxtField_Precio(double precio) {
        this.jTxtField_Precio.setText(String.valueOf(precio));
    }

    public String getJTxtField_Proveedor() {
        return jTxtField_Proveedor.getText();
    }

    public void setJTxtField_Proveedor(String proveedor) {
        this.jTxtField_Proveedor.setText(proveedor);
    }

    public int getJSpinner_Cantidad() {
        return Integer.parseInt(jSpinner_Cantidad.getValue().toString().trim());
    }
    
    public String getSpinerString () {
        return jSpinner_Cantidad.getValue().toString();
    }

    public void setJSpinner_Cantidad(int cantidad) {
        this.jSpinner_Cantidad.setValue(cantidad);
    }

    public void activaBotones(boolean esActivo) {
        this.jTxtField_Codigo.setEditable(!esActivo);
        this.jSpinner_Cantidad.setEnabled(!esActivo);
        this.jButton_Modificar.setEnabled(esActivo);
        this.jButton_Eliminar.setEnabled(esActivo);
    }
    
    public void activarAgregar (boolean estado) {
        this.jButton_Agregar.setEnabled(estado);
    }

    public void limpiaDatos() {
        this.jTxtField_Codigo.setText("");
        this.jTxtField_Nombre.setText("");
        this.jTxtField_Precio.setText("");
        this.jTxtField_Proveedor.setText("");
        this.jSpinner_Cantidad.setValue(1);
    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////

    public void setjLabel_Alerta_Codigo(String jLabel_Alerta_Codigo) {
        this.jLabel_Alerta_Codigo.setText(jLabel_Alerta_Codigo);
    }

    public void setjLabel_Alerta_Codigo_Provedor(String jLabel_Alerta_Codigo_Provedor) {
        this.jLabel_Alerta_Codigo_Provedor.setText(jLabel_Alerta_Codigo_Provedor);
    }

    public void setjLabel_Alerta_Nombre(String jLabel_Alerta_Nombre) {
        this.jLabel_Alerta_Nombre.setText(jLabel_Alerta_Nombre);
    }

    public void setjLabel_Alerta_Precio_Unitario(String jLabel_Alerta_Precio_Unitario) {
        this.jLabel_Alerta_Precio_Unitario.setText(jLabel_Alerta_Precio_Unitario);
    } 

    public String getjLabel_Alerta_Codigo() {
        return jLabel_Alerta_Codigo.getText();
    }

    public String getjLabel_Alerta_Codigo_Provedor() {
        return jLabel_Alerta_Codigo_Provedor.getText();
    }

    public String getjLabel_Alerta_Nombre() {
        return jLabel_Alerta_Nombre.getText();
    }

    public String getjLabel_Alerta_Precio_Unitario() {
        return jLabel_Alerta_Precio_Unitario.getText();
    }
    
    public boolean getEstadoAgregar () {
        return this.jButton_Agregar.isEnabled();
    }
    
    public boolean getEstadoModificar () {
        return this.jButton_Modificar.isEnabled();
    }
    
    public void setEditableCodigoProducto (boolean estado) {
        this.jLabel_Alerta_Codigo.setEnabled(estado);
    }
    
    
    
}
