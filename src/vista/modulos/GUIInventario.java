/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modulos;

import controlador.modulos.ControlInventario;
import javax.swing.JFrame;
import modelo.RegistroInventario;

/**
 *
 * @author francisco
 */
public class GUIInventario extends javax.swing.JDialog {

    private ControlInventario controlInventario;

    /**
     * Creates new form GUIInventario
     */
    public GUIInventario(JFrame parent, boolean modal, RegistroInventario registroInventario) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.controlInventario = new ControlInventario(this, panelInventario1, registroInventario);
        this.panelInventario1.escuchar(controlInventario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInventario1 = new vista.modulos.PanelInventario();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelInventario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelInventario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.modulos.PanelInventario panelInventario1;
    // End of variables declaration//GEN-END:variables
}
