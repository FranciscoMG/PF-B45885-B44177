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
public class Validador {
    
    private static Pattern patron;
    private static Matcher matcher;

    //=============================================================
    public Validador() {
    }

    //========================================================================

    //////////////////////////////////////////////////////////////////////////
    public static boolean validadorCodigoProducto(String dato) {
        patron = Pattern.compile("^\\w{1,29}$");
        matcher = patron.matcher(dato);
        return matcher.find();
    }

    //////////////////////////////////////////////////////////////////////////
    public static boolean validadorNombreProducto(String dato) {
        patron = Pattern.compile("^\\w{1,29}$");
        matcher = patron.matcher(dato);
        return matcher.find();
    }

    //////////////////////////////////////////////////////////////////////////
    public static boolean validadorCodigoProvedor(String dato) {
        patron = Pattern.compile("^\\w{1,29}$");
        matcher = patron.matcher(dato);
        return matcher.find();
    }

    //////////////////////////////////////////////////////////////////////////
    public static boolean validadorPrecioUnitario(String dato) {
        patron = Pattern.compile("^\\d{1,29}$");
        matcher = patron.matcher(dato);
        return matcher.find();
    }

    ////////////////////////////////////////////////////////////////////////////
    public static boolean validadorNombreProvedor(String dato) {
        patron = Pattern.compile("^\\w{1,29}$");
        matcher = patron.matcher(dato);
        return matcher.find();
    }

    ///////////////////////////////////////////////////////////////////////////
    public static boolean validarTelefono(String dato) {
        patron = Pattern.compile("^\\d{29}$");
        matcher = patron.matcher(dato);
        return matcher.find();
    }

    //////////////////////////////////////////////////////////////////////////
    public static boolean validadorPrecio (String dato) {
        patron = Pattern.compile("^\\d{1,29}$");
        matcher = patron.matcher(dato);
        return matcher.find();
    }

}
