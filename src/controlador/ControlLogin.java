/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import modelo.RegistroUsuarios;
import org.jdom2.JDOMException;
import vista.GUILogin;
import vista.GUIMenu;
import vista.PanelLogin;

/**
 *
 * @author vini
 */
public class ControlLogin implements ActionListener {

    private RegistroUsuarios registroUsuarios;
    private GUILogin guiLogin;
    private GUIMenu guiMenu;
    private PanelLogin panelLogin;
    private int contadorDeLogins = 0;

    public ControlLogin(GUILogin aThis, PanelLogin panelLogin1) throws JDOMException, IOException {
        this.guiLogin = aThis;
        this.panelLogin = panelLogin1;

        this.guiMenu = new GUIMenu();///////////////////eliminar
        this.guiMenu.setVisible(true); ////////////eliminar
        
        File file = new File("usuarios.xml");
        if (file.exists()) {
            registroUsuarios = RegistroUsuarios.abrirDocumento("usuarios.xml");
        } else {
            registroUsuarios = RegistroUsuarios.crearDocumento("usuarios.xml");
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase(PanelLogin.BTN_ENTRAR)) {
            if (!panelLogin.getjPasswordField_contrasena().equalsIgnoreCase("")
                    && !panelLogin.getjTextField_Usuario().equalsIgnoreCase("")) {
                if (registroUsuarios.login(panelLogin.getjTextField_Usuario(), panelLogin.getjPasswordField_contrasena())) {
                    System.err.println("entro");
                    this.guiLogin.dispose();
                    this.guiMenu = new GUIMenu();
                    this.guiMenu.setVisible(true);
                } else {
                    contadorDeLogins++;
                    GUILogin.mensaje("Usuario o contraseña incorrecta. Le quedan " + (3 - contadorDeLogins) + " intentos", 0);
                    if (contadorDeLogins == 3) {
                        GUILogin.mensaje("Usted ha excedido la cantidad de intentos permitidos", 1);
                        System.exit(0);
                    }
                }
            }
        }
        if (e.getActionCommand().equalsIgnoreCase(PanelLogin.BTN_SALIR)) {
            System.exit(0);
        }
    }

}
