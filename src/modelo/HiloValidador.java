/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import vista.modulos.GUICompras;
import vista.modulos.GUIProducto;
import vista.modulos.GUIProveedor;
import vista.modulos.PanelCompras;
import vista.modulos.PanelProducto;
import vista.modulos.PanelProveedor;

/**
 *
 * @author vini
 */
public class HiloValidador extends Thread {

    private Proveedor proveedor;
    private PanelProducto panelProducto;
    private RegistroProveedor registroProveedor;
    private GUIProducto gUIProducto;
    private GUIProveedor gUIProveedor;
    private PanelProveedor panelProveedor;
    private PanelCompras panelCompras;
    private GUICompras gUICompras;
    //>>>>>>>>>>>>>>>>>>>>>>>>
    private boolean panelProductosDatosCorrecto;
    private boolean panelProveedorDatosCorrectos;
    private boolean panelComprasDatosCorrectos;

    public HiloValidador(PanelProducto panelProducto, RegistroProveedor registroProveedor, GUIProducto gUIProducto) {
        this.panelProducto = panelProducto;
        this.registroProveedor = registroProveedor;
        this.gUIProducto = gUIProducto;
    }

    public HiloValidador(PanelProveedor panelProveedor, GUIProveedor guiProveedor) {
        this.gUIProveedor = guiProveedor;
        this.panelProveedor = panelProveedor;
    }

    public HiloValidador(PanelCompras panelCompras, GUICompras guiCompras) {
        this.gUICompras = guiCompras;
        this.panelCompras = panelCompras;
    }

    ////////////////////////////////////////////////////////////////////////////////////
    public void run() {
        int c = 0;
        while (true) {
            System.err.println(c++);
            try {

                sleep(250);
                //------------------------------------------------------
                revisarPanelProducto();
                if (panelProducto != null) {
                    activarAgregarPanelProductos();
                }
                //-------------------------------------------------------
                revisarPanelProveedor();
                if (panelProveedor != null) {
                    activarAgregarPanelProveedor();
                }
                //-------------------------------------------------------
                revisarPanelCompras();
                if (panelCompras != null) {
                    activarAgregarPanelCompras();
                }
                //-------------------------------------------------------
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloValidador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    //************************************************************************************************
    // Metodos par modulo Compras
    ////////////////////////////////////////////////////////////////////////////////////
    private void revisarPanelCompras() {
        if (panelCompras != null) {
            System.err.println("panelCompras");
            if (Validador.validadorCodigoProvedor(panelCompras.getJTxtField_Proveedor())) {
                panelComprasDatosCorrectos = true;
                panelCompras.setjLabel_Alerta_Codigo_Provedor("");
            } else {
                panelComprasDatosCorrectos = false;
                panelCompras.setjLabel_Alerta_Codigo_Provedor("*");
            }
            if (panelCompras.getJComboBox_Producto() != null) {
                panelComprasDatosCorrectos = true;
                panelCompras.setjLabel_Alerta_Producto("");
            } else {
                panelComprasDatosCorrectos = true;
                panelCompras.setjLabel_Alerta_Producto("*");
            }
            if (Validador.validadorCantidad(panelCompras.getjSpinerCantidad_String())) {
                panelComprasDatosCorrectos = true;
                panelCompras.setjLabel_Alerta_Cantidad("");
            } else {
                panelComprasDatosCorrectos = false;
                panelCompras.setjLabel_Alerta_Cantidad("*");
            }
            if (Validador.validadorPrecio(panelCompras.getJTxtField_Precio())) {
                panelComprasDatosCorrectos = true;
                panelCompras.setjLabel_Alerta_Precio("");
            } else {
                panelComprasDatosCorrectos = false;
                panelCompras.setjLabel_Alerta_Precio("*");
            }
            comprobarGuiCompras();
        }
    }

    private void comprobarGuiCompras() {
        if (gUICompras.isVisible() == false) {
            panelCompras = null;
            this.stop();
        }
    }

    public void activarAgregarPanelCompras() {
        panelCompras.activarBotonAgregar(panelComprasDatosCorrectos);
    }

    //************************************************************************************************
    // Metodos para modulo proveedor
    ////////////////////////////////////////////////////////////////////////////////////

    private void revisarPanelProveedor() {
        if (panelProveedor != null) {
            System.err.println("PanelProvedor");
            if (Validador.validadorCodigoProvedor(panelProveedor.getJtxtField_Codigo())) {
                panelProveedorDatosCorrectos = true;
                panelProveedor.setjLabel_Alerta_Codigo("");
            } else {
                panelProveedorDatosCorrectos = false;
                panelProveedor.setjLabel_Alerta_Codigo("*");
            }
            if (Validador.validadorNombreProvedor(panelProveedor.getJtxtField_Nombre())) {
                panelProveedorDatosCorrectos = true;
                panelProveedor.setjLabel_Alerta_Nombre("");
            } else {
                panelProveedorDatosCorrectos = false;
                panelProveedor.setjLabel_Alerta_Nombre("*");
            }
            if (Validador.validarTelefono(panelProveedor.getJtxtField_Telefono())) {
                panelProveedorDatosCorrectos = true;
                panelProveedor.setjLabel_Alerta_Telefono("");
            } else {
                panelProveedorDatosCorrectos = false;
                panelProveedor.setjLabel_Alerta_Telefono("*");
            }
            comprobarGuiProveedor();
        }
    }

    public boolean isPanelProveedorDatosCorrectos() {
        return panelProveedorDatosCorrectos;
    }

    private void comprobarGuiProveedor() {
        if (gUIProveedor.isVisible() == false) {
            panelProveedor = null;
            this.stop();
        }
    }

    private void activarAgregarPanelProveedor() {
        panelProveedor.activarBontonAgregar(panelProveedorDatosCorrectos);
    }

    //************************************************************************************************
    // Metodos para el modulo producto
    ////////////////////////////////////////////////////////////////////////////////////
    private void revisarPanelProducto() {
        if (panelProducto != null) {
            System.err.println("panelProducto");
            proveedor = registroProveedor.consultarProveedor(panelProducto.getJTxtField_Proveedor());

            if (Validador.validadorCodigoProducto(panelProducto.getJTxtField_Codigo())) {
                panelProducto.setjLabel_Alerta_Codigo("");
                panelProductosDatosCorrecto = true;
            } else {
                panelProducto.setjLabel_Alerta_Codigo("*");
                panelProductosDatosCorrecto = false;
            }
            if (Validador.validadorNombreProducto(panelProducto.getJTxtField_Nombre())) {
                panelProducto.setjLabel_Alerta_Nombre("");
                panelProductosDatosCorrecto = true;
            } else {
                panelProducto.setjLabel_Alerta_Nombre("*");
                panelProductosDatosCorrecto = false;
            }
            if (Validador.validadorCodigoProvedor(panelProducto.getJTxtField_Proveedor())) {
                if (proveedor != null) {
                    panelProducto.setjLabel_Alerta_Codigo_Provedor("");
                    panelProductosDatosCorrecto = true;
                } else {
                    panelProductosDatosCorrecto = false;
                    panelProducto.setjLabel_Alerta_Codigo_Provedor("*");
                }
            } else {
                panelProducto.setjLabel_Alerta_Codigo_Provedor("*");
                panelProductosDatosCorrecto = false;
            }
            if (Validador.validadorPrecioUnitario(panelProducto.getJTxtField_Precio())) {
                panelProducto.setjLabel_Alerta_Precio_Unitario("");
                panelProductosDatosCorrecto = true;
            } else {
                panelProducto.setjLabel_Alerta_Precio_Unitario("*");
                panelProductosDatosCorrecto = false;
            }
            comprobarGuiProductos();
        } // fin de if principal
    }

    private void activarAgregarPanelProductos() {
        panelProducto.activarAgregar(panelProductosDatosCorrecto);
    }

    public boolean isPanelProductosDatosCorrecto() {
        return panelProductosDatosCorrecto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    private void comprobarGuiProductos() {
        if (gUIProducto.isVisible() == false) {
            panelProducto = null;
            this.stop();
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////

}
