/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modulos;

import controlador.modulos.ControlCompras;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import modelo.Producto;

/**
 *
 * @author francisco
 */
public class PanelCompras extends javax.swing.JPanel {

    /**
     * Creates new form PanelCompras
     */
    public PanelCompras() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_Producto = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtField_Precio = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jTxtField_Proveedor = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jSpinner_Cantidad = new javax.swing.JSpinner();
        jLabel_Alerta_Codigo_Provedor = new javax.swing.JLabel();
        jLabel_Alerta_Producto = new javax.swing.JLabel();
        jLabel_Alerta_Cantidad = new javax.swing.JLabel();
        jLabel_Alerta_Precio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 254, 221));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Cod. Proveedor:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Registro compras");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setText("Producto:");

        jComboBox_Producto.setBackground(new java.awt.Color(254, 254, 254));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel6.setText("Cantidad:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel7.setText("Precio:");

        jButton_Guardar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Guardar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435274529_document_add.png"))); // NOI18N
        jButton_Guardar.setText("Guardar");

        jButton_Cancelar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Cancelar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435272330_notification_error.png"))); // NOI18N
        jButton_Cancelar.setText("Cancelar");

        jButton_Buscar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435270426_search.png"))); // NOI18N
        jButton_Buscar.setActionCommand("Buscar");

        jSpinner_Cantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jLabel_Alerta_Codigo_Provedor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Codigo_Provedor.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Codigo_Provedor.setText("*");

        jLabel_Alerta_Producto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Producto.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Producto.setText("*");

        jLabel_Alerta_Cantidad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Cantidad.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Cantidad.setText("*");

        jLabel_Alerta_Precio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Precio.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Precio.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtField_Proveedor)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel_Alerta_Codigo_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton_Buscar))
                            .addComponent(jComboBox_Producto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Guardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addComponent(jSpinner_Cantidad)
                            .addComponent(jTxtField_Precio, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Alerta_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTxtField_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Alerta_Codigo_Provedor))
                    .addComponent(jButton_Buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Producto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Cantidad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtField_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_Alerta_Precio))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cancelar)
                    .addComponent(jButton_Guardar))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JComboBox jComboBox_Producto;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Alerta_Cantidad;
    private javax.swing.JLabel jLabel_Alerta_Codigo_Provedor;
    private javax.swing.JLabel jLabel_Alerta_Precio;
    private javax.swing.JLabel jLabel_Alerta_Producto;
    private javax.swing.JSpinner jSpinner_Cantidad;
    private javax.swing.JTextField jTxtField_Precio;
    private javax.swing.JTextField jTxtField_Proveedor;
    // End of variables declaration//GEN-END:variables

    public static final String BTN_BUSCAR = "Buscar";
    public static final String BTN_GUARDAR = "Guardar";
    public static final String BTN_CANCELAR = "Cancelar";
    
    public void escuchar(ControlCompras cc) {
        this.jButton_Buscar.addActionListener(cc);
        this.jButton_Guardar.addActionListener(cc);
        this.jButton_Cancelar.addActionListener(cc);
    }
    
    public String getJTxtField_Proveedor() {
        return jTxtField_Proveedor.getText().trim();
    }
    
    public void setJTxtField_Proveedor(String codigo) {
        this.jTxtField_Proveedor.setText(codigo.trim());
    }
    
    public int getJSpinner_Cantidad() {
        return Integer.parseInt(jSpinner_Cantidad.getValue().toString().trim());
    }
    
    public String getJComboBox_Producto() {
        if (this.jComboBox_Producto.getSelectedIndex() == -1) {
            return null;
        }
        return this.jComboBox_Producto.getSelectedItem().toString();
    }
    
    public void setJComboBox_Producto(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            this.jComboBox_Producto.addItem("(" + producto.getIdProducto() + ") " + producto.getNombre());
        }
    }
    
    public void activarBotonAgregar(boolean estado) {
        this.jButton_Guardar.setEnabled(estado);
    }
    
    public String getjSpinerCantidad_String () {
        return this.jSpinner_Cantidad.getValue().toString();
    }
    
    public String getJTxtField_Precio() {
        return (jTxtField_Precio.getText());
    }    
    
    public void limpiaDatos() {
        this.jTxtField_Proveedor.setText("");
        this.jComboBox_Producto.setSelectedIndex(-1);
        this.jSpinner_Cantidad.setValue(0);
        this.jTxtField_Precio.setText("");
    }
    
    /////////////////////////////////////////////////////////////////////////////////////

    public void setjLabel_Alerta_Cantidad(String jLabel_Alerta_Cantidad) {
        this.jLabel_Alerta_Cantidad.setText(jLabel_Alerta_Cantidad);
    }

    public void setjLabel_Alerta_Codigo_Provedor(String jLabel_Alerta_Codigo_Provedor) {
        this.jLabel_Alerta_Codigo_Provedor.setText(jLabel_Alerta_Codigo_Provedor);
    }

    public void setjLabel_Alerta_Precio(String jLabel_Alerta_Precio) {
        this.jLabel_Alerta_Precio.setText(jLabel_Alerta_Precio);
    }

    public void setjLabel_Alerta_Producto(String jLabel_Alerta_Producto) {
        this.jLabel_Alerta_Producto.setText(jLabel_Alerta_Producto);
    }

    public String getjLabel_Alerta_Cantidad() {
        return jLabel_Alerta_Cantidad.getText();
    }

    public String getjLabel_Alerta_Codigo_Provedor() {
        return jLabel_Alerta_Codigo_Provedor.getText();
    }

    public String getjLabel_Alerta_Precio() {
        return jLabel_Alerta_Precio.getText();
    }

    public String getjLabel_Alerta_Producto() {
        return jLabel_Alerta_Producto.getText();
    }
    
   
    
    
}
