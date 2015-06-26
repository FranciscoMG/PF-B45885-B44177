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
    private RegistroInventario registroInventario;

    public RegistroVentas(RegistroBD registroBD, RegistroInventario registroInventario) {
        this.registroBD = registroBD;
        this.registroInventario = registroInventario;
    }

    public void agregarVenta(String[][] listaVenta) {
        int idVenta = consultarIdVenta();
        int totalVentas = listaVenta.length;
        int ventaProcesadas = 0;
        if (idVenta != -1) {
            for (int i = 0; i < listaVenta.length; i++) {
                if (registroBD.realizarProcedimiento("INSERT INTO Ventas VALUES (" + idVenta + ", " + (i + 1)
                        + ", CURRENT_TIMESTAMP(), '" + listaVenta[i][1] + "', " + listaVenta[i][3] + ", " + listaVenta[i][5] + ", " + listaVenta[i][6] + ");") &&
                        registroInventario.modificarInventario(false, null, i)) {
                    ventaProcesadas++;
                }
            }
            if (ventaProcesadas == totalVentas) {
                GUILogin.mensaje("Venta guardada con éxito", 0, 1);
            } else {
                GUILogin.mensaje("Error al guardar la venta", 0, 0);
            }
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

    public String[][] consultarVentas(int mes) {
        int f = 0;
        String[][] listaVentas = null;
        String mesCorregido;
        try {
            if (mes < 9) {
                mesCorregido = "0" + mes;
            } else {
                mesCorregido = String.valueOf(mes);
            }
            ResultSet resultado = registroBD.realizarConsulta("SELECT idVenta, fechaVenta, ROUND(SUM(precioTotal), 2) AS totalVenta, ROUND(SUM(utilidad), 2) AS totalUtilidad FROM Ventas WHERE fechaVenta LIKE '%-" + mesCorregido + "-%' GROUP BY idVenta");
            resultado.last();
            listaVentas = new String[resultado.getRow()][resultado.getMetaData().getColumnCount()];
            resultado.beforeFirst();
            while (resultado.next()) {
                listaVentas[f][0] = resultado.getString("idVenta");
                listaVentas[f][1] = resultado.getString("fechaVenta");
                listaVentas[f][2] = resultado.getString("totalVenta");
                listaVentas[f][3] = resultado.getString("totalUtilidad");
                f++;
            }
        } catch (SQLException ex) {
        }
        return listaVentas;
    }

    public String informeVentas(int mes, String mesString) {
        double totalMes = 0;
        double totalUtilidades = 0;
        String[][] ventasMes = consultarVentas(mes);
        String informe = "MiniSuper el Alto\nInforme de utilidades del mes\n\nMes: " + mesString;
        informe += "\n\n--------------------------------------------------------------------------------------\n";
        informe += "Fecha y hora\t\tMonto Venta\tUtilidad total\n";
        informe += "--------------------------------------------------------------------------------------\n";
        for (int f = 0; f < ventasMes.length; f++) {
            informe += ventasMes[f][1] + "\t" + ventasMes[f][2] + "\t" + ventasMes[f][3] + "\n";
            totalMes += Double.parseDouble(ventasMes[f][2]);
            totalUtilidades += Double.parseDouble(ventasMes[f][3]);
        }
        informe += "\nTotal Ventas: " + ventasMes.length + "\nTotal mes: " + totalMes + "\nTotal utilidades: " + totalUtilidades;
        return informe;
    }
}
