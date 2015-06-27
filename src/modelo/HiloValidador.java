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
                //-------------------------------------------------------
                revisarPanelProveedor();
                //-------------------------------------------------------
                revisarPanelCompras();
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
                panelCompras.setjLabel_Alerta_Codigo_Provedor("");
            } else {
                panelCompras.setjLabel_Alerta_Codigo_Provedor("*");
            }
            if (panelCompras.getJComboBox_Producto() != null) {
                panelCompras.setjLabel_Alerta_Producto("");
            } else {
                panelCompras.setjLabel_Alerta_Producto("*");
            }
            if (Validador.validadorCantidad(panelCompras.getjSpinerCantidad_String())) {
                panelCompras.setjLabel_Alerta_Cantidad("");
            } else {
                panelCompras.setjLabel_Alerta_Cantidad("*");
            }
            if (Validador.validadorPrecio(panelCompras.getJTxtField_Precio())) {
                panelCompras.setjLabel_Alerta_Precio("");
            } else {
                panelCompras.setjLabel_Alerta_Precio("*");
            }
            comprobarGuiCompras();
            comprobarDatosCorrectosPanelCompras();
        }
    }

    private void comprobarDatosCorrectosPanelCompras() {
        if (panelCompras.getjLabel_Alerta_Codigo_Provedor().equalsIgnoreCase("")) {
            if (panelCompras.getjLabel_Alerta_Producto().equalsIgnoreCase("")) {
                if (panelCompras.getjLabel_Alerta_Precio().equalsIgnoreCase("")) {

                    panelCompras.activarBotonAgregar(true);
                } else {
                    panelCompras.activarBotonAgregar(false);
                }
            } else {
                panelCompras.activarBotonAgregar(false);
            }
        } else {
            panelCompras.activarBotonAgregar(false);
        }
    }

    private void comprobarGuiCompras() {
        if (gUICompras.isVisible() == false) {
            panelCompras = null;
            this.stop();
        }
    }

    //************************************************************************************************
    // Metodos para modulo proveedor
    ////////////////////////////////////////////////////////////////////////////////////
    private void revisarPanelProveedor() {
        if (panelProveedor != null) {
            System.err.println("PanelProvedor");
            if (Validador.validadorCodigoProvedor(panelProveedor.getJtxtField_Codigo())) {
                panelProveedor.setjLabel_Alerta_Codigo("");
            } else {
                panelProveedor.setjLabel_Alerta_Codigo("*");
            }
            if (Validador.validadorNombreProvedor(panelProveedor.getJtxtField_Nombre())) {
                panelProveedor.setjLabel_Alerta_Nombre("");
            } else {
                panelProveedor.setjLabel_Alerta_Nombre("*");
            }
            if (Validador.validarTelefono(panelProveedor.getJtxtField_Telefono())) {
                panelProveedor.setjLabel_Alerta_Telefono("");
            } else {
                panelProveedor.setjLabel_Alerta_Telefono("*");
            }
            comprobarGuiProveedor();
            comprobarDatosCorrectosPanelProveedor();
        }
    }

    private void comprobarDatosCorrectosPanelProveedor() {
        if (panelProveedor.getjLabel_Alerta_Codigo().equalsIgnoreCase("")) {
            if (panelProveedor.getjLabel_Alerta_Nombre().equalsIgnoreCase("")) {
                if (panelProveedor.getjLabel_Alerta_Telefono().equalsIgnoreCase("")) {

                    if (panelProveedor.getEstadoModificar()) {
                        panelProveedor.activarBontonAgregar(false);
                    } else {
                        panelProveedor.activarBontonAgregar(true);
                    }
                } else {
                    panelProveedor.activarBontonAgregar(false);
                }
            } else {
                panelProveedor.activarBontonAgregar(false);
            }
        } else {
            panelProveedor.activarBontonAgregar(false);
        }
    }

    private void comprobarGuiProveedor() {
        if (gUIProveedor.isVisible() == false) {
            panelProveedor = null;
            this.stop();
        }
    }

    //************************************************************************************************
    // Metodos para el modulo producto
    ////////////////////////////////////////////////////////////////////////////////////
    private void revisarPanelProducto() {
        if (panelProducto != null) {
            System.err.println("panelProducto");

            if (Validador.validadorCodigoProducto(panelProducto.getJTxtField_Codigo())) {
                panelProducto.setjLabel_Alerta_Codigo("");
            } else {
                panelProducto.setjLabel_Alerta_Codigo("*");
            }
            if (Validador.validadorNombreProducto(panelProducto.getJTxtField_Nombre())) {
                panelProducto.setjLabel_Alerta_Nombre("");
            } else {
                panelProducto.setjLabel_Alerta_Nombre("*");
            }
            if (Validador.validadorCodigoProvedor(panelProducto.getJTxtField_Proveedor())) {
                proveedor = registroProveedor.consultarProveedor(panelProducto.getJTxtField_Proveedor());
                if (proveedor != null) {
                    panelProducto.setjLabel_Alerta_Codigo_Provedor("");
                } else {
                    panelProducto.setjLabel_Alerta_Codigo_Provedor("*");
                }
            } else {
                panelProducto.setjLabel_Alerta_Codigo_Provedor("*");
            }
            if (Validador.validadorPrecioUnitario(panelProducto.getJTxtField_Precio())) {
                panelProducto.setjLabel_Alerta_Precio_Unitario("");
            } else {
                panelProducto.setjLabel_Alerta_Precio_Unitario("*");
            }
            comprobarGuiProductos();
            comprobarDatosCorrectosPanelProductos();
        } // fin de if principal
    }

    private void comprobarDatosCorrectosPanelProductos() {
        if (panelProducto.getjLabel_Alerta_Codigo().equalsIgnoreCase("")) {
            if (panelProducto.getjLabel_Alerta_Nombre().equalsIgnoreCase("")) {
                if (panelProducto.getjLabel_Alerta_Codigo_Provedor().equalsIgnoreCase("")) {
                    if (panelProducto.getjLabel_Alerta_Precio_Unitario().equalsIgnoreCase("")) {

                        if (panelProducto.getEstadoModificar()) {
                            panelProducto.activarAgregar(false);
                        } else {
                            panelProducto.activarAgregar(true);
                        }
                    } else {
                        panelProducto.activarAgregar(false);
                    }
                } else {
                    panelProducto.activarAgregar(false);
                }
            } else {
                panelProducto.activarAgregar(false);
            }
        } else {
            panelProducto.activarAgregar(false);
        }
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