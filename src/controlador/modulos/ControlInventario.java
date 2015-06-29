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
import modelo.RegistroInventario;
import vista.modulos.GUIInventario;
import vista.modulos.PanelInventario;

/**
 *
 * @author vini
 */
public class ControlInventario implements ActionListener, ItemListener {

    private RegistroInventario registroInventario;
    private GUIInventario guiInventario;
    private PanelInventario panelInventario;

    public ControlInventario(GUIInventario aThis, PanelInventario panelInventario, RegistroInventario registroInventario) {
        this.registroInventario = registroInventario;
        this.guiInventario = aThis;
        this.panelInventario = panelInventario;
        this.panelInventario.setjTable_Productos(registroInventario.consultarInventario(0));
        this.panelInventario.setJLabel_Agotados(registroInventario.consultarInventario(2));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelInventario.BTN_CERRAR)) {
            guiInventario.dispose();
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            switch (panelInventario.getJComboBox_Filtro()) {
                case "Todo":
                    panelInventario.setjTable_Productos(registroInventario.consultarInventario(0));
                    break;
                case "Disponibles":
                    panelInventario.setjTable_Productos(registroInventario.consultarInventario(1));
                    break;
                case "Agotados":
                    panelInventario.setjTable_Productos(registroInventario.consultarInventario(2));
                    break;
            }
        }
    }
}
