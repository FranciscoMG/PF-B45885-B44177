/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Proveedor;
import modelo.RegistroProveedor;
import vista.GUILogin;
import vista.modulos.GUIProveedor;
import vista.modulos.PanelProveedor;

/**
 *
 * @author francisco
 */
public class ControlProveedor implements ActionListener {
    
    private GUIProveedor gUIProveedor;
    private PanelProveedor panelProveedor;

    private RegistroProveedor registroProveedor;
    private GUIProveedor guiProveedor;
    private PanelProveedor panelProveedor;

    public ControlProveedor(GUIProveedor aThis, PanelProveedor panelProveedor, RegistroProveedor registroProveedor) {
        this.registroProveedor = registroProveedor;
        this.guiProveedor = aThis;
        this.panelProveedor = panelProveedor;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_BUSCAR)) {
            Proveedor resultado = registroProveedor.consultarProveedor(panelProveedor.getJtxtField_Codigo());
            if (resultado != null) {
                panelProveedor.setJtxtField_Codigo(resultado.getIdProveedor());
                panelProveedor.setJtxtField_Nombre(resultado.getNombre());
                panelProveedor.setJtxtField_Telefono(resultado.getTelefono());
                panelProveedor.activaBotones(true);
            } else {
                GUILogin.mensaje("No se encontraron proveedores para el código: " + panelProveedor.getJtxtField_Codigo(), 2);
                panelProveedor.limpiaDatos();
            }
        }
        //--------------------------------------------------------------------     
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_AGREGAR)) {
            registroProveedor.agregarProveedor(new Proveedor(panelProveedor.getJtxtField_Codigo(), panelProveedor.getJtxtField_Nombre(), panelProveedor.getJtxtField_Telefono()));
            panelProveedor.limpiaDatos();
            panelProveedor.activaBotones(false);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_MODIFICAR)) {
            registroProveedor.modificarProveedor(new Proveedor(panelProveedor.getJtxtField_Codigo(), panelProveedor.getJtxtField_Nombre(), panelProveedor.getJtxtField_Telefono()));
            panelProveedor.limpiaDatos();
            panelProveedor.activaBotones(false);
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_ELIMINAR)) {
            registroProveedor.eliminarProveedor(new Proveedor(panelProveedor.getJtxtField_Codigo(), panelProveedor.getJtxtField_Nombre(), panelProveedor.getJtxtField_Telefono()));
            panelProveedor.limpiaDatos();
            panelProveedor.activaBotones(false);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_CANCELAR)) {
            guiProveedor.dispose();
        }
    }

}
