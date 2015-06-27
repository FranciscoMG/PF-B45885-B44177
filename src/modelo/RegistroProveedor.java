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
public class RegistroProveedor {

    private RegistroBD registroBD;

    public RegistroProveedor(RegistroBD registroBD) {
        this.registroBD = registroBD;
    }

    public void agregarProveedor(Proveedor proveedor) {
        if (registroBD.realizarProcedimiento("INSERT INTO Proveedor VALUES ('" + proveedor.getIdProveedor() + "', '" + proveedor.getNombre() + "', '" + proveedor.getTelefono() + "');")) {
            GUILogin.mensaje("Proveedor guardado con éxito", 0, 1);
        } else {
            GUILogin.mensaje("Error al guardar el proveedor", 0, 0);
        }
    }

    public Proveedor consultarProveedor(String idProveedor) {
        Proveedor proveedor = new Proveedor();
        try {
            ResultSet resultado = registroBD.realizarConsulta("SELECT * FROM Proveedor WHERE idProveedor ='" + idProveedor + "';");
            while (resultado.next()) {
                proveedor.setIdProveedor(resultado.getString("idProveedor"));
                proveedor.setNombre(resultado.getString("nombre"));
                proveedor.setTelefono(resultado.getString("numTelefono"));
            }
            if (proveedor.getIdProveedor() != null) {
                return proveedor;
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public void modificarProveedor(Proveedor proveedor) {
        if (registroBD.realizarProcedimiento("UPDATE Proveedor SET nombre ='" + proveedor.getNombre() + "', numTelefono='" + proveedor.getTelefono() + "' WHERE idProveedor ='" + proveedor.getIdProveedor() + "';")) {
            GUILogin.mensaje("Proveedor modificado con éxito", 0, 1);
        } else {
            GUILogin.mensaje("Error al modificar el proveedor", 0, 0);
        }
    }

    public void eliminarProveedor(Proveedor proveedor) {
        if (registroBD.realizarProcedimiento("DELETE FROM Proveedor WHERE idProveedor ='" + proveedor.getIdProveedor() + "';")) {
            GUILogin.mensaje("Proveedor eliminado con éxito", 0, 1);
        } else {
            GUILogin.mensaje("Error al eliminar el proveedor\nNo es posible eliminarlo si este proveedor contiene productos en inventario.", 0, 0);
        }
    }
}
