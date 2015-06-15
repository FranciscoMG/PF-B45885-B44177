/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.modulos.GUIProveedor;
import vista.modulos.PanelProveedor;

/**
 *
 * @author francisco
 */
public class ControlProveedor implements ActionListener {

    public ControlProveedor(GUIProveedor aThis, PanelProveedor panelProveedor1) {
    }


    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_AGREGAR)) {
            System.err.println("Agregar");
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_BUSCAR)) {
            System.err.println("Buscar");
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_CANCELAR)) {
            System.err.println("Cancelar");
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_ELIMINAR)) {
            System.err.println("Eliminar");
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProveedor.BTN_MODIFICAR)) {
            System.err.println("Modificar");
        }
    }
    
}
