/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Producto;
import modelo.Proveedor;
import modelo.RegistroProductos;
import modelo.RegistroProveedor;
import vista.GUILogin;
import vista.modulos.GUIProducto;
import vista.modulos.PanelProducto;

/**
 *
 * @author francisco
 */
public class ControlProducto implements ActionListener {

    private RegistroProductos registroProductos;
    private RegistroProveedor registroProveedor;
    private GUIProducto gUIProducto;
    private PanelProducto panelProducto;

    public ControlProducto(GUIProducto aThis, PanelProducto panelProducto, RegistroProveedor registroProveedor, RegistroProductos registroProductos) {
        this.registroProveedor = registroProveedor;
        this.registroProductos = registroProductos;
        this.panelProducto = panelProducto;
        this.gUIProducto = aThis;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_BUSCAR)) {
            Producto resultado = registroProductos.consultarProducto(panelProducto.getJtxtField_Codigo());
            if (resultado != null) {
                panelProducto.setJtxtField_Codigo(resultado.getIdProducto());
                panelProducto.setJtxtField_Nombre(resultado.getNombre());
                panelProducto.setJtxtField_Precio(resultado.getPrecio());
                panelProducto.setJtxtField_Proveedor(resultado.getProveedor().getIdProveedor());
                panelProducto.activaBotones(true);
            } else {
                GUILogin.mensaje("No se encontraron productos para el código: " + panelProducto.getJtxtField_Codigo(), 2);
                panelProducto.limpiaDatos();
            }
        }
        //-------------------------------------------------------------------  
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_AGREGAR)) {
            Proveedor proveedor = registroProveedor.consultarProveedor(panelProducto.getJtxtField_Proveedor());
            if (proveedor != null) {
                Producto producto = new Producto(panelProducto.getJtxtField_Codigo(), panelProducto.getJtxtField_Nombre(), panelProducto.getJtxtField_Precio(), proveedor);
                registroProductos.agregarProducto(producto, panelProducto.getJSpinner_Cantidad());
            } else {
                GUILogin.mensaje("No se encontraron proveedores para el código: " + panelProducto.getJtxtField_Proveedor(), 2);
            }
            panelProducto.limpiaDatos();
            panelProducto.activaBotones(false);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_MODIFICAR)) {
            Proveedor proveedor = registroProveedor.consultarProveedor(panelProducto.getJtxtField_Proveedor());
            if (proveedor != null) {
                Producto producto = new Producto(panelProducto.getJtxtField_Codigo(), panelProducto.getJtxtField_Nombre(), panelProducto.getJtxtField_Precio(), proveedor);
                registroProductos.modificarProducto(producto);
            } else {
                GUILogin.mensaje("No se encontraron proveedores para el código: " + panelProducto.getJtxtField_Proveedor(), 2);
            }
            panelProducto.limpiaDatos();
            panelProducto.activaBotones(false);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_ELIMINAR)) {
            Producto producto = registroProductos.consultarProducto(panelProducto.getJtxtField_Codigo());
            registroProductos.eliminarProducto(producto);
            panelProducto.limpiaDatos();
            panelProducto.activaBotones(false);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_CANCELAR)) {
            gUIProducto.dispose();
        }
    }

}
