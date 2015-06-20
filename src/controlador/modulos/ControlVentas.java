/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.modulos.GUIVentas;
import vista.modulos.PanelVentas;

/**
 *
 * @author francisco
 */
public class ControlVentas implements ActionListener {
    
    private GUIVentas gUIVentas;
    private PanelVentas panelVentas;

    public ControlVentas(GUIVentas aThis, PanelVentas panelVentas1) {
        this.gUIVentas = aThis;
        this.panelVentas = panelVentas1;
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_CANCELAR)) {
            System.err.println("Cancelar");
        }
        //---------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_TERMINAR)) {
            System.err.println("Terminar");
        }
    }
    
}
