/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Producto;
import modelo.RegistroInventario;
import modelo.RegistroProductos;
import modelo.RegistroVentas;
import vista.modulos.GUIVentas;
import vista.modulos.PanelVentas;

/**
 *
 * @author francisco
 */
public class ControlVentas implements ActionListener, MouseListener {

    private RegistroVentas registroVentas;
    private RegistroProductos registroProductos;
    private RegistroInventario registroInventario;
    private GUIVentas guiVentas;
    private PanelVentas panelVentas;
    private int seleccionFila = -1;

    public ControlVentas(GUIVentas aThis, PanelVentas panelVentas, RegistroVentas registroVentas, RegistroProductos registroProductos, RegistroInventario registroInventario) {
        this.registroVentas = registroVentas;
        this.registroProductos = registroProductos;
        this.registroInventario = registroInventario;
        this.guiVentas = aThis;
        this.panelVentas = panelVentas;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_AGREGAR)) {
            Producto resultado = registroProductos.consultarProducto(panelVentas.getJTxtField_Codigo());
            if (resultado != null) {
                panelVentas.setJTable_Detalle(resultado, panelVentas.getJSpinner_Cantidad());
                panelVentas.setJLabel_Total();
                panelVentas.limpiarDatos(false);
            }
        }
        //---------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_ELIMINAR)) {
            if (seleccionFila != -1) {
                panelVentas.deleteRow_JTable_Detalle(seleccionFila);
                seleccionFila = -1;
                panelVentas.activaBotones(false);
            }
        }
        //---------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_CANCELAR)) {
            guiVentas.dispose();
        }
        //---------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_GUARDAR)) {
            registroVentas.agregarVenta(panelVentas.getJTable_Detalle_Multiple());
            panelVentas.limpiarDatos(true);
        }
    }

    public void mouseClicked(MouseEvent e) {
        String[] seleccion = panelVentas.getJTable_Detalle();
        seleccionFila = Integer.parseInt(seleccion[0]) - 1;
        panelVentas.activaBotones(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
