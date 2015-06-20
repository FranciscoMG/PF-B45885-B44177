/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroProductos;
import modelo.RegistroProveedor;
import vista.modulos.GUICompras;
import vista.modulos.PanelCompras;

/**
 *
 * @author francisco
 */
public class ControlCompras implements ActionListener {

    private RegistroProveedor registroProveedor;
    private RegistroProductos registroProductos;
    private GUICompras gUICompras;
    private PanelCompras panelCompras;

    public ControlCompras(GUICompras aThis, PanelCompras panelCompras1, RegistroProveedor registroProveedor, RegistroProductos registroProductos) {
        this.registroProveedor = registroProveedor;
        this.registroProductos = registroProductos;
        this.gUICompras = aThis;
        this.panelCompras = panelCompras1;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelCompras.BTN_BUSCAR)) {
            System.err.println("Buscar");
        }
        if (e.getActionCommand().equalsIgnoreCase(PanelCompras.BTN_GUARDAR)) {
            System.err.println("Guardar");
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelCompras.BTN_CANCELAR)) {
            System.err.println("Cancelar");
        }
    }
}
