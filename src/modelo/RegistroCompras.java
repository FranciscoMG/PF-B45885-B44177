/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.GUILogin;

/**
 *
 * @author francisco
 */
public class RegistroCompras {

    private RegistroBD registroBD;
    private RegistroInventario registroInventario;

    public RegistroCompras(RegistroBD registroBD, RegistroInventario registroInventario) {
        this.registroBD = registroBD;
        this.registroInventario = registroInventario;
    }

    public void agregarCompra(Producto producto, Proveedor proveedor, int cantidad, double precioCompra) {
        if (registroBD.realizarProcedimiento("INSERT INTO Compras VALUES (null, '" + producto.getIdProducto() + "', '" + proveedor.getIdProveedor() + "', " + precioCompra + ");") && registroInventario.modificarInventario(producto, cantidad)) {
            GUILogin.mensaje("Compra guardada con éxito", 1);
        } else {
            GUILogin.mensaje("Error al guardar la compra", 0);
        }
    }
}
