/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUIMenu;
import vista.PanelMenu;
import vista.modulos.GUIProducto;

/**
 *
 * @author francisco
 */
public class ControlMenu implements ActionListener {

    private GUIMenu gUIMenu;
    private PanelMenu panelMenu;
    private GUIProducto gUIProducto;
    
    public ControlMenu(GUIMenu aThis, PanelMenu panelMenu1) {
        this.gUIMenu = aThis;
        this.panelMenu = panelMenu1;
        this.gUIProducto = new GUIProducto();
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_COMPRAS)) {
            System.err.println("compra");
        }
        //------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_INVENTARIO)) {
            System.err.println("Inventario");
        }
        //-----------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REGISTRO_PRODUCTOS)) {
            System.err.println("Registro productos");
            this.gUIProducto.setVisible(true);
        }
        //------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REGISTRO_PROVEEDORES)) {
            System.err.println("Registro proveedores");
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REPORTE_UTILIDADES)) {
            System.err.println("Reporte utilidades");
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_VENTAS)) {
            System.err.println("Ventas");
        }
    }
    
}
