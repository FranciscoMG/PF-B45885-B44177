/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.modulos.GUIProducto;
import vista.modulos.PanelProducto;

/**
 *
 * @author francisco
 */
public class ControlProducto implements ActionListener {
    
    private GUIProducto gUIProducto;
    private PanelProducto panelProducto;

    public ControlProducto(GUIProducto aThis, PanelProducto panelProducto1) {
        this.panelProducto = panelProducto1;
        this.gUIProducto = aThis;
    }

  
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_AGREGAR)) {
            System.err.println("Agregar");
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_BUSCAR)) {
            System.err.println("Buscar");
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_CANCELAR)) {
            System.err.println("Cancelar");
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_ELIMINAR)) {
            System.err.println("Eliminar");
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_MODIFICAR)) {
            System.err.println("Modificar");
        }
    }
    
}
