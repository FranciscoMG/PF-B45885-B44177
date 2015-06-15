/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlLogin;

/**
 *
 * @author vini
 */
public class PanelLogin extends javax.swing.JPanel {

    /**
     * Creates new form PanelLogin
     */
    public PanelLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Usuario = new javax.swing.JTextField();
        jButton_Entrar = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jPasswordField_Contrasena = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        jButton_Entrar.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jButton_Entrar.setText("Entrar");

        jButton_Salir.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jButton_Salir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Usuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField_Contrasena))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 186, Short.MAX_VALUE)
                        .addComponent(jButton_Entrar)
                        .addGap(96, 96, 96)
                        .addComponent(jButton_Salir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Entrar)
                    .addComponent(jButton_Salir))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Entrar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField_Contrasena;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
public static final String BTN_ENTRAR = "Entrar";
public static final String BTN_SALIR = "Salir";


public void escuchar (ControlLogin controlLogin) {
    this.jButton_Entrar.addActionListener(controlLogin);
    this.jButton_Salir.addActionListener(controlLogin);
}

    public String getjPasswordField_contrasena() {
        return jPasswordField_Contrasena.getText().trim();
    }

    public String getjTextField_Usuario() {
        return jTextField_Usuario.getText().trim();
    }



public void limpiar () {
    this.jPasswordField_Contrasena.setText("");
    this.jTextField_Usuario.setText("");
}

}

