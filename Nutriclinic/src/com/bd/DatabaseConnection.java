package com.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private  String DBuser;
    private  String DBpwd;
    private  String DBurl = "jdbc:mysql://localhost:3306/nutriclinic";
    private Connection conector;

    public DatabaseConnection(String DBuser, String DBpwd){
        this.DBuser = DBuser;
        this.DBpwd = DBpwd;

        try {
            conector = DriverManager.getConnection(DBurl, this.DBuser, this.DBpwd);
        } catch (Exception sqle) {
            System.out.println("Exception : " + sqle);
        }
            
    
    }

    /**
     * Establece una conexión con la base de datos
     * @return conector
     */
    public Connection getConexion() {
        return conector;
    }

    /**
     * Cierra la conexión con la base de datos
     */
    public void cierraConexion() {
        try {
            conector.close();
        } catch (Exception sqle) {
            // TODO: handle exception
            System.out.println("Error cerrando la conexion");
        }

    }

}
