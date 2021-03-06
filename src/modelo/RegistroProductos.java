/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import vista.GUILogin;

/**
 *
 * @author francisco
 */
public class RegistroProductos {

    private RegistroBD registroBD;
    private RegistroProveedor registroProveedor;
    private RegistroInventario registroInventario;

    public RegistroProductos(RegistroBD registroBD, RegistroProveedor registroProveedor, RegistroInventario registroInventario) {
        this.registroBD = registroBD;
        this.registroProveedor = registroProveedor;
        this.registroInventario = registroInventario;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (registroBD.realizarProcedimiento("INSERT INTO Producto VALUES ('" + producto.getIdProducto() + "', '" + producto.getNombre() + "', " + producto.getPrecio() + ", '" + producto.getProveedor().getIdProveedor() + "');") && registroInventario.agregarInventario(producto, cantidad)) {
            GUILogin.mensaje("Producto guardado con éxito", 0, 1);
        } else {
            GUILogin.mensaje("Error al guardar el producto", 0, 0);
        }
    }

    public Producto consultarProducto(String idProducto) {
        Producto producto = new Producto();
        try {
            ResultSet resultado = registroBD.realizarConsulta("SELECT * FROM Producto WHERE idProducto='" + idProducto + "';");
            while (resultado.next()) {
                producto.setIdProducto(resultado.getString("idProducto"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(Double.parseDouble(resultado.getString("precio")));
                producto.setProveedor(registroProveedor.consultarProveedor(resultado.getString("fkProveedor")));
            }
            if (producto.getIdProducto() != null) {
                return producto;
            }
        } catch (SQLException ex) {
        }
        return null;
    }

    public ArrayList<Producto> getProductos(int tipoFiltro, String filtro) {
        String nombreFiltro = null;
        ArrayList<Producto> productos = new ArrayList<>();
        switch (tipoFiltro) {
            case 0:
                nombreFiltro = "nombre";
                break;
            case 1:
                nombreFiltro = "fkProveedor";
                break;
        }
        try {
            ResultSet resultado = registroBD.realizarConsulta("SELECT * FROM Producto WHERE " + nombreFiltro + "='" + filtro + "';");
            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultado.getString("idProducto"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecio(Double.parseDouble(resultado.getString("precio")));
                producto.setProveedor(registroProveedor.consultarProveedor(resultado.getString("fkProveedor")));
                productos.add(producto);
            }
            if (productos.isEmpty()) {
                return null;
            }
        } catch (SQLException ex) {
        }
        return productos;
    }

    public void modificarProducto(Producto producto) {
        if (registroBD.realizarProcedimiento("UPDATE Producto SET nombre ='" + producto.getNombre() + "', precio=" + producto.getPrecio() + ", fkProveedor='" + producto.getProveedor().getIdProveedor() + "' WHERE idProducto ='" + producto.getIdProducto() + "';")) {
            GUILogin.mensaje("Producto modificado con éxito", 0, 1);
        } else {
            GUILogin.mensaje("Error al modificar el producto", 0, 0);
        }
    }

    public void eliminarProducto(Producto producto) {
        if (registroInventario.eliminarInventario(producto) && registroBD.realizarProcedimiento("DELETE FROM Producto WHERE idProducto ='" + producto.getIdProducto() + "';")) {
            GUILogin.mensaje("Producto eliminado con éxito", 0, 1);
        } else {
            GUILogin.mensaje("Error al eliminar el producto", 0, 0);
        }
    }
}
