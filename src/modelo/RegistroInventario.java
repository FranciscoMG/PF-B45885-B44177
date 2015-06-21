/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;

/**
 *
 * @author francisco
 */
public class RegistroInventario {

    private RegistroBD registroBD;

    public RegistroInventario(RegistroBD registroBD) {
        this.registroBD = registroBD;
    }

    public boolean agregarInventario(Producto producto, int cantidad) {
        return registroBD.realizarProcedimiento("INSERT INTO Inventario VALUES ('" + producto.getIdProducto() + "', " + cantidad + ", CURDATE());");
    }

    public boolean modificarInventario(Producto producto, int cantidad) {
        return registroBD.realizarProcedimiento("UPDATE Inventario AS i1, (SELECT cantidad FROM Inventario WHERE fkProducto='" + producto.getIdProducto() + "') AS i2 SET i1.cantidad = i2.cantidad + " + cantidad + ", i1.fechaUltimaCompra = CURDATE() WHERE fkProducto='" + producto.getIdProducto() + "';");
    }

    public boolean eliminarInventario(Producto producto) {
        return registroBD.realizarProcedimiento("DELETE FROM Inventario WHERE fkProducto='" + producto.getIdProducto() + "';");
    }

    public ResultSet consultarInventario(int tipoFiltro) {
        switch (tipoFiltro) {
            case 0:
                return registroBD.realizarConsulta("SELECT p.idProducto, p.nombre, r.idProveedor, r.nombre, i.cantidad, i.fechaUltimaCompra FROM Producto p, Proveedor r, Inventario i WHERE p.idProducto = i.fkProducto AND p.fkProveedor = r.idProveedor;");
            case 1:
                break;
            case 2:
                break;
        }
        return null;
    }
}
