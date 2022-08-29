package com.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Contiene métodos que ejecutan algunos de los statements que se solicitan a la base de datos
 * @author diego
 */
public class Statements {
    private  String DBuser;
    private  String DBpwd;

    public Statements(String user, String psswd){
        this.DBuser = user;
        this.DBpwd = psswd;
    }

    /**
     * Devuelve el ID del último cliente introducido en la BD
     * @return ID
     */
    private int getLastClientID(){
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        String id = null;
        try{
            Statement stmt = connection.getConexion().createStatement();
            ResultSet rset = stmt.executeQuery("select max(ID) from clientes");

            while(rset.next()){
                id = rset.getString(1);
            }
            stmt.close();
            connection.cierraConexion();
        }
        catch(Exception sqle){
            System.out.println("Excepcion : " + sqle);
        }

        if(id == null){
            return 1;
        }else{
            return Integer.parseInt(id);
        }
    }

    /**
     * Introduce una nueva tupla en la relacion contactos
     * @param contacto_id
     * @param telefono
     * @param email
     */
    private void insertContacto(int contacto_id, int telefono, String email) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "insert into contactos() values (" + contacto_id + ", " + telefono + ", '" + email + "');"
        );
    }

    /**
     * Introduce una nueva tupla en la relacion residencias
     * @param residencia_id
     * @param municipio
     * @param provincia
     */
    private void insertResidencia(int residencia_id, String municipio, String provincia) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "insert into residencias() values (" + residencia_id + ", '" + municipio + "', '" + provincia + "');"
        );
    }

    /**
     * Introduce un nuevo cliente
     * @param nombre
     * @param apellidos
     * @param fecha_nacimiento
     * @param fecha_inicio
     * @param fecha_final
     * @param telefono
     * @param email
     * @param municipio
     * @param provincia
     * @param nombre_plan
     * @param bono 
     */
    public void insertCliente(String nombre, String apellidos, String fecha_nacimiento, String fecha_inicio, String fecha_final, int telefono, String email, String municipio, String provincia, String nombre_plan, int bono) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        int last_id;
        
        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "insert into clientes(nombre, apellidos, fecha_nacimiento, fecha_inicio)" +
            " values ('" + nombre + "', '" + apellidos + "', '" + fecha_nacimiento + "', '" + fecha_inicio + "');"
        );
        
        last_id = getLastClientID();
        insertContacto(last_id, telefono, email);
        insertResidencia(last_id, municipio, provincia);
        insertPlan(last_id, nombre_plan);
        if(bono != -1){
            insertBono(last_id, bono);
        }
        

    }
    
    /**
     * Actualiza los datos de un cliente
     * @param ID
     * @param nombre
     * @param apellidos
     * @param fecha_nacimiento
     * @param fecha_final
     * @param telefono
     * @param email
     * @param municipio
     * @param provincia
     * @param nombre_plan
     * @param bono 
     */
    public void updateCliente(int ID, String nombre, String apellidos, String fecha_nacimiento, String fecha_inicio, String fecha_final, int telefono, String email, String municipio, String provincia, String nombre_plan, int bono) throws SQLException{
        
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        if(fecha_final == null){
            Statement stmt = connection.getConexion().createStatement();
            //Crear las sentencias sql a añadir
            stmt.executeUpdate(
                "update clientes set nombre = '" + nombre + "', apellidos = '" + apellidos + "', fecha_nacimiento = '" + fecha_nacimiento + "', fecha_final =null, fecha_inicio = '" + fecha_inicio + "'" + 
                " where ID = " + ID + ";"
            );
        }else{
            Statement stmt = connection.getConexion().createStatement();
            //Crear las sentencias sql a añadir
            stmt.executeUpdate(
                "update clientes set nombre = '" + nombre + "', apellidos = '" + apellidos + "', fecha_nacimiento = '" + fecha_nacimiento + "', fecha_final = '" + fecha_final + "', fecha_inicio = '" + fecha_inicio + "'" +
                " where ID = " + ID + ";"
            );
        }
                
        updateTelefono(ID, telefono);
        updateEmail(ID, email);
        updateResidencia(ID, municipio, provincia);
        
        if(getPlan(ID) == null){
            insertPlan(ID, nombre_plan);
        }else{updatePlan(ID, nombre_plan);}
        
        if(getBono(ID) == null){
            if(bono != -1){
                insertBono(ID, bono);
            }
        }else{updateBono(ID, bono, null);}
    }

    /**
     * Actualiza el bono de un cliente
     * @param id
     * @param bono
     */
    public void updateBono(int id, int bono, String fechaInicio) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        if(bono >= 0){
            Statement stmt = connection.getConexion().createStatement();
            //Crear las sentencias sql a añadir
            stmt.executeUpdate(
                "update bonos set bono=" + bono + " where bonos_id=" + id
            );
            if(fechaInicio != null){
                stmt.executeUpdate(
                    "update bonos set fecha_inicio='" + fechaInicio + "' where bonos_id=" + id
                );
            }else{
                stmt.executeUpdate(
                    "update bonos set fecha_inicio=NULL where bonos_id=" + id
                );
            }
            
        }else{
             Statement stmt = connection.getConexion().createStatement();
            //Crear las sentencias sql a añadir
            stmt.executeUpdate(
                "update bonos set bono=0 where bonos_id=" + id
            );
            stmt.executeUpdate(
                "update bonos set fecha_inicio=NULL where bonos_id=" + id
            );
        }
    }

     /**
     * Introduce una nueva tupla en la relación bonos
     * @param bono_id
     * @param bono
     */
    private void insertBono(int bono_id, int bono) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        if(bono != 0){
            Statement stmt = connection.getConexion().createStatement();
            //Crear las sentencias sql a añadir
            stmt.executeUpdate(
                "insert into bonos(bonos_id, bono) values (" + bono_id + ", " + bono + ");"
            );
        }
    }

    /**
     * Devuelve el bono asociado al id
     * @param bono_id
     * @return 
     */
    public String getBono(int bono_id) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        String bono = null;
        
        Statement stmt = connection.getConexion().createStatement();
        ResultSet rset = stmt.executeQuery("select bono, fecha_inicio " +
                                            "from bonos " + 
                                            "where bonos.bonos_id = " + bono_id);

        while(rset.next()){

            bono = rset.getString(1);

        }
        stmt.close();
        connection.cierraConexion();
        
        return bono;
    }
    
    
     /**
     * Introduce una nueva tupla en la relación planes
     * @param plan_id
     * @param nombre_plan
     */
    private void insertPlan(int plan_id, String nombre_plan) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        if(nombre_plan != null){
            Statement stmt = connection.getConexion().createStatement();
            //Crear las sentencias sql a añadir
            stmt.executeUpdate(
                "insert into planes() values (" + plan_id + ", '" + nombre_plan + "');"
            );
        }
    }

    /**
     * Actualiza el plan de un cliente
     * @param plan_id
     * @param nombre_plan
     */
    private void updatePlan(int plan_id, String nombre_plan) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        if(nombre_plan != null){
            Statement stmt = connection.getConexion().createStatement();
            //Crear las sentencias sql a añadir
            stmt.executeUpdate(
                "update planes set nombre_plan='" + nombre_plan + "' where plan_id=" + plan_id
            );
        }else{
            Statement stmt = connection.getConexion().createStatement();
            //Crear las sentencias sql a añadir
            stmt.executeUpdate(
                "delete from planes where plan_id=" + plan_id
            );
        }
    }

    /**
     * Obtiene el plan de un paciente
     * @param plan_id
     * @return 
     */
    public String getPlan(int plan_id) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        String plan = null;
        
        Statement stmt = connection.getConexion().createStatement();
        ResultSet rset = stmt.executeQuery("select nombre_plan " +
                                            "from planes " + 
                                            "where planes.plan_id = " + plan_id);

        while(rset.next()){

            plan = rset.getString(1);

        }
        stmt.close();
        connection.cierraConexion();
        
        return plan;
    }
    
    /**
     * Actualizar el teléfono de un cliente
     * @param id
     * @param telefono
     */
    public void updateTelefono(int id, int telefono) throws SQLException {
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "update contactos set telefono=" + telefono + " where contacto_id=" + id
        );
    }
    
    /**
     * Actualiza el email de un cliente
     * @param id
     * @param email
     */
    public void updateEmail(int id, String email) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "update contactos set email='" + email + "' where contacto_id=" + id
        );
    }
    
    /**
     * Actualiza la residencia de un cliente
     * @param id
     * @param municipio
     * @param provincia
     */
    public void updateResidencia(int id, String municipio, String provincia) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        
        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "update residencias set municipio='" + municipio + "' where residencia_id=" + id
        );
        stmt.executeUpdate(
            "update residencias set provincia='" + provincia + "' where residencia_id=" + id
        );
    }

    /**
     * Añade nuevas medidas de un cliente
     * @param ID
     * @param fecha_consulta
     * @param peso
     * @param altura
     * @param cadera
     * @param cintura
     * @param muslo
     * @param brazo
     * @param wrist
     * @param tobillo
     * @param bajo_gluteo
     * @param pecho
     */
    public void insertMedidas(int ID, String fecha_consulta, int peso, int altura, int cadera, int cintura, int muslo, int brazo, int wrist, int tobillo, int bajo_gluteo, int pecho) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);

        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "insert into medidas() values (" + ID + ", '" + fecha_consulta + "', " + peso + ", " + altura + ", " + cadera + ", " + cintura + ", " + muslo + ", " + brazo + ", " + wrist + ", " + tobillo + ", " + bajo_gluteo + ", " + pecho + ");"
        );
        
        
    }

    /**
     * Añade las medidas de bioimpedancias de un cliente
     * @param ID
     * @param fecha_consulta
     * @param masa_muscular
     * @param masa_grasa
     * @param agua
     * @param metabolismo
     * @param edad_metabolica
     */
    public void insertBioimpedancias(int ID, String fecha_consulta, int masa_muscular, int masa_grasa, int agua, int metabolismo, int edad_metabolica) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "insert into bioimpedancias() values (" + ID + ", '" + fecha_consulta + "', " + masa_muscular + ", " + masa_grasa + ", " + agua + ", " + metabolismo + ", " + edad_metabolica + ");"
        );
    }

    /**
     * Modifica las medidas de una determinada consulta
     * @param ID
     * @param fecha_consulta
     * @param peso
     * @param altura
     * @param cadera
     * @param cintura
     * @param muslo
     * @param brazo
     * @param wrist
     * @param tobillo
     * @param bajo_gluteo
     * @param pecho
     */
    public void updateMedidas(int ID, String fecha_consulta, int peso, int altura, int cadera, int cintura, int muslo, int brazo, int wrist, int tobillo, int bajo_gluteo, int pecho) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
        Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "delete from medidas where ID=" + ID + " and fecha_consulta='" + fecha_consulta + "'" 
        );

        stmt.executeUpdate(
            "insert into medidas() values (" + ID + ", '" + fecha_consulta + "', " + peso + ", " + altura + ", " + cadera + ", " + cintura + ", " + muslo + ", " + brazo + ", " + wrist + ", " + tobillo + ", " + bajo_gluteo + ", " + pecho + ");"
        );
    }

    /**
     * Modifica las medidas de bioimpedancia de un paciente y de una cita concreta
     * @param ID
     * @param fecha_consulta
     * @param masa_muscular
     * @param masa_grasa
     * @param agua
     * @param metabolismo
     * @param edad_metabolica
     */
    public void updateBioimpedancias(int ID, String fecha_consulta, int masa_muscular, int masa_grasa, int agua, int metabolismo, int edad_metabolica) throws SQLException{
        DatabaseConnection connection = new DatabaseConnection(DBuser, DBpwd);
         Statement stmt = connection.getConexion().createStatement();
        //Crear las sentencias sql a añadir
        stmt.executeUpdate(
            "delete from bioimpedancias where ID=" + ID + " and fecha_consulta='" + fecha_consulta + "'" 
        );

        stmt.executeUpdate(
            "insert into bioimpedancias() values (" + ID + ", '" + fecha_consulta + "', " + masa_muscular + ", " + masa_grasa + ", " + agua + ", " + metabolismo + ", " + edad_metabolica + ");"
        );
    }

}
