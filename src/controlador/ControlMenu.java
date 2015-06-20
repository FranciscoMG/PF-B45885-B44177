/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroBD;
import vista.GUIMenu;
import vista.PanelMenu;
import vista.modulos.GUICompras;
import vista.modulos.GUIInventario;
import vista.modulos.GUIProducto;
import vista.modulos.GUIProveedor;
import vista.modulos.GUIUtilidades;
import vista.modulos.GUIVentas;

/**
 *
 * @author francisco
 */
public class ControlMenu implements ActionListener {

    private GUIMenu gUIMenu;
    private GUIProducto gUIProducto;
    private PanelMenu panelMenu;
    private GUICompras gUICompras;
    private GUIInventario gUIInventario;
    private GUIProveedor gUIProveedor;
    private GUIUtilidades gUIUtilidades;
    private GUIVentas gUIVentas;
    

    public ControlMenu(GUIMenu aThis, PanelMenu panelMenu1) {
        RegistroBD registroBD = new RegistroBD();
        this.gUIMenu = aThis;
        this.gUIProducto = new GUIProducto();
        this.gUICompras = new GUICompras();
        this.gUIInventario = new GUIInventario();
        this.gUIProveedor = new GUIProveedor();
        this.gUIUtilidades = new GUIUtilidades();
        this.gUIVentas = new GUIVentas();
        this.panelMenu = panelMenu1;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_COMPRAS)) {
            System.err.println("compra");
            this.gUICompras.setVisible(true);
        }
        //------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_INVENTARIO)) {
            System.err.println("Inventario");
            this.gUIInventario.setVisible(true);
        }
        //-----------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REGISTRO_PRODUCTOS)) {
            System.err.println("Registro productos");
            this.gUIProducto.setVisible(true);
        }
        //------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REGISTRO_PROVEEDORES)) {
            System.err.println("Registro proveedores");
            this.gUIProveedor.setVisible(true);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REPORTE_UTILIDADES)) {
            System.err.println("Reporte utilidades");
            this.gUIUtilidades.setVisible(true);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_VENTAS)) {
            System.err.println("Ventas");
            this.gUIVentas.setVisible(true);
        }
    }

}
