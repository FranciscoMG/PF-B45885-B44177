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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.HiloValidador;
import modelo.Producto;
import modelo.RegistroInventario;
import modelo.RegistroProductos;
import modelo.RegistroVentas;
import vista.GUILogin;
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
    private HiloValidador hiloValidador;

    public ControlVentas(GUIVentas aThis, PanelVentas panelVentas, RegistroVentas registroVentas, RegistroProductos registroProductos, RegistroInventario registroInventario) {
        
        System.gc();
        this.registroVentas = registroVentas;
        this.registroProductos = registroProductos;
        this.registroInventario = registroInventario;
        this.guiVentas = aThis;
        this.panelVentas = panelVentas;
        this.registroInventario = new RegistroInventario();
        this.hiloValidador = new HiloValidador(panelVentas, guiVentas);
        this.hiloValidador.start();
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelVentas.BTN_AGREGAR)) {
            int cantidadRestante = 0;
            Producto resultado = registroProductos.consultarProducto(panelVentas.getJTxtField_Codigo());
            
            ResultSet resultadoConsulta = registroInventario.consultarExistencia(resultado.getIdProducto());
            try {
                while (resultadoConsulta.next()) {
                    cantidadRestante = Integer.parseInt(resultadoConsulta.getString("cantidad"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(ControlVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            if (resultado != null && cantidadRestante > 0) {
                panelVentas.setJTable_Detalle(resultado, panelVentas.getJSpinner_Cantidad());
                panelVentas.setJLabel_Total();
                panelVentas.limpiarDatos(false);
            } else {
                GUILogin.mensaje("El producto esta agotado", 0, 0);
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
            this.hiloValidador.stop();
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
