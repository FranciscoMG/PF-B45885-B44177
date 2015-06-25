/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import vista.modulos.GUIProducto;
import vista.modulos.PanelProducto;

/**
 *
 * @author vini
 */
public class HiloValidador extends Thread {

    private Proveedor proveedor;
    private PanelProducto panelProducto;
    private RegistroProveedor registroProveedor;
    private GUIProducto gUIProducto;
    //>>>>>>>>>>>
    private boolean panelProductosDatosCorrecto;



    public HiloValidador(PanelProducto panelProducto, RegistroProveedor registroProveedor, GUIProducto gUIProducto) {
        this.panelProducto = panelProducto;
        this.registroProveedor = registroProveedor;
        this.gUIProducto = gUIProducto;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////
    public void run () {
        int c=0;
        while (true) {  
            System.err.println(c++);
            try {
                
                
                sleep(250);
                //-----------------------
                revisarPanelProducto();
                activarAgregarPanelProductos();
                comprobarGuiProductos();
                //-----------------------
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloValidador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    //************************************************************************************************
    // Metodos para el modulo producto
    ////////////////////////////////////////////////////////////////////////////////////
    private void revisarPanelProducto () {
        if (panelProducto != null) {
           
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
            }
            else {
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
            }
            else {
                panelProducto.setjLabel_Alerta_Codigo_Provedor("*");
                panelProductosDatosCorrecto = false;
            }
            if (Validador.validadorPrecioUnitario(panelProducto.getJTxtField_Precio())) {
               panelProducto.setjLabel_Alerta_Precio_Unitario("");
               panelProductosDatosCorrecto = true;
            }
            else {
                panelProducto.setjLabel_Alerta_Precio_Unitario("*");
                panelProductosDatosCorrecto = false;
            }
        } // fin de if principal
    }
    
    private void activarAgregarPanelProductos () {
        panelProducto.activarAgregar(panelProductosDatosCorrecto);
    }

    public boolean isPanelProductosDatosCorrecto() {
        return panelProductosDatosCorrecto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
    
    private void comprobarGuiProductos () {
        if (gUIProducto.isVisible() == false) {
          this.stop();
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    
}
