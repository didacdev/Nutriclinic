package com.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCreation {

    private  static String DBurl = "jdbc:mysql://localhost:3306";
    private static Connection conector;

    public DatabaseCreation(){
    
    }

    /**
     * Crea la base de datos a utilizar si no existe
     * @param user
     * @param pwd
     */
    public static void dbCreation(String user, String pwd){

        try {
            conector = DriverManager.getConnection(DBurl, user, pwd);
        } catch (Exception sqle) {
            System.out.println("Exception : " + sqle);
            throw new RuntimeException("Los datos introducidos son incorrectos");
        }
        
        String db = null;
        try{
            Statement stmt = conector.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = 'nutriclinic'");

            while(rset.next()){
                db = rset.getString(1);
            }
            stmt.close();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }

        if(db == null){
            try{
                Statement stmt = conector.createStatement();
                //Crear las sentencias sql a añadir
                stmt.executeUpdate(
                    "CREATE DATABASE IF NOT EXISTS nutriclinic;"
                );
                stmt.executeUpdate(
                    "use nutriclinic;"
                ); 
                stmt.executeUpdate(
                    "create table clientes (ID int unsigned not null auto_increment, nombre varchar(20), apellidos varchar(30), fecha_nacimiento date, fecha_inicio date, fecha_final date, primary key(ID));"
                );
                stmt.executeUpdate(
                    "create table contactos (contacto_id int unsigned, telefono int unsigned, email varchar(30), primary key(contacto_id), foreign key(contacto_id) references clientes(ID));"
                );
                stmt.executeUpdate(
                    "create table residencias (residencia_id int unsigned, municipio varchar(30), provincia varchar(25), primary key(residencia_id), foreign key(residencia_id) references clientes(ID));"
                ); 
                stmt.executeUpdate(
                    "create table bonos (bonos_id int unsigned, bono int unsigned, fecha_inicio date, primary key(bonos_id), foreign key (bonos_id) references clientes(ID));"
                ); 
                stmt.executeUpdate(
                    "create table medidas (ID int unsigned, fecha_consulta date, peso int, altura int, cadera int, cintura int, muslo int, brazo int, wrist int, tobillo int, bajo_gluteo int, pecho int, primary key(ID, fecha_consulta), foreign key(ID) references clientes(ID));"
                ); 
                stmt.executeUpdate(
                    "create table bioimpedancias (ID int unsigned, fecha_consulta date, masa_muscular int, masa_grasa int, agua int, metabolismo_basal int, edad_metabolica int, primary key(ID, fecha_consulta), foreign key(ID) references clientes(ID));"
                ); 
                stmt.executeUpdate(
                    "create table planes (plan_id int unsigned, nombre_plan varchar(15));"
                ); 
            }
                
                
            catch(SQLException sqle){
                System.out.println("No se pudo crear la base de datos.");
            }
        }

        try {
            conector.close();
        } catch (Exception sqle) {
            // TODO: handle exception
            System.out.println("Error cerrando la conexion");
        }
    }
    
}
