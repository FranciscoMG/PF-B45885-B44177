/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroBD;
import modelo.RegistroCompras;
import modelo.RegistroInventario;
import modelo.RegistroProductos;
import modelo.RegistroProveedor;
import modelo.RegistroVentas;
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

    private RegistroBD registroBD;
    private RegistroProveedor registroProveedor;
    private RegistroInventario registroInventario;
    private RegistroProductos registroProductos;
    private RegistroCompras registroCompras;
    private RegistroVentas registroVentas;
    private GUIMenu guiMenu;
    private GUIProveedor guiProveedor;
    private GUIProducto guiProducto;
    private GUICompras guiCompras;
    private GUIInventario guiInventario;
    private GUIVentas guiVentas;
    private GUIUtilidades guiUtilidades;
    private PanelMenu panelMenu;

    public ControlMenu(GUIMenu aThis, PanelMenu panelMenu) {
        this.registroBD = new RegistroBD();
        this.registroProveedor = new RegistroProveedor(registroBD);
        this.registroInventario = new RegistroInventario(registroBD);
        this.registroProductos = new RegistroProductos(registroBD, registroProveedor, registroInventario);
        this.registroCompras = new RegistroCompras(registroBD, registroInventario);
        this.registroVentas = new RegistroVentas(registroBD);
        this.guiMenu = aThis;
        this.panelMenu = panelMenu;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_COMPRAS)) {
            if (guiCompras != null) {
                guiCompras.dispose();
            }
            guiCompras = new GUICompras(null, true, registroProveedor, registroProductos, registroCompras);
            guiCompras.setVisible(true);
        }
        //------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_INVENTARIO)) {
            if (guiInventario != null) {
                guiInventario.dispose();
            }
            guiInventario = new GUIInventario(null, true, registroInventario);
            guiInventario.setVisible(true);
        }
        //-----------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REGISTRO_PRODUCTOS)) {
            if (guiProducto != null) {
                guiProducto.dispose();
            }
            guiProducto = new GUIProducto(null, true, registroProveedor, registroProductos);
            guiProducto.setVisible(true);
        }
        //------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REGISTRO_PROVEEDORES)) {
            if (guiProveedor != null) {
                guiProveedor.dispose();
            }
            guiProveedor = new GUIProveedor(null, true, registroProveedor);
            guiProveedor.setVisible(true);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_REPORTE_UTILIDADES)) {
            if (guiUtilidades != null) {
                guiUtilidades.dispose();
            }
            guiUtilidades = new GUIUtilidades();
            guiUtilidades.setVisible(true);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelMenu.BTN_VENTAS)) {
            if (guiVentas != null) {
                guiVentas.dispose();
            }
            guiVentas = new GUIVentas(null, true, registroVentas, registroProductos, registroInventario);
            guiVentas.setVisible(true);
        }
    }

}
