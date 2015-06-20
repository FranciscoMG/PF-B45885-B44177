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
import vista.modulos.GUICompras;
import vista.modulos.PanelCompras;

/**
 *
 * @author francisco
 */
public class ControlCompras implements ActionListener, ItemListener {

    private GUICompras gUICompras;
    private PanelCompras panelCompras;
    
    public ControlCompras(GUICompras aThis, PanelCompras panelCompras1) {
        this.gUICompras = aThis;
        this.panelCompras = panelCompras1;
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelCompras.BTN_CANCELAR)) {
            System.err.println("Cancelar");
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelCompras.BTN_ELIMINAR)) {
            System.err.println("Eliminar");
        }
    }

    
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == 0) {
            // Se debe leer los productos del ComboBox
        }
    }
    
}
