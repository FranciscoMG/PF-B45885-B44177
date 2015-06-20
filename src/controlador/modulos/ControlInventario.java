/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.modulos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.modulos.GUIInventario;
import vista.modulos.PanelInventario;

/**
 *
 * @author vini
 */
public class ControlInventario implements ActionListener {
    
    private GUIInventario gUIInventario;
    private PanelInventario panelInventario;

    public ControlInventario(GUIInventario aThis, PanelInventario panelInventario1) {
        this.gUIInventario = aThis;
        this.panelInventario = panelInventario1;
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelInventario.BTN_BUSCAR)) {
            System.err.println("Buscar");
        }
        //--------------------------------------------------------------------
        if (e.getActionCommand().equalsIgnoreCase(PanelInventario.BTN_CERRAR)) {
            System.err.println("Cerrar");
        }
    }
    
}
