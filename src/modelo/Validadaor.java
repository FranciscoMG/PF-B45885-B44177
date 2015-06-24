/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vini
 */
public class Validadaor {
    
    private static Pattern patron;
    private static Matcher matcher;

    public Validadaor() {
    }
    
    public static boolean validadorCodigo (String codigo) {
        patron = Pattern.compile("^\\d{1,30}"); // Se debe cambiar
        matcher = patron.matcher(codigo);
        return matcher.find();
    }
    
    /////////////////////////////////////////////////////////////////////////////////////
    public static boolean validadorNombre (String nombre) {
        patron = Pattern.compile("^\\w{1,30}"); // Se debe analizar 
        matcher = patron.matcher(nombre);
        return matcher.find();
    }
    
    /////////////////////////////////////////////////////////////////////////////////////
    public static boolean validadorPrecio (String precio) {
        patron = Pattern.compile("^\\d{1,30}");
        matcher = patron.matcher(precio);
        return matcher.find();
    }
    
    /////////////////////////////////////////////////////////////////////////////////////
    public static boolean validadorTelefono (String telefono) {
        patron = Pattern.compile("^\\d{1,30}");
        matcher = patron.matcher(telefono);
        return matcher.find();
    }
    
    /////////////////////////////////////////////////////////////////////////////////////
    public static boolean validadorCantidad (String cantidad) {
        patron = Pattern.compile("^\\d{1,30}");
        matcher = patron.matcher(cantidad);
        return matcher.find();
    }
    
}
