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
import modelo.RegistroCompras;
import modelo.RegistroProductos;
import modelo.RegistroProveedor;
import vista.GUILogin;
import vista.modulos.GUICompras;
import vista.modulos.PanelCompras;

/**
 *
 * @author francisco
 */
public class ControlCompras implements ActionListener {

    private RegistroCompras registroCompras;
    private RegistroProveedor registroProveedor;
    private RegistroProductos registroProductos;
    private GUICompras guiCompras;
    private PanelCompras panelCompras;

    public ControlCompras(GUICompras aThis, PanelCompras panelCompras, RegistroProveedor registroProveedor, RegistroProductos registroProductos, RegistroCompras registroCompras) {
        this.registroProveedor = registroProveedor;
        this.registroProductos = registroProductos;
        this.registroCompras = registroCompras;
        this.guiCompras = aThis;
        this.panelCompras = panelCompras;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelCompras.BTN_BUSCAR)) {
            Proveedor proveedor = registroProveedor.consultarProveedor(panelCompras.getJTxtField_Proveedor());
            if (proveedor != null) {
                GUILogin.mensaje("Proveedor encontrado: " + proveedor.getNombre(), 1);
                panelCompras.setJComboBox_Producto(registroProductos.getProductos(1, proveedor.getIdProveedor()));
            } else {
                GUILogin.mensaje("No se encontraron proveedores para el código: " + panelCompras.getJTxtField_Proveedor(), 2);
                panelCompras.limpiaDatos();
            }
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelCompras.BTN_GUARDAR)) {
            Proveedor proveedor = registroProveedor.consultarProveedor(panelCompras.getJTxtField_Proveedor());
            if (proveedor != null) {
                String extraeProducto = panelCompras.getJComboBox_Producto().split(" ")[0];
                Producto producto = registroProductos.consultarProducto(extraeProducto.substring(1, extraeProducto.length() - 1));
                if (producto != null) {
                    registroCompras.agregarCompra(producto, proveedor, panelCompras.getJSpinner_Cantidad(), panelCompras.getJTxtField_Precio());
                    panelCompras.limpiaDatos();
                }
            } else {
                GUILogin.mensaje("No se encontraron proveedores para el código: " + panelCompras.getJTxtField_Proveedor(), 2);
                panelCompras.limpiaDatos();
            }
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelCompras.BTN_CANCELAR)) {
            guiCompras.dispose();
        }
    }
}
