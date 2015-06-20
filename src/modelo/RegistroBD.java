/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import vista.GUILogin;

/**
 *
 * @author francisco
 */
public class RegistroBD {

    private Conexion conexion;
    ResultSet resultado;
    Statement estado;
    Connection conexionBD;

    public RegistroBD() {
        conexion = new Conexion();
        conexion();
    }

    public void conexion() {
        try {
            Class.forName(conexion.getDriver());
            conexionBD = DriverManager.getConnection(conexion.getDataBase(), conexion.getUser(), conexion.getPassword());
            System.out.println("Conexion a BD correcta!");
        } catch (ClassNotFoundException | SQLException ex) {
            GUILogin.mensaje("Error de conexión con la base de datos. El programa puede que no funcione correctamente", 2);
        }
    }

    public ResultSet realizarConsulta(String consultaSQL) {
        try {
            this.estado = conexionBD.createStatement();
            this.resultado = this.estado.executeQuery(consultaSQL);
        } catch (SQLException ex) {
        }
        return this.resultado;
    }

    public boolean realizarProcedimiento(String procedimientoSQL) {
        try {
            estado = conexionBD.createStatement();
            estado.executeUpdate(procedimientoSQL);
            return true;
        } catch (SQLException ex) {
        }
        return false;
    }

    public void cerrarConexion() {
        try {
            estado.close();
            conexionBD.close();
        } catch (SQLException ex) {
        }
    }
}
