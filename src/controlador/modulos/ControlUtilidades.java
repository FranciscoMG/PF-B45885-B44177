/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import modelo.RegistroVentas;
import vista.modulos.GUIUtilidades;
import vista.modulos.PanelUtilidades;

/**
 *
 * @author francisco
 */
public class ControlUtilidades implements ActionListener, ItemListener {

    private RegistroVentas registroVentas;
    private GUIUtilidades gUIUtilidades;
    private PanelUtilidades panelUtilidades;

    public ControlUtilidades(GUIUtilidades aThis, PanelUtilidades panelUtilidades, RegistroVentas registroVentas) {
        this.gUIUtilidades = aThis;
        this.panelUtilidades = panelUtilidades;
        this.registroVentas = registroVentas;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelUtilidades.BTN_CERRAR)) {
            gUIUtilidades.dispose();
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == 0) {

        }
    }

}
