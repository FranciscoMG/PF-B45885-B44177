/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author francisco
 */
public class Conexion {

    private String driver;
    private String dataBase;
    private String user;
    private String password;

    public Conexion() {
        this.driver = "com.mysql.jdbc.Driver";
        this.dataBase = "jdbc:mysql://localhost/controlMiniSuper";
        this.user = "usuario";
        this.password = "root";
    }

    public Conexion(String driver, String dataBase, String user, String password) {
        this.driver = driver;
        this.dataBase = dataBase;
        this.user = user;
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
