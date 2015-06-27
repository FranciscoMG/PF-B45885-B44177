
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.GarbageCollectorMXBean;
import modelo.HiloValidador;
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
    private HiloValidador hiloValidador;

    public ControlProducto(GUIProducto aThis, PanelProducto panelProducto, RegistroProveedor registroProveedor, RegistroProductos registroProductos) {
        
        System.gc();
        this.registroProveedor = registroProveedor;
        this.registroProductos = registroProductos;
        this.panelProducto = panelProducto;
        this.gUIProducto = aThis;
        this.hiloValidador = new HiloValidador(panelProducto, registroProveedor, gUIProducto);
        this.hiloValidador.start();
       
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_BUSCAR)) {
            Producto resultado = registroProductos.consultarProducto(panelProducto.getJTxtField_Codigo());
            if (resultado != null) {
                panelProducto.setJTxtField_Codigo(resultado.getIdProducto());
                panelProducto.setJTxtField_Nombre(resultado.getNombre());
                panelProducto.setJTxtField_Precio(resultado.getPrecio());
                panelProducto.setJTxtField_Proveedor(resultado.getProveedor().getIdProveedor());
                panelProducto.activaBotones(true);
            } else {
                GUILogin.mensaje("No se encontraron productos para el código: " + panelProducto.getJTxtField_Codigo(), 0, 2);
                panelProducto.limpiaDatos();
            }
        }
        //-------------------------------------------------------------------  
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_AGREGAR)) {
            if (panelProducto.getEstadoAgregar()) {
                Producto producto = new Producto(panelProducto.getJTxtField_Codigo(), panelProducto.getJTxtField_Nombre(), Double.parseDouble(panelProducto.getJTxtField_Precio()), hiloValidador.getProveedor());
                registroProductos.agregarProducto(producto, panelProducto.getJSpinner_Cantidad());
            } else {
                GUILogin.mensaje("No se encontraron proveedores para el código: " + panelProducto.getJTxtField_Proveedor(), 0, 2);
            panelProducto.setJTxtField_Proveedor("");
            }
            panelProducto.limpiaDatos();
            panelProducto.activaBotones(false);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_MODIFICAR)) {
            Proveedor proveedor = registroProveedor.consultarProveedor(panelProducto.getJTxtField_Proveedor());
            if (proveedor != null) {
                Producto producto = new Producto(panelProducto.getJTxtField_Codigo(), panelProducto.getJTxtField_Nombre(), Double.parseDouble(panelProducto.getJTxtField_Precio()),proveedor);
                registroProductos.modificarProducto(producto);
            } else {
                GUILogin.mensaje("No se encontraron proveedores para el código: " + panelProducto.getJTxtField_Proveedor(), 0, 2);
            }
            panelProducto.limpiaDatos();
            panelProducto.activaBotones(false);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_ELIMINAR)) {
            Producto resultado = registroProductos.consultarProducto(panelProducto.getJTxtField_Codigo());
            registroProductos.eliminarProducto(resultado);
            panelProducto.limpiaDatos();
            panelProducto.activaBotones(false);
        }
        //-------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelProducto.BTN_CANCELAR)) {
            gUIProducto.dispose();
            hiloValidador.stop();
        }
    }

}
