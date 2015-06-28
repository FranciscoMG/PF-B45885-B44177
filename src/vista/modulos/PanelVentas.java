/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modulos;

import controlador.modulos.ControlVentas;
import java.awt.Dimension;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author francisco
 */
public class PanelVentas extends javax.swing.JPanel {

    /**
     * Creates new form PanelVentas
     */
    private BigDecimal redondeo;

    public PanelVentas() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Detalle = new javax.swing.JTable();
        jButton_Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_Total = new javax.swing.JLabel();
        jButton_Cancelar = new javax.swing.JButton();
        jTxtField_Producto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton_Agregar = new javax.swing.JButton();
        jSpinner_Cantidad = new javax.swing.JSpinner();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel_Alerta_Codigo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 229, 254));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Registro ventas");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setText("Código:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setText("Cantidad:");

        jTable_Detalle.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jTable_Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. linea", "Cod. producto", "Producto", "Cantidad", "Precio Unitario", "SubTotal", "Utilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Detalle);

        jButton_Guardar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Guardar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435314938_load_download.png"))); // NOI18N
        jButton_Guardar.setText("Guardar");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel1.setText("Total:");

        jLabel_Total.setText("0");

        jButton_Cancelar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Cancelar.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jButton_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir2.png"))); // NOI18N
        jButton_Cancelar.setText("Terminar");

        jTxtField_Producto.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel6.setText("Producto:");

        jButton_Agregar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435274529_document_add.png"))); // NOI18N
        jButton_Agregar.setText("Agregar");

        jSpinner_Cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));

        jButton_Eliminar.setBackground(new java.awt.Color(254, 254, 254));
        jButton_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1435272330_notification_error.png"))); // NOI18N
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.setEnabled(false);

        jLabel_Alerta_Codigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Alerta_Codigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Alerta_Codigo.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Cancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtField_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner_Cantidad)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Agregar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Eliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel_Alerta_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Alerta_Codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtField_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton_Agregar)
                    .addComponent(jSpinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Eliminar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel_Total))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Guardar)
                    .addComponent(jButton_Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Alerta_Codigo;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Cantidad;
    private javax.swing.JTable jTable_Detalle;
    private javax.swing.JTextField jTxtField_Codigo;
    private javax.swing.JTextField jTxtField_Producto;
    // End of variables declaration//GEN-END:variables

    public static final String BTN_AGREGAR = "Agregar";
    public static final String BTN_ELIMINAR = "Eliminar";
    public static final String BTN_GUARDAR = "Guardar";
    public static final String BTN_CANCELAR = "Terminar";

    public void escuchar(ControlVentas cv) {
        this.jButton_Agregar.addActionListener(cv);
        this.jButton_Eliminar.addActionListener(cv);
        this.jTable_Detalle.addMouseListener(cv);
        this.jButton_Guardar.addActionListener(cv);
        this.jButton_Cancelar.addActionListener(cv);
    }

    public String getJTxtField_Codigo() {
        return jTxtField_Codigo.getText();
    }

    public void setJTxtField_Codigo(String codigo) {
        this.jTxtField_Codigo.setText(codigo);
    }

    public String getJTxtField_Producto() {
        return jTxtField_Producto.getText();
    }

    public void setJTxtField_Producto(String producto) {
        this.jTxtField_Producto.setText(producto);
    }

    public int getJSpinner_Cantidad() {
        return Integer.parseInt(jSpinner_Cantidad.getValue().toString().trim());
    }

    public void setJSpinner_Cantidad(int cantidad) {
        this.jSpinner_Cantidad.setValue(cantidad);
    }

    public void setJLabel_Total() {
        double totalPago = 0;
        for (int f = 0; f < jTable_Detalle.getRowCount(); f++) {
            totalPago += (double) jTable_Detalle.getValueAt(f, 5);
        }
        redondeo = new BigDecimal(totalPago);
        this.jLabel_Total.setText(String.valueOf(redondeo.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()));
    }

    public String[] getJTable_Detalle() {
        String seleccion[] = new String[jTable_Detalle.getColumnCount()];
        for (int c = 0; c < seleccion.length; c++) {
            seleccion[c] = jTable_Detalle.getValueAt(jTable_Detalle.getSelectedRow(), c).toString();
        }
        return seleccion;
    }

    public String[][] getJTable_Detalle_Multiple() {
        int filas = jTable_Detalle.getRowCount();
        String datos[][] = new String[filas][jTable_Detalle.getColumnCount()];
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < jTable_Detalle.getColumnCount(); c++) {
                datos[f][c] = jTable_Detalle.getValueAt(f, c).toString().trim();
            }
        }
        return datos;
    }

    public void setJTable_Detalle(Producto producto, int cantidad) {
        DefaultTableModel tabla = (DefaultTableModel) jTable_Detalle.getModel();
        this.jTable_Detalle.setModel(tabla);
        this.jTable_Detalle.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Object[] fila = new Object[jTable_Detalle.getColumnCount()];
        fila[0] = jTable_Detalle.getRowCount() + 1;
        fila[1] = producto.getIdProducto();
        fila[2] = producto.getNombre();
        fila[3] = cantidad;
        redondeo = new BigDecimal((producto.getPrecio() * 1.10) * 1.13);
        fila[4] = redondeo.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        double subTotal = (producto.getPrecio() * cantidad) * 1.13;
        redondeo = new BigDecimal(subTotal * 1.10);
        fila[5] = redondeo.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        redondeo = new BigDecimal(subTotal * 0.10);
        fila[6] = redondeo.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        tabla.addRow(fila);
    }

    public void deleteRow_JTable_Detalle(int fila) {
        DefaultTableModel tabla = (DefaultTableModel) jTable_Detalle.getModel();
        this.jTable_Detalle.setModel(tabla);
        tabla.removeRow(fila);
        for (int f = 0; f < jTable_Detalle.getRowCount(); f++) {
            jTable_Detalle.setValueAt(f + 1, f, 0);
        }
    }

    public void activaBotones(boolean esActivo) {
        this.jButton_Eliminar.setEnabled(esActivo);
    }

    public void limpiarDatos(boolean borraTodo) {
        DefaultTableModel tabla = (DefaultTableModel) jTable_Detalle.getModel();
        this.jTxtField_Codigo.setText("");
        this.jTxtField_Producto.setText("");
        this.jSpinner_Cantidad.setValue(1);
        if (borraTodo) {
            tabla.setRowCount(0);
            this.jTable_Detalle.setModel(tabla);
            this.jLabel_Total.setText("0");
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////

    public String getjLabel_Alerta_Codigo() {
        return jLabel_Alerta_Codigo.getText();
    }

    public void setjLabel_Alerta_Codigo(String jLabel_Alerta_Codigo) {
        this.jLabel_Alerta_Codigo.setText(jLabel_Alerta_Codigo);
    }
    
    public void activarAgregar (boolean estado) {
        this.jButton_Agregar.setEnabled(estado);
    }
    
    public void setMaximiunJSpinner (int max) {
        SpinnerModel newS = new SpinnerNumberModel(1, 1, max, 1);
       this.jSpinner_Cantidad.setModel(newS);
        
    }
    
    public void setActivarJSpiner (boolean estado) {
        this.jSpinner_Cantidad.setEnabled(estado);
    }
}
