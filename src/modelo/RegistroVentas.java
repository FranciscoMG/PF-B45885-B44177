/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import vista.GUILogin;

/**
 *
 * @author francisco
 */
public class RegistroVentas {

    private RegistroBD registroBD;

    public RegistroVentas(RegistroBD registroBD) {
        this.registroBD = registroBD;
    }

    public void agregarVenta(String[][] listaVenta) {
        int idVenta = consultarIdVenta();
        int totalVentas = listaVenta.length;
        int ventaProcesadas = 0;
        for (int i = 0; i < listaVenta.length; i++) {
            if (registroBD.realizarProcedimiento("INSERT INTO Ventas VALUES (" + idVenta + ", " + (i + 1)
                    + ", CURRENT_TIMESTAMP(), '" + listaVenta[i][1] + "', " + listaVenta[i][3] + ", " + listaVenta[i][5] + ", " + listaVenta[i][6] + ");")) {
                ventaProcesadas++;
            }
        }
        if (ventaProcesadas == totalVentas) {
            GUILogin.mensaje("Venta guardada con éxito", 1);
        } else {
            GUILogin.mensaje("Error al guardar la venta", 0);
        }
    }

    public int consultarIdVenta() {
        int idVenta = -1;
        try {
            ResultSet resultado = registroBD.realizarConsulta("SELECT COUNT(DISTINCT idVenta) AS idVenta FROM Ventas;");
            while (resultado.next()) {
                idVenta = Integer.parseInt(resultado.getString("idVenta"));
            }
            if (idVenta != -1) {
                return idVenta + 1;
            }
        } catch (SQLException ex) {
        }
        return idVenta;
    }
}
