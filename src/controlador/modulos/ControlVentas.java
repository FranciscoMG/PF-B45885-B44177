/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Producto;
import modelo.RegistroInventario;
import modelo.RegistroProductos;
import vista.modulos.GUIVentas;
import vista.modulos.PanelVentas;

/**
 *
 * @author francisco
 */
public class ControlVentas implements ActionListener {

    private RegistroProductos registroProductos;
    private RegistroInventario registroInventario;
    private GUIVentas guiVentas;
    private PanelVentas panelVentas;

    public ControlVentas(GUIVentas aThis, PanelVentas panelVentas, RegistroProductos registroProductos, RegistroInventario registroInventario) {
        this.registroProductos = registroProductos;
        this.registroInventario = registroInventario;
        this.guiVentas = aThis;
        this.panelVentas = panelVentas;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_AGREGAR)) {
            Producto resultado = registroProductos.consultarProducto(panelVentas.getJTxtField_Codigo());
            if (resultado != null) {
                panelVentas.setjTable_Detalle(resultado, panelVentas.getJSpinner_Cantidad());
                panelVentas.setJLabel_Total();
            }
        }
        //---------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_CANCELAR)) {
            System.err.println("Cancelar");
        }
        //---------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_TERMINAR)) {
            System.err.println("Terminar");
        }
    }

}
